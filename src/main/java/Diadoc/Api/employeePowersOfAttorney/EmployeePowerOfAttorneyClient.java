package Diadoc.Api.employeePowersOfAttorney;

import Diadoc.Api.Proto.Employees.PowersOfAttorney.EmployeePowerOfAttorneyProtos.*;
import Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos;
import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.helpers.Tools;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.net.URISyntaxException;

public class EmployeePowerOfAttorneyClient {
    private DiadocHttpClient diadocHttpClient;

    public EmployeePowerOfAttorneyClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    public EmployeePowerOfAttorneyList getEmployeePowersOfAttorney(
            String boxId,
            @Nullable String userId,
            boolean onlyActual) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }

        try {
            var urlBuilder = new URIBuilder(diadocHttpClient.getBaseUrl())
                                    .setPath("/GetEmployeePowersOfAttorney")
                                    .addParameter("boxId", boxId)
                                    .addParameter("onlyActual", String.valueOf(onlyActual));

            if (!Tools.isNullOrEmpty(userId)){
                urlBuilder.addParameter("userId", userId);
            }

            var request = RequestBuilder.get(urlBuilder.build());

            return EmployeePowerOfAttorneyList.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public EmployeePowerOfAttorney updateEmployeePowerOfAttorneyV2(
            String boxId,
            @Nullable String userId,
            EmployeePowerOfAttorneyToUpdateV2 powerOfAttorneyToUpdate) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (powerOfAttorneyToUpdate == null) {
            throw new IllegalArgumentException("powerOfAttorneyToUpdate");
        }
        if (!powerOfAttorneyToUpdate.hasPowerOfAttorneyFullId()) {
            throw new IllegalArgumentException("powerOfAttorneyFullId");
        }

        try {
            var urlBuilder = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/V2/UpdateEmployeePowerOfAttorney")
                    .addParameter("boxId", boxId);

            if (!Tools.isNullOrEmpty(userId)){
                urlBuilder.addParameter("userId", userId);
            }

            var request = RequestBuilder
                    .post(urlBuilder.build())
                    .setEntity(new ByteArrayEntity(powerOfAttorneyToUpdate.toByteArray()));

            return EmployeePowerOfAttorney.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public EmployeePowerOfAttorney addEmployeePowerOfAttorneyV2(
            String boxId,
            @Nullable String userId,
            PowerOfAttorneyProtos.PowerOfAttorneyFullId fullId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (fullId == null) {
            throw new IllegalArgumentException("PowerOfAttorneyFullId");
        }

        try {
            var urlBuilder = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/V2/AddEmployeePowerOfAttorney")
                    .addParameter("boxId", boxId);

            if (!Tools.isNullOrEmpty(userId)){
                urlBuilder.addParameter("userId", userId);
            }

            var request = RequestBuilder.post(urlBuilder.build())
                    .setEntity(new ByteArrayEntity(fullId.toByteArray()));

            return EmployeePowerOfAttorney.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public void deleteEmployeePowerOfAttorneyV2(
            String boxId,
            @Nullable String userId,
            PowerOfAttorneyProtos.PowerOfAttorneyFullId fullId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (fullId == null) {
            throw new IllegalArgumentException("PowerOfAttorneyFullId");
        }

        try {
            var urlBuilder = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/V2/DeleteEmployeePowerOfAttorney")
                    .addParameter("boxId", boxId);

            if (!Tools.isNullOrEmpty(userId)){
                urlBuilder.addParameter("userId", userId);
            }

            var request = RequestBuilder.post(urlBuilder.build())
                    .setEntity(new ByteArrayEntity(fullId.toByteArray()));

            diadocHttpClient.performRequest(request);
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
}
