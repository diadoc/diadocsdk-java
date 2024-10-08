#addin "nuget:?package=Cake.Git&version=1.0.0"
using Cake.Common.Diagnostics;
using System.Text.RegularExpressions;
using System.Runtime.InteropServices;

var target = Argument("target", "Default");
var configuration = Argument("configuration", "Release");

var buildDir = new DirectoryPath("./target").MakeAbsolute(Context.Environment);
var protocLink = "https://github.com/google/protobuf/releases/download/v2.6.1/protoc-2.6.1-win32.zip";
var protocArchive = buildDir.CombineWithFilePath("protoc-2.6.1-win32.zip");
var protocBinDir = buildDir.Combine("protoc");
var protocExe = protocBinDir.CombineWithFilePath("protoc.exe");
var mvnTool = new [] { "mvn.cmd", "mvn.exe", "mvn" }.Select(x => Context.Tools.Resolve(x)).Where(x => x != null).FirstOrDefault();

//////////////////////////////////////////////////////////////////////
// TASKS
//////////////////////////////////////////////////////////////////////

Task("Clean")
	.Does(() =>
	{
		CleanDirectory(buildDir);
	});

Task("DownloadProtobuf")
	.WithCriteria(!FileExists(protocExe))
	.WithCriteria(!FileExists(protocArchive))
	.Does(() =>
	{
		CreateDirectory(protocArchive.GetDirectory());
		DownloadFile(protocLink, protocArchive);
	});

Task("ExtractProtobuf")
	.WithCriteria(!FileExists(protocExe))
	.IsDependentOn("DownloadProtobuf")
	.Does(() =>
	{
		Unzip(protocArchive, protocBinDir);
	});

Task("GenerateProtoFiles")
	.IsDependentOn("ExtractProtobuf")
	.Does(() =>
	{
		var sourceProtoDir = new DirectoryPath("./proto/").MakeAbsolute(Context.Environment);
		var destinationProtoDir = new DirectoryPath("./src/main/java/").MakeAbsolute(Context.Environment);

		var protoFiles = GetFiles("./proto/**/*.proto");
		var modifiedProtoDir = buildDir.Combine("modified_proto");
		var patchedProtoFiles = PatchJavaProtoFiles(protoFiles, sourceProtoDir, modifiedProtoDir);

		CompileProtoFiles(patchedProtoFiles, modifiedProtoDir, destinationProtoDir);
	});

Task("Generate-Version-Info")
	.Does(() =>
	{
		var clearVersion = ClearVersionTag(GetVersionFromTag()) ?? "1.0.0";
		var semanticVersion = GetSemanticVersionV2(clearVersion);

		if (!string.IsNullOrEmpty(clearVersion))
		{
			Information("Version from tag: {0}", clearVersion);
			Information("Semantic version: {0}", semanticVersion);
		}

		var xmlPokeSettings = new XmlPokeSettings
		{
			Namespaces = new Dictionary<string, string> {
				{ "mvn", "http://maven.apache.org/POM/4.0.0" },
        	}
		};
		XmlPoke(new FilePath("./pom.xml"), "/mvn:project/mvn:version", semanticVersion, xmlPokeSettings);

	});

Task("Check-Maven-Installed")
	.Does(() =>
	{
		if (mvnTool == null)
			throw new Exception($"mvn not found ({mvnTool})");
		var exitCode = StartProcess(mvnTool, "-v");
		if (exitCode != 0)
			throw new Exception($"{mvnTool} -v failed, exitCode=" + exitCode);
	});

Task("Package-With-Maven")
	.IsDependentOn("Generate-Version-Info")
	.IsDependentOn("Check-Maven-Installed")
	.IsDependentOn("GenerateProtoFiles")
	.Does(() =>
	{
		var exitCode = StartProcess(mvnTool, "-Dhttps.protocols=TLSv1.2 package");
		if (exitCode != 0)
			throw new Exception("mvn package exit code = " + exitCode);
	});


//////////////////////////////////////////////////////////////////////
// TASK TARGETS
//////////////////////////////////////////////////////////////////////
Task("Default")
	.IsDependentOn("Package-With-Maven");

//////////////////////////////////////////////////////////////////////
// EXECUTION
//////////////////////////////////////////////////////////////////////

RunTarget(target);

//////////////////////////////////////////////////////////////////////
// HELPERS
//////////////////////////////////////////////////////////////////////

public ProcessSettings GetBuildCMakeSettings()
{
	var cmakeBuildSettings = new ProcessSettings()
		.WithArguments(x => x
			.AppendSwitchQuoted("--build", buildDir.FullPath)
			.AppendSwitch("--config", configuration));

	return cmakeBuildSettings;
}

public IEnumerable<FilePath> PatchJavaProtoFiles(IEnumerable<FilePath> files, DirectoryPath sourceProtoDir, DirectoryPath destinationProtoDir)
{
	foreach (var file in files)
	{
		var relativeFile = sourceProtoDir.GetRelativePath(file);
		var destinationFile = destinationProtoDir.CombineWithFilePath(relativeFile);
		var destinationDirectory = destinationFile.GetDirectory();
		if (!DirectoryExists(destinationDirectory))
			CreateDirectory(destinationDirectory);

		CopyFile(file, destinationFile);
		var javaOuterClassName = relativeFile.GetFilenameWithoutExtension().FullPath
			.Replace("-", "_")
			.Replace(".", "_");
		System.IO.File.AppendAllText(destinationFile.FullPath, string.Format("\n\noption java_outer_classname = \"{0}Protos\";", javaOuterClassName));
		yield return destinationFile;
	}
}

public void CompileProtoFiles(IEnumerable<FilePath> files, DirectoryPath sourceProtoDir, DirectoryPath destinationProtoDir)
{
	CreateDirectory(destinationProtoDir);

	var protocArguments = new ProcessSettings()
		.WithArguments(args => args
			.Append("-I=" + sourceProtoDir.FullPath)
			.Append("--java_out=" + destinationProtoDir.FullPath));

	foreach (var file in files)
	{
		protocArguments.WithArguments(args => args.Append(file.FullPath));
	}

	if (RuntimeInformation.IsOSPlatform(OSPlatform.Linux))
	{
		protocExe = "protoc";
	}

	var exitCode = StartProcess(protocExe, protocArguments);
	if (exitCode != 0)
	{
		throw new Exception($"Error processing proto files, protoc exit code: {exitCode} ({protocArguments})");
	}
}

public string GetVersionFromTag()
{
	var lastestTag = "";

	if (BuildSystem.GitHubActions.IsRunningOnGitHubActions)
	{
		var workflow = BuildSystem.GitHubActions.Environment.Workflow;
		if(EnvironmentVariable("github_ref_type") == "tag")
		{
			return workflow.Ref.Replace("refs/tags/", "");
		}
	}

	if (string.IsNullOrEmpty(lastestTag))
	{
		try
		{
			lastestTag = GitDescribe(".", false, GitDescribeStrategy.Tags);
		}
		catch (Exception ex)
		{
			Warning(ex.Message, new object[] {});
		}
	}

	return lastestTag;
}

public static string ClearVersionTag(string lastestTag)
{
	if (string.IsNullOrEmpty(lastestTag))
		return null;

	if (lastestTag.StartsWith("versions/"))
	{
		lastestTag = lastestTag.Substring("versions/".Length);
	}

	var match = Regex.Match(lastestTag, @"^([0-9]+.[0-9]+.[0-9]*)");
	return match.Success
		? match.Value
		: lastestTag;
}

public string GetSemanticVersionV2(string clearVersion)
{
	if (BuildSystem.GitHubActions.IsRunningOnGitHubActions)
	{
		var workflow = BuildSystem.GitHubActions.Environment.Workflow;
		if(EnvironmentVariable("github_ref_type") == "tag")
		{
			return clearVersion;
		}
		
		var buildNumber = workflow.RunNumber;
		return $"{clearVersion}-CI{buildNumber}";
	}

	var currentDate = DateTime.Now;
	var daysPart = (currentDate - new DateTime(2010, 01, 01)).Days;
	var secondsPart = Math.Floor((currentDate - currentDate.Date).TotalSeconds/2);
	return string.Format("{0}-dev.{1}.{2}", clearVersion, daysPart, secondsPart);
}
