package ch.renewinkler.service;

import ch.renewinkler.model.DatabaseConfiguration;
import ch.renewinkler.model.RuntimeConfiguration;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Log
@Service
public class DatabaseConfigService {

    @Autowired
    ConfigurationService configurationService;

    public DatabaseConfiguration getDatabaseConfiguration() throws IOException {
        return configurationService.getConfig().getDatabaseConfiguration();
    }

    public void update(DatabaseConfiguration databaseConfiguration) throws IOException {
        RuntimeConfiguration config = configurationService.getConfig();
        config.setDatabaseConfiguration(databaseConfiguration);
        configurationService.writeConfig(config);
    }

}
