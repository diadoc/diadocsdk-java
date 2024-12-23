package Diadoc.Api.sign;

import Diadoc.Api.exceptions.DiadocSdkException;
import com.google.protobuf.InvalidProtocolBufferException;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.net.URISyntaxException;

import static Diadoc.Api.Proto.AsyncMethodResultProtos.*;
import static Diadoc.Api.Proto.CloudSignProtos.*;
import static Diadoc.Api.Proto.Dss.DssSignProtos.*;
import static Diadoc.Api.Proto.Invoicing.Signers.ExtendedSignerProtos.*;

public class SignClient {
    private DiadocHttpClient diadocHttpClient;

    public SignClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    public AsyncMethodResult cloudSign(CloudSignRequest request) throws DiadocSdkException {
        return cloudSign(request, null);
    }

    @Deprecated
    public AsyncMethodResult cloudSign(CloudSignRequest cloudSignRequest, @Nullable String certificateThumbprint) throws DiadocSdkException {
        if (cloudSignRequest == null) {
            throw new IllegalArgumentException("cloudSignRequest");
        }
        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl()).setPath("/CloudSign");

            if (certificateThumbprint != null) {
                url.addParameter("certificateThumbprint", certificateThumbprint);
            }
            var result = diadocHttpClient.performRequest(RequestBuilder.post(url.build()).setEntity(new ByteArrayEntity(cloudSignRequest.toByteArray())));
            return AsyncMethodResult.parseFrom(result);

        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    @Deprecated
    public CloudSignResult waitCloudSignResult(String taskId, Integer timeoutInMillis) throws DiadocSdkException {
        try {
            var data = diadocHttpClient.waitTaskResult("/CloudSignResult", taskId, timeoutInMillis);
            return CloudSignResult.parseFrom(data);
        } catch (InvalidProtocolBufferException e) {
            throw new DiadocSdkException(e);
        }
    }

    @Deprecated
    public AsyncMethodResult cloudSignConfirm(String token, String confirmationCode, boolean returnContent) throws DiadocSdkException {
        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/CloudSignConfirm")
                    .addParameter("token", token)
                    .addParameter("confirmationCode", confirmationCode)
                    .addParameter("return", returnContent ? "Content" : "Reference");
            var result = diadocHttpClient.performRequest(
                    RequestBuilder.post(url.build()).addHeader("Content-Length", "0"));
            return AsyncMethodResult.parseFrom(result);

        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    @Deprecated
    public CloudSignConfirmResult waitCloudSignConfirmResult(String taskId, Integer timeoutInMillis) throws DiadocSdkException {
        try {
            byte[] data = diadocHttpClient.waitTaskResult("/CloudSignConfirmResult", taskId, timeoutInMillis);
            return CloudSignConfirmResult.parseFrom(data);
        } catch (InvalidProtocolBufferException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated Method is deprecated
     * Informantion <a href="https://developer.kontur.ru/docs/diadoc-api/http/obsolete/AutoSignReceipts.html">in documentation</a>.
     */
    @Deprecated
    public AsyncMethodResult autoSignReceipts(String boxId, @Nullable String certificateThumbprint, @Nullable String batchKey) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/AutoSignReceipts")
                    .addParameter("boxId", boxId);

            if (certificateThumbprint != null) {
                url.addParameter("certificateThumbprint", certificateThumbprint);
            }

            if (batchKey != null) {
                url.addParameter("batchKey", batchKey);
            }

            var result = diadocHttpClient.performRequest(
                    RequestBuilder.post(url.build()).addHeader("Content-Length", "0"));
            return AsyncMethodResult.parseFrom(result);

        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated Method is deprecated
     * Informantion <a href="https://developer.kontur.ru/docs/diadoc-api/http/obsolete/AutoSignReceipts.html">in documentation</a>.
     */
    @Deprecated
    public AutosignReceiptsResult waitAutosignReceiptsResult(String taskId, Integer timeoutInMillis)
            throws DiadocSdkException {
        try {
            byte[] data = diadocHttpClient.waitTaskResult("/AutosignReceiptsResult", taskId, timeoutInMillis);
            return AutosignReceiptsResult.parseFrom(data);
        } catch (InvalidProtocolBufferException e) {
            throw new DiadocSdkException(e);
        }

    }

    public AsyncMethodResult dssSign(String boxId, DssSignRequest request) throws DiadocSdkException {
        return dssSign(boxId, request, null);
    }

    public AsyncMethodResult dssSign(String boxId, DssSignRequest request, @Nullable String certificateThumbprint) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (request == null) {
            throw new IllegalArgumentException("request");
        }

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/DssSign")
                    .addParameter("boxId", boxId);

            if (certificateThumbprint != null) {
                url.addParameter("certificateThumbprint", certificateThumbprint);
            }


            var result = diadocHttpClient.performRequest(
                    RequestBuilder.post(url.build())
                            .setEntity(new ByteArrayEntity(request.toByteArray())));
            return AsyncMethodResult.parseFrom(result);

        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public DssSignResult dssSignResult(String boxId, String taskId) throws Exception {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (taskId == null) {
            throw new IllegalArgumentException("taskId");
        }
        try {
            var result = diadocHttpClient.performRequest(
                    RequestBuilder.get(
                            new URIBuilder(diadocHttpClient.getBaseUrl())
                                    .setPath("/DssSignResult")
                                    .addParameter("boxId", boxId)
                                    .addParameter("taskId", taskId).build()));
            return DssSignResult.parseFrom(result);

        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public ExtendedSignerDetails getExtendedSignerDetails(String boxId, String thumbprint, DocumentTitleType documentTitleType) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (thumbprint == null) {
            throw new IllegalArgumentException("thumbprint");
        }

        try {
            var result = diadocHttpClient.performRequest(
                    RequestBuilder.get(
                            new URIBuilder(diadocHttpClient.getBaseUrl())
                                    .setPath("/V2/ExtendedSignerDetails")
                                    .addParameter("boxId", boxId)
                                    .addParameter("thumbprint", thumbprint)
                                    .addParameter("documentTitleType", Integer.toString(documentTitleType.getNumber())).build()));
            return ExtendedSignerDetails.parseFrom(result);

        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public ExtendedSignerDetails postExtendedSignerDetails(String boxId, String thumbprint, DocumentTitleType documentTitleType, ExtendedSignerDetailsToPost signerDetails) throws IOException, DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (thumbprint == null) {
            throw new IllegalArgumentException("thumbprint");
        }

        try {
            var result = diadocHttpClient.performRequest(
                    RequestBuilder.post(
                            new URIBuilder(diadocHttpClient.getBaseUrl())
                                    .setPath("/V2/ExtendedSignerDetails")
                                    .addParameter("boxId", boxId)
                                    .addParameter("thumbprint", thumbprint)
                                    .addParameter("documentTitleType", Integer.toString(documentTitleType.getNumber())).build())
                            .setEntity(new ByteArrayEntity(signerDetails.toByteArray())));
            return ExtendedSignerDetails.parseFrom(result);

        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
}
