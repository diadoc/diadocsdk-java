package Diadoc.Api.shelf;

import Diadoc.Api.exceptions.DiadocException;
import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.helpers.System7Emu;
import com.google.gson.Gson;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

import static Diadoc.Api.helpers.Tools.getTraceId;

public class ShelfClient {
    private DiadocHttpClient diadocHttpClient;

    private static final int SHELF_PART_LENGTH = 512 * 1024;
    private static final int SHELF_MAX_ATTEMPTS = 3;
    private static final List<Integer> SHELF_NON_RETRIABLE_STATUS_CODES = Arrays.asList(HttpStatus.SC_UNAUTHORIZED, HttpStatus.SC_FORBIDDEN, HttpStatus.SC_PAYMENT_REQUIRED);
    private static final String SHELF_PATH_PREFIX = "__userId__";

    public ShelfClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    public int getShelfUploadChunkSize() {
        return SHELF_PART_LENGTH;
    }

    public int getShelfUploadMaxAttemptsCount() {
        return SHELF_MAX_ATTEMPTS;
    }

    /**
     * @deprecated Method is deprecated and is planned to delete
    * Information
     * <a href="https://developer.kontur.ru/docs/diadoc-api/http/removal/ShelfDownload.html">link to ShelfDownload</a>
     * Use {@link #shelfDownloadV2(String)}
     */
    public byte[] shelfDownload(String nameOnShelf) throws DiadocSdkException {
        if (!nameOnShelf.contains(SHELF_PATH_PREFIX))
            nameOnShelf = SHELF_PATH_PREFIX + "/" + nameOnShelf;
        try {
            var request = RequestBuilder.get(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/ShelfDownload")
                            .addParameter("nameOnShelf", nameOnShelf)
                            .build());
            return diadocHttpClient.performRequest(request);
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public byte[] shelfDownloadV2(String fileName) throws DiadocSdkException {
        try {
            var request = RequestBuilder.get(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/V2/ShelfDownload")
                            .addParameter("fileName", fileName)
                            .build());
            return diadocHttpClient.performRequest(request);
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated Method is deprecated and is planned to delete
    * Information
     * <a href="https://developer.kontur.ru/docs/diadoc-api/http/removal/ShelfUpload.html">link to ShelfUpload¶</a>
     * Use {@link #uploadLargeFileToShelf(byte[], String)}
     * Или {@link #uploadFileToShelfV2(byte[], String)}
     */
    public String uploadFileToShelf(byte[] data) throws DiadocSdkException {
        if (data == null)
            throw new IllegalArgumentException("data");

        var nameOnShelf = createNameOnShelf();
        var parts = splitDataIntoParts(data);
        List<Integer> missingParts = new ArrayList<>();

        for (int i = 0; i < parts.size(); i++)
            missingParts.add(i);

        var httpErrors = new ArrayList<Exception>();
        int attempts = 0;
        while (!missingParts.isEmpty()) {
            if (++attempts > SHELF_MAX_ATTEMPTS)
                throw new DiadocSdkException("Reached the limit of attempts to send a file. " + formatHttpErrors(httpErrors));

            int partsCount = parts.size();
            int lastPartIndex = partsCount - 1;
            //always add last part for stability
            if (!missingParts.contains(lastPartIndex))
                missingParts.add(lastPartIndex);

            try {
                missingParts = putMissingParts(nameOnShelf, parts, missingParts, partsCount, httpErrors);
            } catch (URISyntaxException | DiadocException | IOException e) {
                e.printStackTrace();
                throw new DiadocSdkException(e);
            }
        }
        return nameOnShelf;
    }

    public String uploadFileToShelfV2(byte[] content, @Nullable String fileExtension) throws DiadocSdkException, URISyntaxException, DiadocException {
        if (content == null)
            throw new IllegalArgumentException("content");

        var httpErrors = new ArrayList<Exception>();
        var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                .setPath("/V2/ShelfUpload")
                .addParameter("fileExtension", fileExtension);

        byte[] responseContent;
        for (var i = 0; i < SHELF_MAX_ATTEMPTS; i++)
        {
            try {
                var response = diadocHttpClient.getResponse(RequestBuilder.post(url.build()).setEntity(new ByteArrayEntity(content)));
                var traceId = response.getTraceId();
                if (response.getStatusCode() != HttpStatus.SC_OK) {
                    if (SHELF_NON_RETRIABLE_STATUS_CODES.contains(response.getStatusCode())) {
                        throw new DiadocException(formatResponseMessage(response.getReason(), response.getStatusCode(), traceId), response.getStatusCode(), null, traceId);
                    }

                    httpErrors.add(new DiadocException(formatResponseMessage(response.getReason(), response.getStatusCode(), traceId), response.getStatusCode(), null, traceId));
                }

                responseContent = response.getContent();
                if (responseContent == null || responseContent.length == 0) {
                    continue;
                }

                return new String(responseContent, StandardCharsets.UTF_8);
            }
            catch (IOException e) {
                httpErrors.add(e);
            }
        }

        throw new DiadocSdkException("Reached the limit of attempts to send a file. " + formatHttpErrors(httpErrors));
    }

    public String uploadLargeFileToShelf(byte[] content, @Nullable String fileExtension) throws DiadocSdkException, URISyntaxException, DiadocException {
        if (content == null)
            throw new IllegalArgumentException("content");

        var parts = splitDataIntoParts(content);
        List<Integer> missingParts = new ArrayList<>();

        for (int i = 0; i < parts.size(); i++)
            missingParts.add(i);

        var httpErrors = new ArrayList<Exception>();
        int attempts = 0;
        String fileName = null;

        while (!missingParts.isEmpty()) {
            if (++attempts > SHELF_MAX_ATTEMPTS){
                throw new DiadocSdkException("Reached the limit of attempts to send a file. " + formatHttpErrors(httpErrors));
            }

            int partsCount = parts.size();
            int lastPartIndex = partsCount - 1;
            //always add last part for stability
            if (!missingParts.contains(lastPartIndex))
                missingParts.add(lastPartIndex);

            try {
                if (fileName == null) {
                    fileName = shelfUploadPartInit(parts.get(0), missingParts, httpErrors, fileExtension);
                }

                if (fileName != null) {
                    missingParts = shelfUploadParts(fileName, parts, missingParts, httpErrors);
                }
            } catch (URISyntaxException | DiadocException e) {
                e.printStackTrace();
                throw new DiadocSdkException(e);
            }
        }
        return fileName;
    }

    private String shelfUploadPartInit(
            ByteArraySegment firstPart,
            List<Integer> missingParts,
            List<Exception> httpErrors,
            @Nullable String fileExtension) throws URISyntaxException, DiadocException {
        var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                .setPath("/ShelfUploadPartInit")
                .addParameter("fileExtension", fileExtension);
        if (missingParts.size() == 1)
        {
            url.addParameter("isLastPart", "true");
        }

        try
        {
            var response = diadocHttpClient.getResponse(RequestBuilder.post(url.build()).setEntity(new ByteArrayEntity(firstPart.getBytes())));
            if (response.getStatusCode() != HttpStatus.SC_OK) {
                var traceId = response.getTraceId();
                if (SHELF_NON_RETRIABLE_STATUS_CODES.contains(response.getStatusCode())) {
                    throw new DiadocException(formatResponseMessage(response.getReason(), response.getStatusCode(), traceId), response.getStatusCode(), null, traceId);
                }

                httpErrors.add(new DiadocException(formatResponseMessage(response.getReason(), response.getStatusCode(), traceId), response.getStatusCode(), null, traceId));
            }

            var responseContent = response.getContent();
            if (responseContent == null || responseContent.length == 0)
                return null;

            missingParts.remove(0);
            return new String(responseContent, StandardCharsets.UTF_8);

        } catch (IOException e) {
            httpErrors.add(e);
        }

        return null;
    }

    private List<Integer> shelfUploadParts(
            String fileName,
            List<ByteArraySegment> parts,
            List<Integer> missingParts,
            List<Exception> httpErrors) throws URISyntaxException, DiadocException {
        Set<Integer> lastMissingParts = new HashSet<>(missingParts);
        int maxProcessedPartIndex = -1;

        for (int partIndex : missingParts) {
            boolean isLastPart = partIndex == parts.size() - 1;
            List<Integer> newMissingParts = uploadPart(fileName, parts.get(partIndex), partIndex, isLastPart, httpErrors);
            if (newMissingParts != null) {
                if (partIndex > maxProcessedPartIndex) {
                    lastMissingParts.clear();
                    lastMissingParts.addAll(newMissingParts);

                    maxProcessedPartIndex = partIndex;
                }
            } else {
                lastMissingParts.add(partIndex);
            }
        }
        return new ArrayList<>(lastMissingParts);
    }

    private List<Integer> uploadPart(
            String fileName,
            ByteArraySegment part,
            Integer partIndex,
            Boolean isLast,
            List<Exception> httpErrors) throws URISyntaxException, DiadocException {
        var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                .setPath("/ShelfUploadPart")
                .addParameter("fileName", fileName)
                .addParameter("partIndex", Integer.toString(partIndex))
                .addParameter("isLastPart", Boolean.toString(isLast));

        byte[] responseContent;

        try {
            var response = diadocHttpClient.getResponse(RequestBuilder.post(url.build()).setEntity(new ByteArrayEntity(part.getBytes())));
            if (response.getStatusCode() != HttpStatus.SC_OK) {
                var traceId = response.getTraceId();
                if (SHELF_NON_RETRIABLE_STATUS_CODES.contains(response.getStatusCode())) {
                    throw new DiadocException(formatResponseMessage(response.getReason(), response.getStatusCode(), traceId), response.getStatusCode(), null, traceId);
                }

                httpErrors.add(new DiadocException(formatResponseMessage(response.getReason(), response.getStatusCode(), traceId), response.getStatusCode(), null, traceId));
                return null;
            }

            responseContent = response.getContent();

        } catch (IOException e) {
            httpErrors.add(e);
            return null;
        }

        if (responseContent == null || responseContent.length == 0)
            return null;

        String responseString = new String(responseContent, StandardCharsets.UTF_8);

        int[] missingParts = new Gson().fromJson(responseString, int[].class);
        return Arrays.stream(missingParts).boxed().collect(Collectors.toList());
    }

    private String createNameOnShelf() {
        return String.format("java_api-%s", UUID.randomUUID().toString().replaceAll("-", ""));
    }

    private List<Integer> putMissingParts(
            String nameOnShelf,
            List<ByteArraySegment> allParts,
            List<Integer> missingParts,
            int partsCount,
            List<Exception> httpErrors) throws URISyntaxException, DiadocException, IOException {
        Set<Integer> lastMissingParts = new HashSet<>(missingParts);
        int maxProcessedPartIndex = -1;

        for (int partIndex : missingParts) {
            boolean isLastPart = partIndex == partsCount - 1;
            List<Integer> newMissingParts = putPart(nameOnShelf, allParts.get(partIndex), partIndex, isLastPart, httpErrors);
            if (newMissingParts != null) {
                if (partIndex > maxProcessedPartIndex) {
                    lastMissingParts.clear();
                    lastMissingParts.addAll(newMissingParts);

                    maxProcessedPartIndex = partIndex;
                }
            } else {
                lastMissingParts.add(partIndex);
            }
        }
        return new ArrayList<>(lastMissingParts);
    }

    @Deprecated
    private List<Integer> putPart(String nameOnShelf, ByteArraySegment part, int partIndex, boolean isLastPart, List<Exception> httpErrors) throws URISyntaxException, DiadocException, IOException {
        var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                .setPath("/ShelfUpload")
                .addParameter("nameOnShelf", String.format("%s/%s", SHELF_PATH_PREFIX, nameOnShelf))
                .addParameter("partIndex", Integer.toString(partIndex));

        if (isLastPart) {
            url.addParameter("isLastPart", "1");
        }

        byte[] responseContent;

        try {
            var response = diadocHttpClient.getResponse(RequestBuilder.post(url.build()).setEntity(new ByteArrayEntity(part.getBytes())));
            if (response.getStatusCode() != HttpStatus.SC_OK) {
                var traceId = response.getTraceId();
                if (SHELF_NON_RETRIABLE_STATUS_CODES.contains(response.getStatusCode())) {
                    throw new DiadocException(formatResponseMessage(response.getReason(), response.getStatusCode(), traceId), response.getStatusCode(), null, traceId);
                }

                httpErrors.add(new DiadocException(formatResponseMessage(response.getReason(), response.getStatusCode(), traceId), response.getStatusCode(), null, traceId));
                return null;
            }

            responseContent = response.getContent();

        } catch (IOException e) {
            httpErrors.add(e);
            return null;
        }

        if (responseContent == null || responseContent.length == 0)
            return null;

        String responseString = new String(responseContent, StandardCharsets.UTF_8);

        int[] missingParts = new Gson().fromJson(responseString, int[].class);
        return Arrays.stream(missingParts).boxed().collect(Collectors.toList());
    }

    private ArrayList<ByteArraySegment> splitDataIntoParts(byte[] data) {
        ArrayList<ByteArraySegment> result = new ArrayList<>();
        int currentPartOffset = 0;
        while (currentPartOffset < data.length) {
            int length = Math.min(data.length - currentPartOffset, SHELF_PART_LENGTH);
            result.add(new ByteArraySegment(data, currentPartOffset, length));
            currentPartOffset += length;
        }
        return result;
    }

    private String formatResponseMessage(String reason, int statusCode, String traceId) {
        return String.format("Status code:%s%sMessage:%s%sTraceId: %s%s",
                statusCode, System7Emu.lineSeparator(),
                reason, System7Emu.lineSeparator(),
                traceId, System7Emu.lineSeparator());
    }

    private String formatHttpErrors(List<Exception> errors) {
        String text = super.toString();
        for (int i = 0; i < errors.size(); i++) {
            text = String.format("%s%s---> (Inner Exception #%s) %s%s%s", text, System7Emu.lineSeparator(), i, errors.get(i).toString(), "<---", System7Emu.lineSeparator());
        }
        return text;
    }
}
