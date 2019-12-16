package Diadoc.Api.department;

import Diadoc.Api.Proto.OrganizationProtos;
import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.net.URISyntaxException;

import static Diadoc.Api.Proto.Departments.DepartmentListProtos.*;
import static Diadoc.Api.Proto.Departments.DepartmentProtos.Department;
import static Diadoc.Api.Proto.Departments.DepartmentToCreateProtos.DepartmentToCreate;
import static Diadoc.Api.Proto.Departments.DepartmentToUpdateProtos.DepartmentToUpdate;

public class DepartmentClient {
    private DiadocHttpClient diadocHttpClient;

    public DepartmentClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    public Department createDepartment(String boxId, DepartmentToCreate departmentToCreate) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }

        if (departmentToCreate == null) {
            throw new IllegalArgumentException("departmentToCreate");
        }
        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/admin/CreateDepartment")
                            .addParameter("boxId", boxId)
                            .build())
                    .setEntity(new ByteArrayEntity(departmentToCreate.toByteArray()));
            return Department.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public Department updateDepartment(String boxId, String departmentId, DepartmentToUpdate departmentToUpdate) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (departmentId == null) {
            throw new IllegalArgumentException("departmentId");
        }
        if (departmentToUpdate == null) {
            throw new IllegalArgumentException("departmentToUpdate");
        }
        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/admin/UpdateDepartment")
                            .addParameter("boxId", boxId)
                            .addParameter("departmentId", departmentId)
                            .build())
                    .setEntity(new ByteArrayEntity(departmentToUpdate.toByteArray()));
            return Department.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public void deleteDepartment(String boxId, String departmentId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (departmentId == null) {
            throw new IllegalArgumentException("departmentId");
        }

        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/admin/DeleteDepartment")
                            .addParameter("boxId", boxId)
                            .addParameter("departmentId", departmentId)
                            .build());
            diadocHttpClient.performRequest(request);
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public Department getDepartmentByFullId(String boxId, String departmentId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (departmentId == null) {
            throw new IllegalArgumentException("departmentId");
        }

        try {
            var request = RequestBuilder.get(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/admin/GetDepartment")
                            .addParameter("boxId", boxId)
                            .addParameter("departmentId", departmentId)
                            .build());
            return Department.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public DepartmentList getDepartments(String boxId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        return getDepartments(boxId, null, null);
    }

    public DepartmentList getDepartments(String boxId, int page) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        return getDepartments(boxId, page, null);
    }

    public DepartmentList getDepartments(String boxId, @Nullable Integer page, @Nullable Integer count) throws DiadocSdkException {
        if(boxId == null) {
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
                    .setPath("/admin/GetDepartments")
                    .addParameter("boxId", boxId);

            if (page != null) {
                url.addParameter("page", Integer.toString(page));
            }

            if (count != null) {
                url.addParameter("count", Integer.toString(count));
            }

            var request = RequestBuilder.get(url.build());
            return DepartmentList.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public OrganizationProtos.Department getDepartment(String orgId, String departmentId) throws DiadocSdkException {
        if (orgId == null) {
            throw new IllegalArgumentException("orgId");
        }
        if (departmentId == null) {
            throw new IllegalArgumentException("departmentId");
        }
        try {
            var request = RequestBuilder.get(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GetDepartment")
                            .addParameter("orgId", orgId)
                            .addParameter("departmentId", departmentId)
                            .build());
            return OrganizationProtos.Department.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
}
