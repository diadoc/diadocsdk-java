package Diadoc.Api.operators;

import Diadoc.Api.Proto.RoamingOperatorProtos;
import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.helpers.Tools;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;

import java.io.IOException;
import java.net.URISyntaxException;

public class OperatorClient {
    private final DiadocHttpClient diadocHttpClient;

    public OperatorClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    public RoamingOperatorProtos.RoamingOperatorList getRoamingOperators(String boxId) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(boxId)) {
            throw new IllegalArgumentException("boxId");
        }

        try{
            var request = RequestBuilder.get(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GetRoamingOperators")
                            .addParameter("boxId", boxId)
                            .build());
            return RoamingOperatorProtos.RoamingOperatorList.parseFrom(diadocHttpClient.performRequest(request));

        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
}
