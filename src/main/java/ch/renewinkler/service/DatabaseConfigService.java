package ch.renewinkler.service;

import ch.renewinkler.model.DatabaseConfiguration;
import ch.renewinkler.model.RuntimeConfiguration;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log
@Service
public class DatabaseConfigService {

    @Autowired
    ConfigurationService configurationService;

    public DatabaseConfiguration getDatabaseConfiguration() {
        return configurationService.getConfig().getDatabaseConfiguration();
    }

    public void update(DatabaseConfiguration databaseConfiguration) {
        RuntimeConfiguration config = configurationService.getConfig();
        config.setDatabaseConfiguration(databaseConfiguration);
        //configurationService.writeConfig(config);
    }

}
