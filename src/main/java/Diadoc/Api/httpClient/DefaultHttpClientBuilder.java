package Diadoc.Api.httpClient;

import Diadoc.Api.ConnectionSettings;
import Diadoc.Api.auth.DiadocPreemptiveAuthRequestInterceptor;
import Diadoc.Api.helpers.EnvironmentHelpers;
import org.apache.http.HttpHost;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustAllStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;
import org.jetbrains.annotations.Nullable;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.function.Consumer;

public class DefaultHttpClientBuilder {

    private Consumer<PoolingHttpClientConnectionManager> connectionManagerConfigurer;

    private Consumer<HttpClientBuilder> httpBuilderConfigurer;

    public CloseableHttpClient build(CredentialsProvider credentialsProvider) {
        SSLConnectionSocketFactory sslSocketFactory = trustfulSslSocketFactory();
        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager(
                RegistryBuilder.<ConnectionSocketFactory>create()
                        .register("https", sslSocketFactory)
                        .register("http", new PlainConnectionSocketFactory())
                .build()
        );
        if (connectionManagerConfigurer != null) {
            connectionManagerConfigurer.accept(connectionManager);
        }

        HttpClientBuilder builder = HttpClients.custom()
                .setSSLSocketFactory(sslSocketFactory)
                .setConnectionManager(connectionManager)
                .setUserAgent(EnvironmentHelpers.getUserAgentString())
                .addInterceptorFirst(new DiadocPreemptiveAuthRequestInterceptor())
                .addInterceptorLast(new ContentLengthInterceptor())
                .setDefaultCredentialsProvider(credentialsProvider);

        if (httpBuilderConfigurer != null) {
            httpBuilderConfigurer.accept(builder);
        }

        return builder.build();
    }

    public DefaultHttpClientBuilder configureConnectionManager(
            Consumer<PoolingHttpClientConnectionManager> connectionManagerConfigurer
    ) {
        this.connectionManagerConfigurer = connectionManagerConfigurer;
        return this;
    }


    public DefaultHttpClientBuilder configureHttpBuilder(Consumer<HttpClientBuilder> httpBuilderConfigurer) {
        this.httpBuilderConfigurer = httpBuilderConfigurer;
        return this;
    }


    public static DefaultHttpClientBuilder defaultClient(
            @Nullable HttpHost proxyHost,
            @Nullable ConnectionSettings connectionSettings
    ) {
        DefaultHttpClientBuilder builder = new DefaultHttpClientBuilder();
        if (connectionSettings != null) {
            builder.configureConnectionManager(cm -> {
                cm.setMaxTotal(connectionSettings.getMaxTotalConnections());
                cm.setDefaultMaxPerRoute(connectionSettings.getMaxConnectionsPerRoute());
            });
        }

        if (proxyHost != null) {
            builder.configureHttpBuilder(b -> {
                b.setProxy(proxyHost);
            });
        }
        return builder;
    }


    public static SSLConnectionSocketFactory trustfulSslSocketFactory() {
        try {
            var ctx = SSLContextBuilder.create().loadTrustMaterial(new TrustAllStrategy()).build();
            return new SSLConnectionSocketFactory(ctx, NoopHostnameVerifier.INSTANCE);
        } catch (NoSuchAlgorithmException | KeyManagementException | KeyStoreException e) {
            e.printStackTrace();
            throw new RuntimeException("Can't create ssl connection factory", e);
        }
    }


}
