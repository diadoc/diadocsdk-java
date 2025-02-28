package Diadoc.Api.print;

import Diadoc.Api.Proto.Forwarding.ForwardedDocumentProtos;
import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.httpClient.DiadocResponseInfo;
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
import java.nio.charset.StandardCharsets;

import static Diadoc.Api.Proto.CustomPrintFormDetectionProtos.*;
import static Diadoc.Api.Proto.Documents.DocumentProtocolProtos.*;
import static Diadoc.Api.Proto.Documents.DocumentZipProtos.*;
import static Diadoc.Api.helpers.Tools.getForwardedDocumentIdParameters;

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
                return new PrintFormResult(response.getRetryAfter(), null, response.getTraceId());
            }

            return new PrintFormResult(0, new PrintFormContent(response.getContentType(), response.getFileName(), response.getContent()), response.getTraceId());

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
        validateInput(documentType, bytes);

        var response = executeGeneratePrintFormRequest(fromBoxId, documentType, bytes);

        return new PrintFormResult(
                0,
                new PrintFormContent(
                        response.getContentType(),
                        response.getFileName() != null ? response.getFileName() : "default",
                        response.getContent()
                ),
                response.getTraceId()
        );
    }

    public String generatePrintFormFromAttachmentId(String fromBoxId, String documentType, byte[] bytes) throws DiadocSdkException {
        validateInput(documentType, bytes);

        var response = executeGeneratePrintFormRequest(fromBoxId, documentType, bytes).getContent();

        return new String(response, StandardCharsets.UTF_8);
    }

    private void validateInput(String documentType, byte[] bytes) {
        if (Tools.isNullOrEmpty(documentType)) {
            throw new IllegalArgumentException("documentType");
        }
        if (bytes == null) {
            throw new IllegalArgumentException("bytes");
        }
    }

    private DiadocResponseInfo executeGeneratePrintFormRequest(String fromBoxId, String documentType, byte[] bytes) throws DiadocSdkException {
        try {
            var uri = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/GeneratePrintFormFromAttachment")
                    .addParameter("documentType", documentType);
            Tools.addParameterIfNotNull(uri, "fromBoxId", fromBoxId);

            var request = RequestBuilder.post(uri.build()).setEntity(new ByteArrayEntity(bytes));

            return diadocHttpClient.getRawResponse(request);

        } catch (URISyntaxException | ParseException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public PrintFormResult getGeneratedPrintForm(String printFormId) throws DiadocSdkException {
        if (printFormId == null) {
            throw new IllegalArgumentException("printFormId");
        }

        try {
            var request = RequestBuilder.get(new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/GetGeneratedPrintForm")
                    .addParameter("printFormId", printFormId)
                    .build());
            var response = diadocHttpClient.getResponse(request);
            return getPrintFormFromResponse(response);

        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }

    }


    public PrintFormResult generateForwardedDocumentPrintForm(String boxId, ForwardedDocumentProtos.ForwardedDocumentId forwardedDocumentId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }

        if (forwardedDocumentId == null) {
            throw new IllegalArgumentException("forwardedDocumentId");
        }


        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/GenerateForwardedDocumentPrintForm")
                    .addParameter("boxId", boxId)
                    .addParameters(getForwardedDocumentIdParameters(forwardedDocumentId))
                    .build();

            var request = RequestBuilder.get(url);
            var response = diadocHttpClient.getResponse(request);
            return getPrintFormFromResponse(response);

        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }

    }

    private PrintFormResult getPrintFormFromResponse(DiadocResponseInfo response){
        if (response.getRetryAfter() != null) {
            return new PrintFormResult(response.getRetryAfter(), null, response.getTraceId());
        }
        else {
            return new PrintFormResult(
                    0,
                    new PrintFormContent(response.getContentType(), response.getFileName(), response.getContent()),
                    response.getTraceId()
            );
        }
    }
}