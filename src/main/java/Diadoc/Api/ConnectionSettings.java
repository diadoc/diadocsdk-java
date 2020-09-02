package Diadoc.Api;

public class ConnectionSettings {

    private int maxTotalConnections;
    private int maxConnectionsPerRoute;

    public ConnectionSettings(int maxTotalConnections, int maxConnectionsPerRoute) {
        var maxConnections = 10;
        if(maxTotalConnections > maxConnections || maxConnectionsPerRoute > maxConnections){
            throw new IllegalArgumentException("Max connections can't be more " + maxConnections);
        }

        this.maxTotalConnections = maxTotalConnections;
        this.maxConnectionsPerRoute = maxConnectionsPerRoute;
    }

    public int getMaxTotalConnections() {
        return maxTotalConnections;
    }

    public int getMaxConnectionsPerRoute() {
        return maxConnectionsPerRoute;
    }
}
