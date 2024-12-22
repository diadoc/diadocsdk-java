package Diadoc.Api.template;

import Diadoc.Api.Proto.Events.DiadocMessage_GetApiProtos;
import Diadoc.Api.Proto.Events.DiadocMessage_PostApiProtos;
import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.helpers.Tools;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import static Diadoc.Api.Proto.Events.DiadocMessage_GetApiProtos.*;
import static Diadoc.Api.Proto.Events.DiadocMessage_PostApiProtos.*;

public class TemplateClient {
    private DiadocHttpClient diadocHttpClient;

    public TemplateClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    public Template postTemplate(TemplateToPost templateToPost) throws DiadocSdkException {
        if (templateToPost == null) {
            throw new IllegalArgumentException("templateToPost");
        }

        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl()).setPath("/PostTemplate").build())
                    .setEntity(new ByteArrayEntity(templateToPost.toByteArray()));

            return Template.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public Message transformTemplateToMessage(TemplateTransformationToPost templateTransformationToPost) throws DiadocSdkException {
        if (templateTransformationToPost == null) {
            throw new IllegalArgumentException("templateTransformationToPost");
        }

        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl()).setPath("/TransformTemplateToMessage").build())
                    .setEntity(new ByteArrayEntity(templateTransformationToPost.toByteArray()));

            return Message.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link Diadoc.Api.message.MessageClient#getMessage(String, String)}
     */
    @Deprecated
    public Template getTemplate(String currentBoxId, String templateId, @Nullable String entityId) throws DiadocSdkException {
        if (currentBoxId == null) {
            throw new IllegalArgumentException("currentBoxId");
        }
        if (templateId == null) {
            throw new IllegalArgumentException("templateId");
        }

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/GetTemplate")
                    .addParameter("boxId", currentBoxId)
                    .addParameter("templateId", templateId);

            if(!Tools.isNullOrEmpty(entityId)){
                url.addParameter("entityId", entityId);
            }

            var request = RequestBuilder.get(url.build());

            return Template.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public MessagePatch postTemplatePatch(
            String boxId,
            String templateId,
            DiadocMessage_PostApiProtos.TemplatePatchToPost templatePatchToPost) throws DiadocSdkException {

        return postTemplatePatch(boxId, templateId, null, templatePatchToPost);
    }

    public MessagePatch postTemplatePatch(
            String boxId,
            String templateId,
            @Nullable String operationId,
            DiadocMessage_PostApiProtos.TemplatePatchToPost templatePatchToPost) throws DiadocSdkException {

        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (templateId == null) {
            throw new IllegalArgumentException("templateId");
        }
        if (templatePatchToPost == null) {
            throw new IllegalArgumentException("templatePatchToPost");
        }

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/PostTemplatePatch")
                    .addParameter("boxId", boxId)
                    .addParameter("templateId", templateId);
            Tools.addParameterIfNotNull(url, "operationId", operationId);
            var request = RequestBuilder.post(url.build())
                    .setEntity(new ByteArrayEntity(templatePatchToPost.toByteArray()));

            return MessagePatch.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
}
