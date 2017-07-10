package ch.renewinkler.controller;

import ch.renewinkler.model.NetworkConfiguration;
import ch.renewinkler.service.NetworkConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/config/network")
public class NetworkConfigController {

    @Autowired
    NetworkConfigService networkConfigService;

    @GetMapping
    public NetworkConfiguration get() throws IOException {
        return networkConfigService.get();
    }

    @PutMapping
    public @ResponseBody
    String update(@RequestBody NetworkConfiguration networkConfiguration) throws IOException {
        networkConfigService.update(networkConfiguration);
        return "ok";
    }

}

