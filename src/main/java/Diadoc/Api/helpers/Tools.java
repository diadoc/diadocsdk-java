package Diadoc.Api.helpers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import com.google.protobuf.ByteString;

public class Tools {
    public static String ConsoleReadLine() throws IOException {
        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);
        return in.readLine();
    }

    public static boolean isNullOrEmpty(String s) {
        if (s == null || (s.length() == 0))
            return true;
        return false;
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

    public static void checkForwardedDocumentParameters(String boxId, String fromBoxId, String messageId, String documentId, String forwardEventId) {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }

        if (fromBoxId == null) {
            throw new IllegalArgumentException("fromBoxId");
        }

        if (messageId == null) {
            throw new IllegalArgumentException("messageId");
        }

        if (documentId == null) {
            throw new IllegalArgumentException("documentId");
        }

        if (forwardEventId == null) {
            throw new IllegalArgumentException("forwardEventId");
        }
    }
}
