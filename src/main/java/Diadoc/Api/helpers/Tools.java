package Diadoc.Api.helpers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.regex.Pattern;

import com.google.protobuf.ByteString;

public class Tools {
    private static final Pattern UUID_PATTERN = Pattern.compile("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$");

    public static String ConsoleReadLine() throws IOException {
        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);
        return in.readLine();
    }

    public static boolean isNullOrEmpty(String s) {
        return s == null || (s.isEmpty());
    }

    public static boolean isUUIDString(String s) {
        return s != null && UUID_PATTERN.matcher(s).matches();
    }

    public static long toCsTicks(long time) {
        return 621355968000000000L + time * 10000;
    }

    public static void WriteAllBytes(String getEntityDestinationPath,
                                     ByteString data) throws IOException {
        WriteAllBytes(getEntityDestinationPath, data.toByteArray());
    }

    public static void WriteAllBytes(String getEntityDestinationPath,
                                     byte[] data) throws IOException {

        File f = new File(new File(new File(getEntityDestinationPath).getAbsolutePath()).getParent());
        f.mkdirs();

        FileOutputStream fos = new FileOutputStream(new File(getEntityDestinationPath), false);
        fos.write(data);
        fos.close();
    }

    public static byte[] GenerateRandomBytes(int size) {
        Random rnd = new Random();
        byte[] result = new byte[size];
        rnd.nextBytes(result);
        return result;
    }

    public static String concatUriPath(String prefixPath, String postfixPath) {
        return prefixPath.replaceAll("/*$", "") + postfixPath;
    }
}
