package Diadoc.Api.documentWorkflow;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;

import Diadoc.Api.Proto.Workflows.DocumentWorkflowSettingsProtos.DocumentWorkflowSettingsListV2;
import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.httpClient.DiadocHttpClient;

public class DocumentWorkflowClient {
    private DiadocHttpClient diadocHttpClient;

    public DocumentWorkflowClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    public DocumentWorkflowSettingsListV2 getWorkflowsSettings(String boxId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/V2/GetWorkflowsSettings")
                    .addParameter("boxId", boxId);

            var request = RequestBuilder.get(url.build());

            return DocumentWorkflowSettingsListV2.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
}
