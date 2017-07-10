package ch.renewinkler.model;

import lombok.Data;

@Data
public class RuntimeApplicationConfiguration {

    private boolean httpCaching;
    private int maxAgeCaching;
    private long sessionTimeout;
    private NetworkConfiguration networkConfiguration;

}
