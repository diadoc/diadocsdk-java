package Diadoc.Api.counteragentGroup;

import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;

import java.io.IOException;
import java.net.URISyntaxException;

import static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupProtos.CounteragentGroup;
import static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate;
import static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToUpdateProtos.CounteragentGroupToUpdate;

public class CounteragentGroupClient {
    private DiadocHttpClient diadocHttpClient;

    public CounteragentGroupClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    public CounteragentGroup createCounteragentGroup(String boxId, CounteragentGroupToCreate counteragentGroupToCreate) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (counteragentGroupToCreate == null) {
            throw new IllegalArgumentException("counteragentGroupToCreate");
        }

        try {
            var request = RequestBuilder.post(
                            new URIBuilder(diadocHttpClient.getBaseUrl())
                                    .setPath("/CreateCounteragentGroup")
                                    .addParameter("boxId", boxId)
                                    .build())
                    .setEntity(new ByteArrayEntity(counteragentGroupToCreate.toByteArray()));
            return CounteragentGroup.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public CounteragentGroup updateCounteragentGroup(String boxId, String counteragentGroupId, CounteragentGroupToUpdate counteragentGroupToUpdate) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (counteragentGroupId == null) {
            throw new IllegalArgumentException("counteragentGroupId");
        }
        if (counteragentGroupToUpdate == null) {
            throw new IllegalArgumentException("counteragentGroupToUpdate");
        }

        try {
            var request = RequestBuilder.post(
                            new URIBuilder(diadocHttpClient.getBaseUrl())
                                    .setPath("/UpdateCounteragentGroup")
                                    .addParameter("boxId", boxId)
                                    .addParameter("counteragentGroupId", counteragentGroupId)
                                    .build())
                    .setEntity(new ByteArrayEntity(counteragentGroupToUpdate.toByteArray()));
            return CounteragentGroup.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public void deleteCounteragentGroup(String boxId, String counteragentGroupId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (counteragentGroupId == null) {
            throw new IllegalArgumentException("counteragentGroupId");
        }

        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/DeleteCounteragentGroup")
                            .addParameter("boxId", boxId)
                            .addParameter("counteragentGroupId", counteragentGroupId)
                            .build());
            diadocHttpClient.performRequest(request);
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
}