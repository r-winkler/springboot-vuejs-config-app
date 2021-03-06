package ch.renewinkler.controller;

import ch.renewinkler.model.ModuleConfiguration;
import ch.renewinkler.service.ModuleConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/config/module")
public class ModuleConfigController {

    @Autowired
    ModuleConfigService moduleConfigService;

    @GetMapping
    public ModuleConfiguration get() throws IOException {
        return moduleConfigService.get();
    }

    @PutMapping
    public @ResponseBody
    String update(@RequestBody ModuleConfiguration moduleConfiguration) throws IOException {
        moduleConfigService.update(moduleConfiguration);
        return "ok";
    }

}

