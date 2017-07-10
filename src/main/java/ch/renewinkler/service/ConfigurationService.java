package ch.renewinkler.service;

import ch.renewinkler.model.RuntimeConfiguration;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Log
@Service
public class ConfigurationService {

    private File file = new File("runtime-configuration.json");

    @Autowired
    ObjectMapper objectMapper;

    public RuntimeConfiguration getConfig() throws IOException {
        RuntimeConfiguration runtimeConfiguration = objectMapper.readValue(file, RuntimeConfiguration.class);
        return runtimeConfiguration;
    }

    public void writeConfig(RuntimeConfiguration config) throws IOException {
        objectMapper.writeValue(file, config);
    }
}
