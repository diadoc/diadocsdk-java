package Diadoc.Api;

public class ConnectionSettings {

    private int maxTotalConnections;
    private int maxConnectionsPerRoute;
    private int connectionRequestTimeout;
    private int connectTimeout;
    private int socketTimeout;

    public ConnectionSettings(int maxTotalConnections, int maxConnectionsPerRoute,
                              int connectionRequestTimeout, int connectTimeout, int socketTimeout) {
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

    public int getConnectionRequestTimeout() {
        return connectionRequestTimeout;
    }

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public int getSocketTimeout() {
        return socketTimeout;
    }
}
