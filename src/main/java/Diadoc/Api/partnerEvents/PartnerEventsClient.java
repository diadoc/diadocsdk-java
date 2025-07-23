package Diadoc.Api.partnerEvents;

import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;

import java.io.IOException;
import java.net.URISyntaxException;

import static Diadoc.Api.Proto.PartnerEvents.PartnerEventsApi.*;

public class PartnerEventsClient {
    private final DiadocHttpClient diadocHttpClient;

    public PartnerEventsClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    public GetPartnerEventsResponse GetPartnerEvents(GetPartnerEventsRequest getPartnerEventsRequest) throws DiadocSdkException {
        try {
            var request = RequestBuilder.post(
                            new URIBuilder(diadocHttpClient.getBaseUrl())
                                    .setPath("/GetPartnerEvents")
                                    .build())
                    .setEntity(new ByteArrayEntity(getPartnerEventsRequest.toByteArray()));
            return GetPartnerEventsResponse.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
}
