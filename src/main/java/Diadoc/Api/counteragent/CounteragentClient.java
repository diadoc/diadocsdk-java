package Diadoc.Api.counteragent;

import Diadoc.Api.exceptions.DiadocException;
import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.helpers.Tools;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Optional;

import static Diadoc.Api.Proto.AcquireCounteragentProtos.*;
import static Diadoc.Api.Proto.AsyncMethodResultProtos.*;
import static Diadoc.Api.Proto.CounteragentProtos.*;
import static Diadoc.Api.Proto.Events.DiadocCounteragent_GetApiProtos.*;

public class CounteragentClient {
    private DiadocHttpClient diadocHttpClient;

    public CounteragentClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #acquireCounteragentV3(String, String, AcquireCounteragentRequest)}
     */

    @Deprecated
    public AsyncMethodResult acquireCounteragent(String myOrgId, AcquireCounteragentRequest acquireCounteragentRequest) throws DiadocSdkException {
        return acquireCounteragent(myOrgId, null, acquireCounteragentRequest);
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #acquireCounteragentV3(String, String, AcquireCounteragentRequest)}
     */
    @Deprecated
    public AsyncMethodResult acquireCounteragent(
            String myOrgId,
            @Nullable String myDepartmentId,
            AcquireCounteragentRequest acquireCounteragentRequest) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(myOrgId)) {
            throw new IllegalArgumentException("myOrgId");
        }

        if (acquireCounteragentRequest == null) {
            throw new IllegalArgumentException("acquireCounteragentRequest");
        }

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/V2/AcquireCounteragent")
                    .addParameter("myOrgId", myOrgId);

            Tools.addParameterIfNotNull(url, "myDepartmentId", myDepartmentId);
            
            var request = RequestBuilder
                    .post(url.build())
                    .setEntity(new ByteArrayEntity(acquireCounteragentRequest.toByteArray()));

            return AsyncMethodResult.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
    
    public AsyncMethodResult acquireCounteragentV3(
            String myBoxId,
            @Nullable String myDepartmentId,
            AcquireCounteragentRequest acquireCounteragentRequest) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(myBoxId)) {
            throw new IllegalArgumentException("myBoxId");
        }

        if (acquireCounteragentRequest == null) {
            throw new IllegalArgumentException("acquireCounteragentRequest");
        }

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/V3/AcquireCounteragent")
                    .addParameter("myBoxId", myBoxId);

            Tools.addParameterIfNotNull(url, "myDepartmentId", myDepartmentId);

            var request = RequestBuilder
                    .post(url.build())
                    .setEntity(new ByteArrayEntity(acquireCounteragentRequest.toByteArray()));

            return AsyncMethodResult.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * Use waitAcquireCounteragentResultV2 instead
     * @deprecated Method is deprecated
     * Use {@link #waitAcquireCounteragentResultV2(String, Integer)}.
     */
    @Deprecated
    public AcquireCounteragentResult waitAcquireCounteragentResult(String taskId, Integer timeoutInMillis) throws DiadocSdkException, DiadocException {
        try {
            byte[] data = diadocHttpClient.waitTaskResult("/AcquireCounteragentResult", taskId, timeoutInMillis);
            return AcquireCounteragentResult.parseFrom(data);
        } catch (IOException e) {
            throw new DiadocSdkException(e);
        }
    }
    
    public AcquireCounteragentResultV2 waitAcquireCounteragentResultV2(String taskId, Integer timeoutInMillis) throws DiadocSdkException, DiadocException {
        try {
            byte[] data = diadocHttpClient.waitTaskResult("/V2/AcquireCounteragentResult", taskId, timeoutInMillis);
            return AcquireCounteragentResultV2.parseFrom(data);
        } catch (IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #getCounteragentV3(String, String)}
     */
    @Deprecated
    public Counteragent getCounteragent(String myOrgId, String counteragentOrgId) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(myOrgId)) {
            throw new IllegalArgumentException("myOrgId");
        }
        if (Tools.isNullOrEmpty(counteragentOrgId)) {
            throw new IllegalArgumentException("counteragentOrgId");
        }

        try {
            var request = RequestBuilder
                    .get(new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/V2/GetCounteragent")
                            .addParameter("myOrgId", myOrgId)
                            .addParameter("counteragentOrgId", counteragentOrgId)
                            .build());
            return Counteragent.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
    
    public Counteragent getCounteragentV3(String myBoxId, String counteragentBoxId) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(myBoxId)) {
            throw new IllegalArgumentException("myBoxId");
        }
        if (Tools.isNullOrEmpty(counteragentBoxId)) {
            throw new IllegalArgumentException("counteragentBoxId");
        }

        try {
            var request = RequestBuilder
                    .get(new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/V3/GetCounteragent")
                            .addParameter("myBoxId", myBoxId)
                            .addParameter("counteragentBoxId", counteragentBoxId)
                            .build());
            return Counteragent.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #getCounteragentCertificatesV2(String, String)}
     */
    @Deprecated
    public CounteragentCertificateList getCounteragentCertificates(String myOrgId, String counteragentOrgId) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(myOrgId)) {
            throw new IllegalArgumentException("myOrgId");
        }
        if (Tools.isNullOrEmpty(counteragentOrgId)) {
            throw new IllegalArgumentException("counteragentOrgId");
        }

        try {
            var request = RequestBuilder
                    .get(new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GetCounteragentCertificates")
                            .addParameter("myOrgId", myOrgId)
                            .addParameter("counteragentOrgId", counteragentOrgId)
                            .build());
            return CounteragentCertificateList.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
    
    public CounteragentCertificateList getCounteragentCertificatesV2(String myBoxId, String counteragentBoxId) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(myBoxId)) {
            throw new IllegalArgumentException("myBoxId");
        }
        if (Tools.isNullOrEmpty(counteragentBoxId)) {
            throw new IllegalArgumentException("counteragentBoxId");
        }

        try {
            var request = RequestBuilder
                    .get(new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/V2/GetCounteragentCertificates")
                            .addParameter("myBoxId", myBoxId)
                            .addParameter("counteragentBoxId", counteragentBoxId)
                            .build());
            return CounteragentCertificateList.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #getCounteragentsV3(String, String, String)}
     */
    @Deprecated
    public CounteragentList getCounteragents(String myOrgId, @Nullable String counteragentStatus, @Nullable String afterIndexKey) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(myOrgId)) {
            throw new IllegalArgumentException("myOrgId");
        }
        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/V2/GetCounteragents")
                    .addParameter("myOrgId", myOrgId);

            if (!Tools.isNullOrEmpty(counteragentStatus)) {
                url.addParameter("counteragentStatus", counteragentStatus);
            }

            Tools.addParameterIfNotNull(url, "afterIndexKey", afterIndexKey);

            var request = RequestBuilder.get(url.build());
            return CounteragentList.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public CounteragentList getCounteragentsV3(String myBoxId, @Nullable String counteragentStatus, @Nullable String afterIndexKey) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(myBoxId)) {
            throw new IllegalArgumentException("myBoxId");        }

        var counteragentEnumStatus = CounteragentStatus.fromString(counteragentStatus).orElse(null);

        return getCounteragentsV3(myBoxId, counteragentEnumStatus, afterIndexKey, null, null);
    }

    public CounteragentList getCounteragentsV3(String myBoxId, @Nullable CounteragentStatus counteragentStatus, @Nullable String afterIndexKey, @Nullable String query, @Nullable Integer pageSize) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(myBoxId)) {
            throw new IllegalArgumentException("myBoxId");
        }

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/V3/GetCounteragents")
                    .addParameter("myBoxId", myBoxId);

            Tools.addParameterIfNotNull(url, "counteragentStatus", counteragentStatus);
            Tools.addParameterIfNotNull(url, "afterIndexKey", afterIndexKey);
            Tools.addParameterIfNotNull(url, "query", query);
            Tools.addParameterIfNotNull(url, "pageSize",pageSize);

            var request = RequestBuilder.get(url.build());
            return CounteragentList.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #breakWithCounteragentV2(String, String, String)}
     */
    @Deprecated
    public void breakWithCounteragent(String myOrgId, String counteragentOrgId, @Nullable String comment) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(myOrgId)) {
            throw new IllegalArgumentException("myOrgId");
        }
        if (Tools.isNullOrEmpty(counteragentOrgId)) {
            throw new IllegalArgumentException("counteragentOrgId");
        }

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/BreakWithCounteragent")
                    .addParameter("myOrgId", myOrgId)
                    .addParameter("counteragentOrgId", counteragentOrgId);

            if (!Tools.isNullOrEmpty(comment)) {
                url.addParameter("comment", comment);
            }

            var request = RequestBuilder.post(url.build());
            diadocHttpClient.performRequest(request);
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
    
    public void breakWithCounteragentV2(String myBoxId, String counteragentBoxId, @Nullable String comment) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(myBoxId)) {
            throw new IllegalArgumentException("myBoxId");
        }
        if (Tools.isNullOrEmpty(counteragentBoxId)) {
            throw new IllegalArgumentException("counteragentBoxId");
        }

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/V2/BreakWithCounteragent")
                    .addParameter("myBoxId", myBoxId)
                    .addParameter("counteragentBoxId", counteragentBoxId);

            if (!Tools.isNullOrEmpty(comment)) {
                url.addParameter("comment", comment);
            }

            var request = RequestBuilder.post(url.build());
            diadocHttpClient.performRequest(request);
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public BoxCounteragentEventList getCounteragentEvents(
            String boxId,
            @Nullable String afterIndexKey,
            @Nullable Long timestampFromTicks,
            @Nullable Long timestampToTicks,
            @Nullable Integer limit) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/V1/GetCounteragentEvents")
                    .addParameter("boxId", boxId);

            if (!Tools.isNullOrEmpty(afterIndexKey)) {
                url.addParameter("afterIndexKey", afterIndexKey);
            }

            if (timestampFromTicks != null) {
                url.addParameter("timestampFromTicks", timestampFromTicks.toString());
            }

            if (timestampToTicks != null) {
                url.addParameter("timestampToTicks", timestampToTicks.toString());
            }

            if (limit != null && limit > 0) {
                url.addParameter("limit", limit.toString());
            }

            var request = RequestBuilder.get(url.build());
            return BoxCounteragentEventList.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
}