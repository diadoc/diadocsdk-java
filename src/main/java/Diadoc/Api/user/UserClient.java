package Diadoc.Api.user;

import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;

import java.io.IOException;
import java.net.URISyntaxException;

import static Diadoc.Api.Proto.UserProtos.*;
import static Diadoc.Api.Proto.Users.UserToUpdateProtos.*;

public class UserClient {
    private DiadocHttpClient diadocHttpClient;

    public UserClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    public User getMyUser() throws DiadocSdkException {
        try {
            var request = RequestBuilder.get(
                    new URIBuilder(diadocHttpClient.getBaseUrl()).setPath("/GetMyUser").build());
            return User.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public UserV2 getMyUserV2() throws DiadocSdkException {
        try {
            var request = RequestBuilder.get(
                    new URIBuilder(diadocHttpClient.getBaseUrl()).setPath("/V2/GetMyUser").build());
            return UserV2.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public UserV2 updateMyUser(UserToUpdate userToUpdate) throws DiadocSdkException {
        if (userToUpdate == null) {
            throw new IllegalArgumentException("userToUpdate");
        }
        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/UpdateMyUser")
                            .build())
                    .setEntity(new ByteArrayEntity(userToUpdate.toByteArray()));
            return UserV2.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

}
