package Diadoc.Api.counteragentGroup;

import Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos;
import Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupProtos;
import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.helpers.Tools;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.net.URISyntaxException;

import static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupProtos.CounteragentGroup;
import static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupProtos.CounteragentGroupsList;
import static Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse;
import static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate;
import static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToUpdateProtos.CounteragentGroupToUpdate;

public class CounteragentGroupClient {
    private DiadocHttpClient diadocHttpClient;

    public CounteragentGroupClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    public CounteragentGroup createCounteragentGroup(String boxId, CounteragentGroupToCreate counteragentGroupToCreate) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(boxId)) {
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
        if (Tools.isNullOrEmpty(boxId)) {
            throw new IllegalArgumentException("boxId");
        }
        if (Tools.isNullOrEmpty(counteragentGroupId)) {
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
        if (Tools.isNullOrEmpty(boxId)) {
            throw new IllegalArgumentException("boxId");
        }
        if (Tools.isNullOrEmpty(counteragentGroupId)) {
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

    public CounteragentGroup getCounteragentGroup(String boxId, String counteragentGroupId) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(boxId)) {
            throw new IllegalArgumentException("boxId");
        }
        if (Tools.isNullOrEmpty(counteragentGroupId)) {
            throw new IllegalArgumentException("counteragentGroupId");
        }

        try {
            var request = RequestBuilder
                    .get(new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GetCounteragentGroup")
                            .addParameter("boxId", boxId)
                            .addParameter("counteragentGroupId", counteragentGroupId)
                            .build());
            return CounteragentGroup.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public CounteragentGroupsList getCounteragentGroups(String boxId, @Nullable Integer page, @Nullable Integer count) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(boxId)) {
            throw new IllegalArgumentException("boxId");
        }
        if(page != null && page < 1) {
            throw new IllegalArgumentException("page must be 1 or greater");
        }
        if(count != null && count < 1) {
            throw new IllegalArgumentException("count must be 1 or greater");
        }

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/GetCounteragentGroups")
                    .addParameter("boxId", boxId);

            if (page != null) {
                url.addParameter("page", Integer.toString(page));
            }

            if (count != null) {
                url.addParameter("count", Integer.toString(count));
            }

            var request = RequestBuilder.get(url.build());
            return CounteragentGroupProtos.CounteragentGroupsList.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public void addCounteragentToGroup(String boxId, String counteragentBoxId, String counteragentGroupId) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(boxId)) {
            throw new IllegalArgumentException("boxId");
        }
        if (Tools.isNullOrEmpty(counteragentBoxId)) {
            throw new IllegalArgumentException("counteragentBoxId");
        }
        if (Tools.isNullOrEmpty(counteragentGroupId)) {
            throw new IllegalArgumentException("counteragentGroupId");
        }

        try {
            var request = RequestBuilder.post(
                            new URIBuilder(diadocHttpClient.getBaseUrl())
                                    .setPath("/AddCounteragentToGroup")
                                    .addParameter("boxId", boxId)
                                    .addParameter("counteragentBoxId", counteragentBoxId)
                                    .addParameter("counteragentGroupId", counteragentGroupId)
                                    .build());
            diadocHttpClient.performRequest(request);
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public CounteragentFromGroupResponse getCounteragentsFromGroup(String boxId, String counteragentGroupId, @Nullable Integer count, @Nullable String afterIndexKey) throws DiadocSdkException {
        if(boxId == null) {
            throw new IllegalArgumentException("boxId");
        }

        if(counteragentGroupId == null) {
            throw new IllegalArgumentException("counteragentGroupId");
        }

        if(count != null && count < 1) {
            throw new IllegalArgumentException("count must be 1 or greater");
        }

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/GetCounteragentsFromGroup")
                    .addParameter("boxId", boxId)
                    .addParameter("counteragentGroupId", counteragentGroupId);

            if (count != null) {
                url.addParameter("count", Integer.toString(count));
            }

            if (!Tools.isNullOrEmpty(afterIndexKey)) {
                url.addParameter("afterIndexKey", afterIndexKey);
            }

            var request = RequestBuilder.get(url.build());
            return CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
}