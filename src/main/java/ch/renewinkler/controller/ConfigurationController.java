package ch.renewinkler.controller;

import ch.renewinkler.model.RuntimeApplicationConfiguration;
import ch.renewinkler.model.DatabaseConfiguration;
import ch.renewinkler.model.ModuleConfiguration;
import ch.renewinkler.model.NetworkConfiguration;
import ch.renewinkler.service.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigurationController {

    @Autowired
    ConfigurationService configurationService;

    @GetMapping("/database")
    public DatabaseConfiguration getDatabaseConfiguration() {
        return configurationService.getDatabaseConfiguration();
    }

    @GetMapping("/module")
    public ModuleConfiguration getModuleConfiguration()  {
        return configurationService.getModuleConfiguration();
    }

    @GetMapping("/application")
    public RuntimeApplicationConfiguration getApplicationConfiguration()  {
        return configurationService.getApplicationConfiguration();
    }

    @GetMapping("/network")
    public NetworkConfiguration getNetworkConfiguration()  {
        return configurationService.getNetworkConfiguration();
    }
}

