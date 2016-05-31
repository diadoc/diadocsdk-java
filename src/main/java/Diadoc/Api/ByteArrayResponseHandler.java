package Diadoc.Api;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

public class ByteArrayResponseHandler implements ResponseHandler<byte[]>  {
	public byte[] handleResponse(final HttpResponse response) throws IOException {
        StatusLine statusLine = response.getStatusLine();
        if (statusLine.getStatusCode() >= 300) {
            throw new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase());
        }
        HttpEntity entity = response.getEntity();
        return entity == null ? null : EntityUtils.toByteArray(entity);
    }
}
