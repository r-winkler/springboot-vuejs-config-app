package ch.renewinkler.service;

import ch.renewinkler.model.ModuleConfiguration;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Log
@Service
public class ModuleConfigService {

    @Autowired
    ConfigurationService configurationService;

    public ModuleConfiguration get() throws IOException {
        return configurationService.getConfig().getModuleConfiguration();
    }

    public void update(ModuleConfiguration moduleConfiguration) {
    }

}
