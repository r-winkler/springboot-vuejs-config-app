package ch.renewinkler.service;

import ch.renewinkler.model.RuntimeApplicationConfiguration;
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
public class RuntimeApplicationConfigService {

    @Value(value = "classpath:runtime-configuration.json")
    private Resource runtimeConfigurationFile;

    @Autowired
    ObjectMapper objectMapper;

    public RuntimeApplicationConfiguration get() {
        return getRuntimeConfiguration().getRuntimeApplicationConfiguration();
    }

    public void update(RuntimeApplicationConfiguration runtimeApplicationConfiguration) {
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
