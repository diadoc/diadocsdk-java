package Diadoc.Api.events;

import Diadoc.Api.Proto.Forwarding.ForwardingApiProtos;
import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.helpers.Tools;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.jetbrains.annotations.Nullable;

import javax.mail.internet.ParseException;
import java.io.IOException;
import java.net.URISyntaxException;

import static Diadoc.Api.Proto.Events.DiadocMessage_GetApiProtos.*;
import static Diadoc.Api.helpers.Tools.addParameterIfNotNull;

public class EventsClient {
    private final DiadocHttpClient diadocHttpClient;

    public EventsClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    /**
     * @deprecated
     *
     * Use {@link #getNewEventsV7(String, String, String, String, String, MessageType, DocumentDirection, Long, Long, String, OrderBy, Integer)}
     */
    @Deprecated
    public BoxEventList getNewEvents( String currentBoxId, @Nullable String eventIdCurrent) throws DiadocSdkException {
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

    public BoxEventList getNewEventsV7(
            String currentBoxId,
            @Nullable String afterEventId,
            @Nullable String afterIndexKey,
            @Nullable String departmentId,
            @Nullable String typeNameId,
            @Nullable MessageType messageType,
            @Nullable DocumentDirection documentDirection,
            @Nullable Long timestampFromTicks,
            @Nullable Long timestampToTicks,
            @Nullable String counteragentBoxId,
            @Nullable OrderBy orderBy,
            @Nullable Integer limit
    ) throws DiadocSdkException {
        if (currentBoxId == null) {
            throw new IllegalArgumentException("boxId");
        }

        if (afterEventId != null && afterIndexKey != null) {
            throw new IllegalArgumentException("Cannot specify both afterEventId and afterIndexKey at the same time");
        }

        try {
            var uri = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/V7/GetNewEvents")
                    .addParameter("boxId", currentBoxId);

            addParameterIfNotNull(uri, "afterEventId", afterEventId);
            addParameterIfNotNull(uri, "afterIndexKey", afterIndexKey);
            addParameterIfNotNull(uri, "departmentId", departmentId);
            addParameterIfNotNull(uri, "messageType", messageType);
            addParameterIfNotNull(uri, "typeNamedId", typeNameId);
            addParameterIfNotNull(uri, "documentDirection", documentDirection);
            addParameterIfNotNull(uri, "timestampFromTicks", timestampFromTicks);
            addParameterIfNotNull(uri, "timestampToTicks", timestampToTicks);
            addParameterIfNotNull(uri, "counteragentBoxId", counteragentBoxId);
            addParameterIfNotNull(uri, "orderBy", orderBy);
            uri.addParameter("limit", String.valueOf(limit != null ? limit : 100));

            var request = RequestBuilder.get(uri.build());
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
        if (Tools.isNullOrEmpty(boxId)) {
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

    public ForwardingApiProtos.GetForwardedDocumentEventsResponse getForwardedDocumentEvents(
            String boxId, ForwardingApiProtos.GetForwardedDocumentEventsRequest forwardedDocumentEventsRequest
    ) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }

        if (forwardedDocumentEventsRequest == null) {
            throw new IllegalArgumentException("forwardedDocumentEventsRequest");
        }

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/V2/GetForwardedDocumentEvents")
                    .addParameter("boxId", boxId)
                    .build();
            var request = RequestBuilder.post(url)
                    .setEntity(new ByteArrayEntity(forwardedDocumentEventsRequest.toByteArray()));

            return ForwardingApiProtos.GetForwardedDocumentEventsResponse.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

}
