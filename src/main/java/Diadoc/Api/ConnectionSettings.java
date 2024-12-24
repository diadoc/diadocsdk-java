package Diadoc.Api;

import org.jetbrains.annotations.Nullable;

public class ConnectionSettings {

    private final int maxTotalConnections;
    private final int maxConnectionsPerRoute;
    private final @Nullable Integer connectionRequestTimeout;
    private final @Nullable Integer connectTimeout;
    private final @Nullable Integer socketTimeout;

    public ConnectionSettings(int maxTotalConnections, int maxConnectionsPerRoute) {
        var maxConnections = 10;
        if(maxTotalConnections > maxConnections || maxConnectionsPerRoute > maxConnections){
            throw new IllegalArgumentException("Max connections can't be more " + maxConnections);
        }

        this.maxTotalConnections = maxTotalConnections;
        this.maxConnectionsPerRoute = maxConnectionsPerRoute;
        this.connectionRequestTimeout = null;
        this.connectTimeout = null;
        this.socketTimeout = null;
    }

    public ConnectionSettings(int maxTotalConnections, int maxConnectionsPerRoute, int connectionRequestTimeout, int connectTimeout, int socketTimeout) {
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
    public @Nullable Integer getSocketTimeout() {
        return socketTimeout;
    }

    public @Nullable Integer getConnectTimeout() {
        return connectTimeout;
    }

    public @Nullable Integer getConnectionRequestTimeout() {
        return connectionRequestTimeout;
    }
}
