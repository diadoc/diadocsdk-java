package Diadoc.Api.fnsParticipants;

import Diadoc.Api.Proto.FnsParticipants.SearchFnsParticipantsRequestOuterClass;
import Diadoc.Api.Proto.FnsParticipants.SearchFnsParticipantsResponseOuterClass;
import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.helpers.Tools;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;

import java.io.IOException;
import java.net.URISyntaxException;

public class FnsParticipantsClient {
    private DiadocHttpClient diadocHttpClient;

    public FnsParticipantsClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    public SearchFnsParticipantsResponseOuterClass.SearchFnsParticipantsResponse searchFnsParticipants(String myBoxId, SearchFnsParticipantsRequestOuterClass.SearchFnsParticipantsRequest searchFnsParticipantsRequest) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(myBoxId)) {
            throw new IllegalArgumentException("myBoxId");
        }
        if (searchFnsParticipantsRequest == null) {
            throw new IllegalArgumentException("searchFnsParticipantsRequest");
        }

        try {
            var request = RequestBuilder.post(
                            new URIBuilder(diadocHttpClient.getBaseUrl())
                                    .setPath("/SearchFnsParticipants")
                                    .addParameter("myBoxId", myBoxId)
                                    .build())
                    .setEntity(new ByteArrayEntity(searchFnsParticipantsRequest.toByteArray()));
            return SearchFnsParticipantsResponseOuterClass.SearchFnsParticipantsResponse.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
}