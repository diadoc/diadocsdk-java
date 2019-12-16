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

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

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
        while (missingParts.size() > 0) {
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
                if (SHELF_NON_RETRIABLE_STATUS_CODES.contains(response.getStatusCode())) {
                    throw new DiadocException(formatResponseMessage(response.getReason(), response.getStatusCode()), response.getStatusCode());
                }

                httpErrors.add(new DiadocException(formatResponseMessage(response.getReason(), response.getStatusCode()), response.getStatusCode()));
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

    private String formatResponseMessage(String reason, int statusCode) {
        return String.format("Status code:%s%sMessage:%s%s",
                statusCode,
                System7Emu.lineSeparator(),
                reason,
                System7Emu.lineSeparator());
    }

    private String formatHttpErrors(List<Exception> errors) {
        String text = super.toString();
        for (int i = 0; i < errors.size(); i++) {
            text = String.format("%s%s---> (Inner Exception #%s) %s%s%s", text, System7Emu.lineSeparator(), i, errors.get(i).toString(), "<---", System7Emu.lineSeparator());
        }
        return text;
    }
}
