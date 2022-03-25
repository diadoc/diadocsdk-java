package Diadoc.Api.events;

import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.jetbrains.annotations.Nullable;

import javax.mail.internet.ParseException;
import java.io.IOException;
import java.net.URISyntaxException;

import static Diadoc.Api.Proto.Events.DiadocMessage_GetApiProtos.*;

public class EventsClient {
    private DiadocHttpClient diadocHttpClient;

    public EventsClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    public BoxEventList getNewEvents(String currentBoxId, @Nullable String eventIdCurrent) throws DiadocSdkException {
        if (currentBoxId == null) {
            throw new IllegalArgumentException("currentBoxId");
        }

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/V6/GetNewEvents")
                    .addParameter("boxId", currentBoxId);

            if (eventIdCurrent != null) {
                url.addParameter("afterEventId", eventIdCurrent);
            }

            var request = RequestBuilder.get(url.build());
            return BoxEventList.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    @Nullable
    public BoxEvent getLastEvent(String boxId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }

        try {
            var request = RequestBuilder.get(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GetLastEvent")
                            .addParameter("boxId", boxId).build());
            var response = diadocHttpClient.getRawResponse(request);
            if(response.getStatusCode() == HttpStatus.SC_NO_CONTENT){
                return null;
            }
            return BoxEvent.parseFrom(response.getContent());
        } catch (URISyntaxException | IOException | ParseException e) {
            throw new DiadocSdkException(e);
        }
    }

    public BoxEvent getEvent(String boxId, String eventId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (eventId == null) {
            throw new IllegalArgumentException("eventId");
        }
        try {

            var request = RequestBuilder.get(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/V2/GetEvent")
                            .addParameter("boxId", boxId)
                            .addParameter("eventId", eventId)
                            .build());
            return BoxEvent.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

}
