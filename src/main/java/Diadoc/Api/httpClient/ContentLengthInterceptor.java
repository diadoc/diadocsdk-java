package Diadoc.Api.httpClient;

import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;

import java.io.IOException;

public class ContentLengthInterceptor implements HttpRequestInterceptor {
    @Override
    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        if(!httpRequest.containsHeader("Content-Length")){
            httpRequest.setHeader("Content-Length", "0");
        }
    }
}
