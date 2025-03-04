package Diadoc.Api;

import java.time.Duration;

public class ConnectionSettings {

    private final int maxTotalConnections;
    private final int maxConnectionsPerRoute;

    private final Duration connectionRequestTimeout;

    private final Duration connectTimeout;

    private final Duration socketTimeout;

    public ConnectionSettings(int maxTotalConnections, int maxConnectionsPerRoute) {
        var maxConnections = 10;
        if(maxTotalConnections > maxConnections || maxConnectionsPerRoute > maxConnections){
            throw new IllegalArgumentException("Max connections can't be more " + maxConnections);
        }

        this.maxTotalConnections = maxTotalConnections;
        this.maxConnectionsPerRoute = maxConnectionsPerRoute;
        this.connectionRequestTimeout = Duration.ZERO;
        this.connectTimeout = Duration.ZERO;
        this.socketTimeout = Duration.ZERO;
    }

    public ConnectionSettings(int maxTotalConnections, int maxConnectionsPerRoute, Duration connectionRequestTimeout, Duration connectTimeout, Duration socketTimeout) {
        var maxConnections = 10;
        if(maxTotalConnections > maxConnections || maxConnectionsPerRoute > maxConnections){
            throw new IllegalArgumentException("Max connections can't be more " + maxConnections);
        }

        this.maxTotalConnections = maxTotalConnections;
        this.maxConnectionsPerRoute = maxConnectionsPerRoute;
        this.connectionRequestTimeout = connectionRequestTimeout;
        this.connectTimeout = connectTimeout;
        this.socketTimeout = socketTimeout;
    }

    public int getMaxTotalConnections() {
        return maxTotalConnections;
    }

    public int getMaxConnectionsPerRoute() {
        return maxConnectionsPerRoute;
    }

    public Duration getConnectionRequestTimeout() {
        return connectionRequestTimeout;
    }

    public Duration getConnectTimeout() {
        return connectTimeout;
    }

    public Duration getSocketTimeout() {
        return socketTimeout;
    }
}
