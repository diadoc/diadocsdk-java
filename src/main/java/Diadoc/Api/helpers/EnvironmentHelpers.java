package Diadoc.Api.helpers;

import Diadoc.Api.DiadocApi;

public class EnvironmentHelpers {

    public static String getUserAgentString() {
        return getDiadocSdkVersion() + ";" + getJavaRuntimeVersion();
    }

    private static String getDiadocSdkVersion() {
        try {
            Package currentPackage = DiadocApi.class.getPackage();
            String version = currentPackage.getSpecificationVersion();
            if (version == null || version.length() == 0)
                version = currentPackage.getImplementationVersion();
            if (version == null || version.length() == 0)
                version = "Unknown";
            return "Diadoc SDK for Java v" + version;
        } catch (Exception e) {
            return "Diadoc SDK for Java";
        }
    }

    private static String getJavaRuntimeVersion() {
        return "JRE=" + System.getProperty("java.version")
                + ";Vendor=" + System.getProperty("java.vendor")
                + ";OS=" + System.getProperty("os.name") + " v" + System.getProperty("os.version")
                + ";Arch=" + System.getProperty("os.arch");
    }
}
