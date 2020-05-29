package Diadoc.Api.httpClient;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;

public class ContentLengthInterceptor implements HttpRequestInterceptor {
    @Override
    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        if(!httpRequest.containsHeader("Content-Length")){
            httpRequest.setHeader("Content-Length", "0");
        }
    }
}
