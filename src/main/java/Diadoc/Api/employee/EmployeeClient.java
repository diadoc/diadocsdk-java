package Diadoc.Api.employee;

import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.net.URISyntaxException;

import static Diadoc.Api.Proto.CertificateListProtos.CertificateList;
import static Diadoc.Api.Proto.Employees.EmployeeProtos.Employee;
import static Diadoc.Api.Proto.Employees.EmployeeProtos.EmployeeList;
import static Diadoc.Api.Proto.Employees.EmployeeToCreateProtos.EmployeeToCreate;
import static Diadoc.Api.Proto.Employees.EmployeeToUpdateProtos.EmployeeToUpdate;
import static Diadoc.Api.Proto.Employees.Subscriptions.SubscriptionProtos.EmployeeSubscriptions;
import static Diadoc.Api.Proto.Employees.Subscriptions.SubscriptionProtos.SubscriptionsToUpdate;

public class EmployeeClient {
    private DiadocHttpClient diadocHttpClient;

    public EmployeeClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    public Employee createEmployee(String boxId, EmployeeToCreate employeeToCreate) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }

        if (employeeToCreate == null) {
            throw new IllegalArgumentException("employeeToCreate");
        }
        try {

            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/CreateEmployee")
                            .addParameter("boxId", boxId)
                            .build())
                    .setEntity(new ByteArrayEntity(employeeToCreate.toByteArray()));

            return Employee.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public Employee updateEmployee(String boxId, String userId, EmployeeToUpdate employeeToUpdate) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (userId == null) {
            throw new IllegalArgumentException("userId");
        }
        if (employeeToUpdate == null) {
            throw new IllegalArgumentException("employeeToUpdate");
        }

        try {

            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/UpdateEmployee")
                            .addParameter("boxId", boxId)
                            .addParameter("userId", userId)
                            .build())
                    .setEntity(new ByteArrayEntity(employeeToUpdate.toByteArray()));

            return Employee.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public void deleteEmployee(String boxId, String userId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (userId == null) {
            throw new IllegalArgumentException("userId");
        }

        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/DeleteEmployee")
                            .addParameter("boxId", boxId)
                            .addParameter("userId", userId)
                            .build())
                    .addHeader("Content-Length", "0" );

            diadocHttpClient.performRequest(request);
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public EmployeeList getEmployees(String boxId, @Nullable Integer page, @Nullable Integer count) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (page != null && page < 1) {
            throw new IllegalArgumentException("page must be 1 or greater");
        }
        if (count != null && count < 1) {
            throw new IllegalArgumentException("count must be 1 or greater");
        }

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/GetEmployees")
                    .addParameter("boxId", boxId);

            if (page != null) {
                url.addParameter("page", Integer.toString(page));
            }

            if (count != null) {
                url.addParameter("count", Integer.toString(count));
            }

            var request = RequestBuilder.get(url.build());
            return EmployeeList.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public EmployeeList getEmployees(String boxId) throws DiadocSdkException {
        return getEmployees(boxId, null, null);
    }

    public EmployeeList getEmployees(String boxId, int page) throws DiadocSdkException {
        return getEmployees(boxId, page, null);
    }

    public Employee getEmployee(String boxId, String userId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (userId == null) {
            throw new IllegalArgumentException("userId");
        }

        try {
            var request = RequestBuilder.get(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GetEmployee")
                            .addParameter("boxId", boxId)
                            .addParameter("userId", userId)
                            .build());
            return Employee.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public Employee getMyEmployee(String boxId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        try {
            var request = RequestBuilder.get(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GetMyEmployee")
                            .addParameter("boxId", boxId)
                            .build());
            return Employee.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public EmployeeSubscriptions getSubscriptions(String boxId, String userId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (userId == null) {
            throw new IllegalArgumentException("userId");
        }

        try {
            var request = RequestBuilder.get(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GetSubscriptions")
                            .addParameter("boxId", boxId)
                            .addParameter("userId", userId)
                            .build());
            return EmployeeSubscriptions.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public CertificateList getMyCertificates(String boxId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        try {
            var request = RequestBuilder.get(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GetMyCertificates")
                            .addParameter("boxId", boxId)
                            .build());
            return CertificateList.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public EmployeeSubscriptions updateSubscriptions(String boxId, String userId, SubscriptionsToUpdate subscriptionsToUpdate) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (userId == null) {
            throw new IllegalArgumentException("userId");
        }
        if(subscriptionsToUpdate == null) {
            throw new IllegalArgumentException("subscriptionsToUpdate");
        }

        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/UpdateSubscriptions")
                            .addParameter("boxId", boxId)
                            .addParameter("userId", userId)
                            .build())
                    .setEntity(new ByteArrayEntity(subscriptionsToUpdate.toByteArray()));

            return EmployeeSubscriptions.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
}
