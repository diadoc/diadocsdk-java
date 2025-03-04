package Diadoc.Api.document;

import Diadoc.Api.Proto.Documents.DocumentProtocolProtos;
import Diadoc.Api.Proto.Forwarding.ForwardedDocumentProtos;
import Diadoc.Api.Proto.Forwarding.ForwardingApiProtos;
import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.helpers.Tools;
import Diadoc.Api.httpClient.DiadocHttpClient;
import Diadoc.Api.print.models.DocumentProtocolResult;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Instant;
import java.util.Date;
import java.util.Optional;

import static Diadoc.Api.Proto.Documents.DocumentListProtos.DocumentList;
import static Diadoc.Api.Proto.Documents.DocumentProtos.Document;
import static Diadoc.Api.Proto.Documents.DocumentsMoveOperationProtos.DocumentsMoveOperation;
import static Diadoc.Api.Proto.Events.DiadocMessage_PostApiProtos.PrepareDocumentsToSignRequest;
import static Diadoc.Api.Proto.Events.DiadocMessage_PostApiProtos.PrepareDocumentsToSignResponse;
import static Diadoc.Api.Proto.SignatureInfoProtos.SignatureInfo;
import static Diadoc.Api.helpers.Tools.getForwardedDocumentIdParameters;

public class DocumentClient {
    private final DiadocHttpClient diadocHttpClient;

    public DocumentClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    public DocumentList getDocuments(DocumentsFilter filter) throws DiadocSdkException {
        if (filter.getBoxId() == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (filter.getFilterCategory() == null) {
            throw new IllegalArgumentException("filterCategory");
        }

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/V3/GetDocuments")
                    .addParameter("boxId", filter.getBoxId())
                    .addParameter("filterCategory", filter.getFilterCategory());

            if (!Tools.isNullOrEmpty(filter.getCounteragentBoxId())) {
                url.addParameter("counteragentBoxId", filter.getCounteragentBoxId());
            }

            var fromCsTicks = Optional.ofNullable(filter.getTimestampFromDateTime())
                    .map(Tools::toCsTicks)
                    .orElseGet(() -> Optional.ofNullable(filter.getTimestampFrom())
                            .map(t -> Tools.toCsTicks(t.toInstant()))
                            .orElse(null));

            var toCsTicks = Optional.ofNullable(filter.getTimestampToDateTime())
                    .map(Tools::toCsTicks)
                    .orElseGet(() -> Optional.ofNullable(filter.getTimestampTo())
                            .map(t -> Tools.toCsTicks(t.toInstant()))
                            .orElse(null));


            Tools.addParameterIfNotNull(url, "timestampToTicks", toCsTicks);
            Tools.addParameterIfNotNull(url,"timestampFromTicks", fromCsTicks);

            if (!Tools.isNullOrEmpty(filter.getFromDocumentDate())) {
                url.addParameter("fromDocumentDate", filter.getFromDocumentDate());
            }

            if (!Tools.isNullOrEmpty(filter.getToDocumentDate())) {
                url.addParameter("toDocumentDate", filter.getToDocumentDate());
            }
            if (!Tools.isNullOrEmpty(filter.getDepartmentId())) {
                url.addParameter("departmentId", filter.getDepartmentId());
            }

            if (filter.isExcludeSubdepartments()) {
                url.addParameter("excludeSubdepartments", null);
            }

            if (!Tools.isNullOrEmpty(filter.getSortDirection())) {
                url.addParameter("sortDirection", filter.getSortDirection());
            }

            if (filter.getAfterIndexKey() != null) {
                url.addParameter("afterIndexKey", filter.getAfterIndexKey());
            }

            Tools.addParameterIfNotNull(url, "count", filter.getCount());
            Tools.addParameterIfNotNull(url, "fromDepartmentId", filter.getFromDepartmentId());
            Tools.addParameterIfNotNull(url, "toDepartmentId", filter.getToDepartmentId());

            var request = RequestBuilder.get(url.build());

            return DocumentList.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated 
     * Use {@link #getDocuments(String, String, String, Instant, Instant, String, String, String, boolean, String, Integer)}
     */
    @Deprecated
    public DocumentList getDocuments(
            String boxId,
            String filterCategory,
            String counteragentBoxId,
            Date timestampFrom,
            Date timestampTo,
            String fromDocumentDate,
            String toDocumentDate,
            String departmentId,
            boolean excludeSubdepartments,
            String afterIndexKey,
            Integer count) throws DiadocSdkException {
        return getDocuments(new DocumentsFilter.Builder()
                .boxId(boxId)
                .filterCategory(filterCategory)
                .counteragentBoxId(counteragentBoxId)
                .timestampFrom(timestampFrom)
                .timestampTo(timestampTo)
                .fromDocumentDate(fromDocumentDate)
                .toDocumentDate(toDocumentDate)
                .departmentId(departmentId)
                .excludeSubdepartments(excludeSubdepartments)
                .afterIndexKey(afterIndexKey)
                .count(count)
                .build());
    }
    
    public DocumentList getDocuments(
            String boxId,
            String filterCategory,
            String counteragentBoxId,
            Instant timestampFromDateTime,
            Instant timestampToDateTime,
            String fromDocumentDate,
            String toDocumentDate,
            String departmentId,
            boolean excludeSubdepartments,
            String afterIndexKey,
            Integer count) throws DiadocSdkException {
        return getDocuments(new DocumentsFilter.Builder()
                .boxId(boxId)
                .filterCategory(filterCategory)
                .counteragentBoxId(counteragentBoxId)
                .timestampFromDateTime(timestampFromDateTime)
                .timestampToDateTime(timestampToDateTime)
                .fromDocumentDate(fromDocumentDate)
                .toDocumentDate(toDocumentDate)
                .departmentId(departmentId)
                .excludeSubdepartments(excludeSubdepartments)
                .afterIndexKey(afterIndexKey)
                .count(count)
                .build());
    }

    /**
     * @deprecated 
     * Use {@link #getDocuments(String, String, String, Instant, Instant, String, String, String, boolean, String, Integer)}
     */
    @Deprecated
    public DocumentList getDocuments(String boxId,
                                     String filterCategory,
                                     String counteragentBoxId,
                                     Date timestampFrom,
                                     Date timestampTo,
                                     String fromDocumentDate,
                                     String toDocumentDate,
                                     String departmentId,
                                     boolean excludeSubdepartments,
                                     String afterIndexKey) throws DiadocSdkException {
        return getDocuments(
                boxId,
                filterCategory,
                counteragentBoxId,
                timestampFrom,
                timestampTo,
                fromDocumentDate,
                toDocumentDate,
                departmentId,
                excludeSubdepartments,
                afterIndexKey,
                null);
    }

    public DocumentList getDocuments(String boxId,
                                     String filterCategory,
                                     String counteragentBoxId,
                                     Instant timestampFrom,
                                     Instant timestampTo,
                                     String fromDocumentDate,
                                     String toDocumentDate,
                                     String departmentId,
                                     boolean excludeSubdepartments,
                                     String afterIndexKey) throws DiadocSdkException {
        return getDocuments(
                boxId,
                filterCategory,
                counteragentBoxId,
                timestampFrom,
                timestampTo,
                fromDocumentDate,
                toDocumentDate,
                departmentId,
                excludeSubdepartments,
                afterIndexKey,
                null);
    }
    
    

    public Document getDocument(String boxId, String messageId, String entityId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (messageId == null) {
            throw new IllegalArgumentException("messageId");
        }
        if (entityId == null) {
            throw new IllegalArgumentException("entityId");
        }

        return getDocument(boxId, messageId, entityId, true);
    }


    public Document getDocument(String boxId, String messageId, String entityId, @Nullable Boolean injectEntityContent) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (messageId == null) {
            throw new IllegalArgumentException("messageId");
        }
        if (entityId == null) {
            throw new IllegalArgumentException("entityId");
        }

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/V3/GetDocument")
                            .addParameter("boxId", boxId)
                            .addParameter("messageId", messageId)
                            .addParameter("entityId", entityId);
            Tools.addParameterIfNotNull(url, "injectEntityContent", injectEntityContent);

            var request = RequestBuilder.get(url.build());
            return Document.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public void moveDocuments(DocumentsMoveOperation operation) throws DiadocSdkException {
        if (operation == null) {
            throw new IllegalArgumentException("operation");
        }
        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/MoveDocuments")
                            .build())
                    .setEntity(new ByteArrayEntity(operation.toByteArray()));
            diadocHttpClient.performRequest(request);
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public DocumentList getDocumentsByMessageId(String boxId, String messageId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (messageId == null) {
            throw new IllegalArgumentException("messageId");
        }
        try {
            var request = RequestBuilder.get(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GetDocumentsByMessageId")
                            .addParameter("boxId", boxId)
                            .addParameter("messageId", messageId)
                            .build());
            return DocumentList.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public PrepareDocumentsToSignResponse prepareDocumentsToSign(PrepareDocumentsToSignRequest documentsToSignRequest) throws DiadocSdkException {
        if (documentsToSignRequest == null) {
            throw new IllegalArgumentException("documentsToSignRequest");
        }

        return prepareDocumentsToSign(documentsToSignRequest, null);
    }

    public PrepareDocumentsToSignResponse prepareDocumentsToSign(PrepareDocumentsToSignRequest documentsToSignRequest, @Nullable Boolean excludeContent) throws DiadocSdkException {
        if (documentsToSignRequest == null) {
            throw new IllegalArgumentException("documentsToSignRequest");
        }

        if (excludeContent == null) {
            excludeContent = false;
        }

        try {
            var request = RequestBuilder.post(
                            new URIBuilder(diadocHttpClient.getBaseUrl())
                                    .setPath("/PrepareDocumentsToSign")
                                    .addParameter("excludeContent", excludeContent.toString())
                                    .build())
                    .setEntity(new ByteArrayEntity(documentsToSignRequest.toByteArray()));
            return PrepareDocumentsToSignResponse.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public byte[] getEntityContent(String currentBoxId, String messageId, String entityId) throws IOException, DiadocSdkException {
        if (currentBoxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (messageId == null) {
            throw new IllegalArgumentException("messageId");
        }
        if (entityId == null) {
            throw new IllegalArgumentException("entityId");
        }
        try {
            var request = RequestBuilder.get(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/V4/GetEntityContent")
                            .addParameter("boxId", currentBoxId)
                            .addParameter("messageId", messageId)
                            .addParameter("entityId", entityId)
                            .build());
            return diadocHttpClient.performRequest(request);
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public SignatureInfo getSignatureInfo(String boxId, String messageId, String entityId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (messageId == null) {
            throw new IllegalArgumentException("messageId");
        }
        if (entityId == null) {
            throw new IllegalArgumentException("entityId");
        }

        try {
            var request = RequestBuilder.get(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GetSignatureInfo")
                            .addParameter("boxId", boxId)
                            .addParameter("messageId", messageId)
                            .addParameter("entityId", entityId)
                            .build());
            return SignatureInfo.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public ForwardingApiProtos.ForwardDocumentResponse forwardDocument(String boxId, ForwardingApiProtos.ForwardDocumentRequest forwardDocumentRequest) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }

        if (forwardDocumentRequest == null) {
            throw new IllegalArgumentException("forwardDocumentRequest");
        }

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/V2/ForwardDocument")
                    .addParameter("boxId", boxId)
                    .build();
            var request = RequestBuilder.post(url)
                    .setEntity(new ByteArrayEntity(forwardDocumentRequest.toByteArray()));

            return ForwardingApiProtos.ForwardDocumentResponse.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public ForwardingApiProtos.GetForwardedDocumentsResponse getForwardedDocuments(String boxId, ForwardingApiProtos.GetForwardedDocumentsRequest fwdDocumentsRequest) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }

        if (fwdDocumentsRequest == null) {
            throw new IllegalArgumentException("fwdDocumentsRequest");
        }

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/V2/GetForwardedDocuments")
                    .addParameter("boxId", boxId)
                    .build();
            var request = RequestBuilder.post(url)
                    .setEntity(new ByteArrayEntity(fwdDocumentsRequest.toByteArray()));

            return ForwardingApiProtos.GetForwardedDocumentsResponse.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public byte[] getForwardedEntityContent(String boxId, ForwardedDocumentProtos.ForwardedDocumentId forwardedDocumentId, String entityId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }

        if (forwardedDocumentId == null) {
            throw new IllegalArgumentException("forwardedDocumentId");
        }

        if (entityId == null) {
            throw new IllegalArgumentException("entityId");
        }

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/V2/GetForwardedEntityContent")
                    .addParameter("boxId", boxId)
                    .addParameter("entityId", entityId)
                    .addParameters(getForwardedDocumentIdParameters(forwardedDocumentId));

            var request = RequestBuilder.get(url.build());

            return diadocHttpClient.performRequest(request);
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public DocumentProtocolResult generateForwardedDocumentProtocol(String boxId, ForwardedDocumentProtos.ForwardedDocumentId forwardedDocumentId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }

        if (forwardedDocumentId == null) {
            throw new IllegalArgumentException("forwardedDocumentId");
        }

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/V2/GenerateForwardedDocumentProtocol")
                    .addParameter("boxId", boxId)
                    .addParameters(getForwardedDocumentIdParameters(forwardedDocumentId))
                    .build();
            return getDocumentProtocolResult(url);

        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    @NotNull
    private DocumentProtocolResult getDocumentProtocolResult(URI url) throws IOException {
        var request = RequestBuilder.get(url);

        var response = diadocHttpClient.getResponse(request);

        var traceId = response.getTraceId();

        if (response.getRetryAfter() != null) {
            return DocumentProtocolResult.builder().withRetryAfter(response.getRetryAfter()).withTraceId(traceId).build();
        }
        else {
            var documentProtocol = DocumentProtocolProtos.DocumentProtocol.parseFrom(response.getContent());
            return DocumentProtocolResult.builder().withDocumentProtocol(documentProtocol).withTraceId(traceId).build();
        }
    }

    public DocumentProtocolResult generateForwardedDocumentProtocol(String boxId, String fromBoxId, String messageId, String documentId, String forwardEventId) throws DiadocSdkException {
        Tools.checkForwardedDocumentParameters(boxId, fromBoxId, messageId, documentId, forwardEventId);

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/V2/GenerateForwardedDocumentProtocol")
                    .addParameter("boxId", boxId)
                    .addParameter("fromBoxId", fromBoxId)
                    .addParameter("messageId", messageId)
                    .addParameter("documentId", documentId)
                    .build();

            return getDocumentProtocolResult(url);

        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public void restore(String boxId, String messageId, @Nullable String documentId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }

        if (messageId == null) {
            throw new IllegalArgumentException("messageId");
        }

        try {
            var uri = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/Restore")
                    .addParameter("boxId", boxId)
                    .addParameter("messageId", messageId);

            if (documentId != null) {
                uri.addParameter("documentId", documentId);
            }

            var request = RequestBuilder.post(uri.build());

            diadocHttpClient.performRequest(request);
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
}
