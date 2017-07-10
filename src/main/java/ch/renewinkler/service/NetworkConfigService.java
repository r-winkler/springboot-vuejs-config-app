package ch.renewinkler.service;

import ch.renewinkler.model.NetworkConfiguration;
import ch.renewinkler.model.RuntimeConfiguration;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Log
@Service
public class NetworkConfigService {

    @Value(value = "classpath:runtime-configuration.json")
    private Resource runtimeConfigurationFile;

    @Autowired
    ObjectMapper objectMapper;

    public NetworkConfiguration get() {
        return getRuntimeConfiguration().getRuntimeApplicationConfiguration().getNetworkConfiguration();
    }

    public void update(NetworkConfiguration networkConfiguration) {
    }

    private RuntimeConfiguration getRuntimeConfiguration() {
        RuntimeConfiguration runtimeConfiguration = null;
        try {
            runtimeConfiguration = objectMapper.readValue(runtimeConfigurationFile.getInputStream(), RuntimeConfiguration.class);
        } catch (IOException e) {
            log.severe(e.getMessage());
        }
        return runtimeConfiguration;
    }
}
