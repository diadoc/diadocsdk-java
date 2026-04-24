package Diadoc.Api.security;

import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.net.URISyntaxException;

import static Diadoc.Api.helpers.Tools.addParameterIfNotNull;
import static Diadoc.Api.Proto.SecurityEventListProtos.SecurityEventList;

public class SecurityClient {
    private final DiadocHttpClient diadocHttpClient;

    public SecurityClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    public SecurityEventList getSecurityEvents(
            String boxId,
            @Nullable String afterIndexKey,
            @Nullable Integer count
    ) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }

        try {
            var uri = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/V1/GetSecurityEvents")
                    .addParameter("boxId", boxId);

            addParameterIfNotNull(uri, "afterIndexKey", afterIndexKey);
            addParameterIfNotNull(uri, "count", count);

            var request = RequestBuilder.get(uri.build());
            return SecurityEventList.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
}
