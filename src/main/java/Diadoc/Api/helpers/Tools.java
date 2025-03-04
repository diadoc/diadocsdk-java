package Diadoc.Api.helpers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import Diadoc.Api.Constants.Headers;
import Diadoc.Api.Proto.Forwarding.ForwardedDocumentProtos;
import com.google.protobuf.ByteString;
import org.apache.http.HttpResponse;
import org.apache.http.client.utils.URIBuilder;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.jetbrains.annotations.Nullable;

public class Tools {

    /**
     * See https://msdn.microsoft.com/en-us/library/system.datetime.ticks.aspx
     * for information about ticks.
     */
    private static final Instant TIME_REFERENCE =
            LocalDateTime.of(LocalDate.of(1, 1, 1), LocalTime.MIDNIGHT)
                    .atZone(ZoneOffset.UTC)
                    .toInstant();
    private static final long NANOS_PER_TICK = 100;
    private static final long NANOS_PER_SECOND = TimeUnit.SECONDS.toNanos(1);
    private static final long TICKS_PER_SECOND = NANOS_PER_SECOND / NANOS_PER_TICK;


    public static String ConsoleReadLine() throws IOException {
        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);
        return in.readLine();
    }

    public static boolean isNullOrEmpty(String s) {
        return s == null || (s.isEmpty());
    }

    /**
     * @deprecated
     * Use {@link #toCsTicks(Instant)} or {@link #toCsTicks(Duration)}
     */
    @Deprecated
    public static long toCsTicks(long time) {
        return 621355968000000000L + time * 10000;
    }

    public static long toCsTicks(Instant instant) {
        return toCsTicks(Duration.between(TIME_REFERENCE, instant));
    }

    public static long toCsTicks(Duration duration) {
        // Split to seconds and nanos to avoid overflow in Duration.toNanos()
        // Duration.toMillis() can't be used
        final long seconds = duration.getSeconds();
        final int nanos = duration.getNano();
        return seconds * TICKS_PER_SECOND + nanos / NANOS_PER_TICK;
    }


    public static void WriteAllBytes(String getEntityDestinationPath,
                                     ByteString data) throws IOException {
        WriteAllBytes(getEntityDestinationPath, data.toByteArray());
    }

    public static void WriteAllBytes(String getEntityDestinationPath,
                                     byte[] data) throws IOException {

        var file = new File(getEntityDestinationPath).getAbsoluteFile();
        var parentDir = file.getParentFile();

        if (parentDir != null) {
            parentDir.mkdirs();
        }

        try (FileOutputStream fos = new FileOutputStream(file, false)) {
            fos.write(data);
        }
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

    public static void addParameterIfNotNull(URIBuilder urlBuilder, String paramName, Object paramValue) {
        if (paramValue != null) {
            urlBuilder.addParameter(paramName, String.valueOf(paramValue));
        }
    }

    public static void addParameterIfNotNull(URIBuilder urlBuilder, String paramName, Enum<?> paramValue) {
        if (paramValue != null) {
            urlBuilder.addParameter(paramName, paramValue.name());
        }
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

    public static List<NameValuePair> getForwardedDocumentIdParameters(ForwardedDocumentProtos.ForwardedDocumentId forwardedDocumentId) {
        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("fromBoxId", forwardedDocumentId.getFromBoxId()));
        params.add(new BasicNameValuePair("messageId", forwardedDocumentId.getDocumentId().getMessageId()));
        params.add(new BasicNameValuePair("documentId", forwardedDocumentId.getDocumentId().getEntityId()));
        params.add(new BasicNameValuePair("forwardEventId", forwardedDocumentId.getForwardEventId()));
        return params;
    }

    @Nullable
    public static String getTraceId(HttpResponse response) {
        var traceIdHeader = response.getFirstHeader(Headers.X_KONTUR_TRACE_ID);
        return traceIdHeader != null ? traceIdHeader.getValue() : null;
    }

}
