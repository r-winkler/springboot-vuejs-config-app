package ch.renewinkler.service;

import ch.renewinkler.model.ModuleConfiguration;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log
@Service
public class ModuleConfigService {

    @Autowired
    ConfigurationService configurationService;

    public ModuleConfiguration get() {
        return configurationService.getConfig().getModuleConfiguration();
    }

    public void update(ModuleConfiguration moduleConfiguration) {
    }

}
