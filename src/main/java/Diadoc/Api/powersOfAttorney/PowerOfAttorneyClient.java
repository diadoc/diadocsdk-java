package Diadoc.Api.powersOfAttorney;

import java.io.IOException;
import java.net.URISyntaxException;

import Diadoc.Api.Proto.AsyncMethodResultProtos.*;
import Diadoc.Api.Proto.Events.PowerOfAttorneyInfoProtos.*;
import Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.*;
import Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyValidationProtos.*;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;

import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.entity.ByteArrayEntity;

public class PowerOfAttorneyClient {
    private DiadocHttpClient diadocHttpClient;

    public PowerOfAttorneyClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    public AsyncMethodResult registerPowerOfAttorney(String boxId, PowerOfAttorneyToRegister powerOfAttorneyToRegister) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }

        if (powerOfAttorneyToRegister == null) {
            throw new IllegalArgumentException("powerOfAttorneyToRegister");
        }

        try {
            var request = RequestBuilder.post(
                            new URIBuilder(diadocHttpClient.getBaseUrl())
                                    .setPath("/RegisterPowerOfAttorney")
                                    .addParameter("boxId", boxId)
                                    .build())
                    .setEntity(new ByteArrayEntity(powerOfAttorneyToRegister.toByteArray()));

            return AsyncMethodResult.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public PowerOfAttorneyRegisterResult registerPowerOfAttorneyResult(String boxId, String taskId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (taskId == null) {
            throw new IllegalArgumentException("taskId");
        }

        try {
            var request = RequestBuilder.get(
                            new URIBuilder(diadocHttpClient.getBaseUrl())
                                    .setPath("/RegisterPowerOfAttorneyResult")
                                    .addParameter("boxId", boxId)
                                    .addParameter("taskId", taskId)
                                    .build());

            return PowerOfAttorneyRegisterResult.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public PowerOfAttorneyPrevalidateResult prevalidatePowerOfAttorney(
            String boxId,
            String registrationNumber,
            String issuerInn,
            PowerOfAttorneyPrevalidateRequest powerOfAttorneyPrevalidateRequest) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (registrationNumber == null) {
            throw new IllegalArgumentException("registrationNumber");
        }
        if (issuerInn == null) {
            throw new IllegalArgumentException("issuerInn");
        }
        if (powerOfAttorneyPrevalidateRequest == null) {
            throw new IllegalArgumentException("powerOfAttorneyPrevalidateRequest");
        }

        try {
            var request = RequestBuilder.post(
                            new URIBuilder(diadocHttpClient.getBaseUrl())
                                    .setPath("/PrevalidatePowerOfAttorney")
                                    .addParameter("boxId", boxId)
                                    .addParameter("registrationNumber", registrationNumber)
                                    .addParameter("issuerInn", issuerInn)
                                    .build())
                    .setEntity(new ByteArrayEntity(powerOfAttorneyPrevalidateRequest.toByteArray()));

            return PowerOfAttorneyPrevalidateResult.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public PowerOfAttorney getPowerOfAttorneyInfo(String boxId, String messageId, String entityId) throws DiadocSdkException {
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
                                    .setPath("/GetPowerOfAttorneyInfo")
                                    .addParameter("boxId", boxId)
                                    .addParameter("messageId", messageId)
                                    .addParameter("entityId", entityId)
                                    .build());

            return PowerOfAttorney.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public PowerOfAttorneyContentResponse getPowerOfAttorneyContent(String boxId, String messageId, String entityId) throws DiadocSdkException {
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
                            .setPath("V2/GetPowerOfAttorneyContent")
                            .addParameter("boxId", boxId)
                            .addParameter("messageId", messageId)
                            .addParameter("entityId", entityId)
                            .build());

            return PowerOfAttorneyContentResponse.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
}
