package Diadoc.Api.print;

import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.print.models.DocumentProtocolResult;
import Diadoc.Api.print.models.DocumentZipResult;
import Diadoc.Api.print.models.PrintFormContent;
import Diadoc.Api.print.models.PrintFormResult;
import Diadoc.Api.helpers.Tools;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;

import javax.mail.internet.ParseException;
import java.io.IOException;
import java.net.URISyntaxException;

import static Diadoc.Api.Proto.CustomPrintFormDetectionProtos.*;
import static Diadoc.Api.Proto.Documents.DocumentProtocolProtos.*;
import static Diadoc.Api.Proto.Documents.DocumentZipProtos.*;

public class PrintFormClient {
    private DiadocHttpClient diadocHttpClient;

    public PrintFormClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    public PrintFormResult generatePrintForm(String boxId, String messageId, String documentId) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(boxId)) {
            throw new IllegalArgumentException("boxId");
        }
        if (Tools.isNullOrEmpty(messageId)) {
            throw new IllegalArgumentException("messageId");
        }
        if (Tools.isNullOrEmpty(documentId)) {
            throw new IllegalArgumentException("documentId");
        }

        try {
            var request = RequestBuilder.get(new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/GeneratePrintForm")
                    .addParameter("boxId", boxId)
                    .addParameter("messageId", messageId)
                    .addParameter("documentId", documentId)
                    .build());

            var response = diadocHttpClient.getRawResponse(request);

            if (response.getRetryAfter() != null) {
                return new PrintFormResult(response.getRetryAfter());
            }

            return new PrintFormResult(new PrintFormContent(response.getContentType(), response.getFileName(), response.getContent()));

        } catch (URISyntaxException | ParseException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public CustomPrintFormDetectionResult detectCustomPrintForms(String boxId, CustomPrintFormDetectionRequest detectionRequest) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(boxId)) {
            throw new IllegalArgumentException("boxId");
        }
        if (detectionRequest == null || detectionRequest.getDocumentIdsCount() == 0) {
            throw new IllegalArgumentException("detectionRequest");
        }
        try {
            var request = RequestBuilder.post(new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/DetectCustomPrintForms")
                    .addParameter("boxId", boxId)
                    .build())
                    .setEntity(new ByteArrayEntity(detectionRequest.toByteArray()));


            return CustomPrintFormDetectionResult.parseFrom(diadocHttpClient.performRequest(request));

        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public DocumentZipResult generateDocumentZip(String boxId, String messageId, String documentId, boolean fullDocflow) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(boxId)) {
            throw new IllegalArgumentException("boxId");
        }
        if (Tools.isNullOrEmpty(messageId)) {
            throw new IllegalArgumentException("messageId");
        }
        if (Tools.isNullOrEmpty(documentId)) {
            throw new IllegalArgumentException("documentId");
        }
        try {
            var request = RequestBuilder.get(new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/GenerateDocumentZip")
                    .addParameter("boxId", boxId)
                    .addParameter("messageId", messageId)
                    .addParameter("documentId", documentId)
                    .addParameter("fullDocflow", String.valueOf(fullDocflow))
                    .build());

            var response = diadocHttpClient.getRawResponse(request);

            if (response.getRetryAfter() != null) {
                return new DocumentZipResult(response.getRetryAfter());
            }

            return new DocumentZipResult(DocumentZipGenerationResult.parseFrom(response.getContent()));

        } catch (URISyntaxException | ParseException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public DocumentProtocolResult generateDocumentProtocol(String boxId, String messageId, String documentId) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(boxId)) {
            throw new IllegalArgumentException("boxId");
        }
        if (Tools.isNullOrEmpty(messageId)) {
            throw new IllegalArgumentException("messageId");
        }
        if (Tools.isNullOrEmpty(documentId)) {
            throw new IllegalArgumentException("documentId");
        }

        try {
            var request = RequestBuilder.get(new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/GenerateDocumentProtocol")
                    .addParameter("boxId", boxId)
                    .addParameter("messageId", messageId)
                    .addParameter("documentId", documentId)
                    .build());

            var response = diadocHttpClient.getRawResponse(request);

            if (response.getRetryAfter() != null) {
                return new DocumentProtocolResult(response.getRetryAfter());
            }

            return new DocumentProtocolResult(DocumentProtocol.parseFrom(response.getContent()));

        } catch (URISyntaxException | ParseException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public PrintFormResult generatePrintFormFromAttachment(String fromBoxId, String documentType, byte[] bytes) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(fromBoxId)) {
            throw new IllegalArgumentException("fromBoxId");
        }
        if (Tools.isNullOrEmpty(documentType)) {
            throw new IllegalArgumentException("documentType");
        }
        if (bytes == null) {
            throw new IllegalArgumentException("bytes");
        }

        try {
            var request = RequestBuilder.get(new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/GeneratePrintFormFromAttachment")
                    .addParameter("fromBoxId", fromBoxId)
                    .addParameter("documentType", documentType)
                    .build())
                    .setEntity(new ByteArrayEntity(bytes));

            var response = diadocHttpClient.getRawResponse(request);

            if (response.getRetryAfter() != null) {
                return new PrintFormResult(response.getRetryAfter());
            }

            return new PrintFormResult(new PrintFormContent(response.getContentType(), response.getFileName(), response.getContent()));

        } catch (URISyntaxException | ParseException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public PrintFormResult getGeneratedPrintForm(String printFormId) throws DiadocSdkException {
        try {
            var request = RequestBuilder.get(new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/GetGeneratedPrintForm")
                    .addParameter("printFormId", printFormId)
                    .build());

            var response = diadocHttpClient.getRawResponse(request);

            if (response.getRetryAfter() != null) {
                return new PrintFormResult(response.getRetryAfter());
            }

            return new PrintFormResult(new PrintFormContent(response.getContentType(), response.getFileName(), response.getContent()));

        } catch (URISyntaxException | ParseException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
}
