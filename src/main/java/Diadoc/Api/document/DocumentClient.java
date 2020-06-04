package Diadoc.Api.document;

import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.helpers.Tools;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

import static Diadoc.Api.Proto.Documents.DocumentListProtos.DocumentList;
import static Diadoc.Api.Proto.Documents.DocumentProtos.Document;
import static Diadoc.Api.Proto.Documents.DocumentsMoveOperationProtos.DocumentsMoveOperation;
import static Diadoc.Api.Proto.Events.DiadocMessage_PostApiProtos.PrepareDocumentsToSignRequest;
import static Diadoc.Api.Proto.Events.DiadocMessage_PostApiProtos.PrepareDocumentsToSignResponse;
import static Diadoc.Api.Proto.SignatureInfoProtos.SignatureInfo;

public class DocumentClient {
    private DiadocHttpClient diadocHttpClient;

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

            if (filter.getTimestampFrom() != null) {
                var fromTicks = Tools.toCsTicks(filter.getTimestampFrom().getTime());
                url.addParameter("timestampFromTicks", Long.toString(fromTicks));
            }

            if (filter.getTimestampTo() != null) {
                var toTicks = Tools.toCsTicks(filter.getTimestampTo().getTime());
                url.addParameter("timestampToTicks", Long.toString(toTicks));
            }

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
            if (filter.getCount() != null) {
                url.addParameter("count", filter.getCount().toString());
            }

            var request = RequestBuilder.get(url.build());

            return DocumentList.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

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
        return getDocuments(new DocumentsFilter()
                .setBoxId(boxId)
                .setFilterCategory(filterCategory)
                .setCounteragentBoxId(counteragentBoxId)
                .setTimestampFrom(timestampFrom)
                .setTimestampTo(timestampTo)
                .setFromDocumentDate(fromDocumentDate)
                .setToDocumentDate(toDocumentDate)
                .setDepartmentId(departmentId)
                .setExcludeSubdepartments(excludeSubdepartments)
                .setAfterIndexKey(afterIndexKey)
                .setCount(count));
    }

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

        try {
            var request = RequestBuilder.get(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/V3/GetDocument")
                            .addParameter("boxId", boxId)
                            .addParameter("messageId", messageId)
                            .addParameter("entityId", entityId)
                            .build());
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

        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/PrepareDocumentsToSign")
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


}
