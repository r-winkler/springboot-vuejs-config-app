package ch.renewinkler.service;

import ch.renewinkler.model.DatabaseConfiguration;
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
public class DatabaseConfigService {

    @Value(value = "classpath:runtime-configuration.json")
    private Resource runtimeConfigurationFile;

    @Autowired
    ObjectMapper objectMapper;

    public DatabaseConfiguration getDatabaseConfiguration() {
        return getRuntimeConfiguration().getDatabaseConfiguration();
    }

    public void update(DatabaseConfiguration databaseConfiguration) {
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
