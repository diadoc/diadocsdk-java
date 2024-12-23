package Diadoc.Api.docflow;

import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.helpers.Tools;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;

import java.io.IOException;
import java.net.URISyntaxException;

import static Diadoc.Api.Proto.Docflow.DocflowApiProtos.*;
import static Diadoc.Api.Proto.Docflow.DocflowApiV3Protos.*;

public class DocflowClient {
    private DiadocHttpClient diadocHttpClient;

    public DocflowClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    public SearchDocflowsResponse searchDocflows(String boxId, SearchDocflowsRequest searchDocflowsRequest) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(boxId)) {
            throw new IllegalArgumentException("boxId");
        }
        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/SearchDocflows")
                            .addParameter("boxId", boxId)
                            .build())
                    .setEntity(new ByteArrayEntity(searchDocflowsRequest.toByteArray()));
            return SearchDocflowsResponse.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #getDocflowsByPacketIdV3(String, GetDocflowsByPacketIdRequest)}
     */
    @Deprecated
    public GetDocflowsByPacketIdResponse getDocflowsByPacketId(String boxId, GetDocflowsByPacketIdRequest packetIdRequest) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(boxId)) {
            throw new IllegalArgumentException("boxId");
        }
        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/V2/GetDocflowsByPacketId")
                            .addParameter("boxId", boxId)
                            .build())
                    .setEntity(new ByteArrayEntity(packetIdRequest.toByteArray()));
            return GetDocflowsByPacketIdResponse.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public GetDocflowBatchResponseV3 getDocflows(String boxId, GetDocflowBatchRequest getDocflowBatchRequest) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(boxId)) {
            throw new IllegalArgumentException("boxId");
        }
        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/V3/GetDocflows")
                            .addParameter("boxId", boxId)
                            .build())
                    .setEntity(new ByteArrayEntity(getDocflowBatchRequest.toByteArray()));
            return GetDocflowBatchResponseV3.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public GetDocflowEventsResponseV3 getDocflowEvents(String boxId, GetDocflowEventsRequest getDocflowEventsRequest) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(boxId)) {
            throw new IllegalArgumentException("boxId");
        }
        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/V3/GetDocflowEvents")
                            .addParameter("boxId", boxId)
                            .build())
                    .setEntity(new ByteArrayEntity(getDocflowEventsRequest.toByteArray()));
            return GetDocflowEventsResponseV3.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public SearchDocflowsResponseV3 searchDocflowsV3(String boxId, SearchDocflowsRequest docflowsRequest) throws IOException, DiadocSdkException {
        if (Tools.isNullOrEmpty(boxId)) {
            throw new IllegalArgumentException("boxId");
        }
        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/V3/SearchDocflows")
                            .addParameter("boxId", boxId)
                            .build())
                    .setEntity(new ByteArrayEntity(docflowsRequest.toByteArray()));
            return SearchDocflowsResponseV3.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public GetDocflowsByPacketIdResponseV3 getDocflowsByPacketIdV3(String boxId, GetDocflowsByPacketIdRequest docflowsByPacketIdRequest) throws IOException, DiadocSdkException {
        if (Tools.isNullOrEmpty(boxId)) {
            throw new IllegalArgumentException("boxId");
        }
        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/V3/GetDocflowsByPacketId")
                            .addParameter("boxId", boxId)
                            .build())
                    .setEntity(new ByteArrayEntity(docflowsByPacketIdRequest.toByteArray()));
            return GetDocflowsByPacketIdResponseV3.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
}
