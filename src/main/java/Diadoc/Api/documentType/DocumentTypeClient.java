package Diadoc.Api.documentType;

import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.helpers.Tools;
import Diadoc.Api.httpClient.DiadocHttpClient;
import Diadoc.Api.httpClient.FileContent;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;

import java.io.IOException;
import java.net.URISyntaxException;

import static Diadoc.Api.Proto.Documents.DetectTitleResponseProtos.DetectTitleResponse;
import static Diadoc.Api.Proto.Documents.Types.DocumentTypeDescriptionProtos.DetectDocumentTypesResponse;
import static Diadoc.Api.Proto.Documents.Types.DocumentTypeDescriptionV2Protos.GetDocumentTypesResponseV2;

public class DocumentTypeClient {
    public DiadocHttpClient diadocHttpClient;

    public DocumentTypeClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    public GetDocumentTypesResponseV2 getDocumentTypesV2(String boxId) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(boxId)) {
            throw new IllegalArgumentException("boxId");
        }
        try {
            var request = RequestBuilder.get(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/V2/GetDocumentTypes")
                            .addParameter("boxId", boxId)
                            .build());
            return GetDocumentTypesResponseV2.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #detectDocumentTitles(String, String)}
     */
    @Deprecated
    public DetectDocumentTypesResponse detectDocumentTypes(String boxId, String nameOnShelf) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(boxId)) {
            throw new IllegalArgumentException("boxId");
        }
        if (Tools.isNullOrEmpty(nameOnShelf)) {
            throw new IllegalArgumentException("nameOnShelf");
        }

        try {
            var request = RequestBuilder.get(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/DetectDocumentTypes")
                            .addParameter("boxId", boxId)
                            .addParameter("nameOnShelf", nameOnShelf)
                            .build());
            return DetectDocumentTypesResponse.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }

    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #detectDocumentTitles(String, byte[])}
     */
    @Deprecated
    public DetectDocumentTypesResponse detectDocumentTypes(String boxId, byte[] content) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(boxId)) {
            throw new IllegalArgumentException("boxId");
        }
        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/DetectDocumentTypes")
                            .addParameter("boxId", boxId)
                            .build())
                    .setEntity(new ByteArrayEntity(content));
            return DetectDocumentTypesResponse.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public FileContent getContent(String typeNamedId, String function, String version, int titleIndex, XsdContentType contentType) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(typeNamedId)) {
            throw new IllegalArgumentException("typeNamedId");
        }
        if (Tools.isNullOrEmpty(function)) {
            throw new IllegalArgumentException("function");
        }
        if (Tools.isNullOrEmpty(version)) {
            throw new IllegalArgumentException("version");
        }
        if (titleIndex < 0) {
            throw new IllegalArgumentException("titleIndex should be non-negative");
        }
        try {
            var request = RequestBuilder.get(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GetContent")
                            .addParameter("typeNamedId", typeNamedId)
                            .addParameter("function", function)
                            .addParameter("version", version)
                            .addParameter("titleIndex", Integer.toString(titleIndex))
                            .addParameter("contentType", contentType.name())
                            .build());
            return diadocHttpClient.performRequestWithFileContent(request);
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public FileContent getContent(String typeNamedId, String function, String version, int titleIndex) throws DiadocSdkException {
        return getContent(typeNamedId, function, version, titleIndex, XsdContentType.TitleXsd);
    }

    public DetectTitleResponse detectDocumentTitles(String boxId, String nameOnShelf) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(boxId)) {
            throw new IllegalArgumentException("boxId");
        }
        if (Tools.isNullOrEmpty(nameOnShelf)) {
            throw new IllegalArgumentException("nameOnShelf");
        }

        try {
            var request = RequestBuilder.get(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/DetectDocumentTitles")
                            .addParameter("boxId", boxId)
                            .addParameter("nameOnShelf", nameOnShelf)
                            .build());
            return DetectTitleResponse.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public DetectTitleResponse detectDocumentTitles(String boxId, byte[] content) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(boxId)) {
            throw new IllegalArgumentException("boxId");
        }

        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/DetectDocumentTitles")
                            .addParameter("boxId", boxId)
                            .build())
                    .setEntity(new ByteArrayEntity(content));
            return DetectTitleResponse.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
}
