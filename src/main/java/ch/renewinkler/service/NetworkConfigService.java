package ch.renewinkler.service;

import ch.renewinkler.model.NetworkConfiguration;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Log
@Service
public class NetworkConfigService {

    @Autowired
    ConfigurationService configurationService;

    public NetworkConfiguration get() throws IOException {
        return configurationService.getConfig().getRuntimeApplicationConfiguration().getNetworkConfiguration();
    }

    public void update(NetworkConfiguration networkConfiguration) {
    }

}
