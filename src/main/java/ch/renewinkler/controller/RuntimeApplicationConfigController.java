package ch.renewinkler.controller;

import ch.renewinkler.model.RuntimeApplicationConfiguration;
import ch.renewinkler.service.RuntimeApplicationConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/config/application")
public class RuntimeApplicationConfigController {

    @Autowired
    RuntimeApplicationConfigService runtimeApplicationConfigService;

    @GetMapping
    public RuntimeApplicationConfiguration get() throws IOException {
        return runtimeApplicationConfigService.get();
    }

    @PutMapping
    public @ResponseBody
    String update(@RequestBody RuntimeApplicationConfiguration runtimeApplicationConfiguration) {
        runtimeApplicationConfigService.update(runtimeApplicationConfiguration);
        return "ok";
    }

}

