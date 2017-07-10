package ch.renewinkler.service;

import ch.renewinkler.model.RuntimeApplicationConfiguration;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log
@Service
public class RuntimeApplicationConfigService {

    @Autowired
    ConfigurationService configurationService;

    public RuntimeApplicationConfiguration get() {
        return configurationService.getConfig().getRuntimeApplicationConfiguration();
    }

    public void update(RuntimeApplicationConfiguration runtimeApplicationConfiguration) {
    }

}
