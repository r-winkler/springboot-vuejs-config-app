package ch.renewinkler.controller;

import ch.renewinkler.model.ModuleConfiguration;
import ch.renewinkler.service.ModuleConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/config/module")
public class ModuleConfigController {

    @Autowired
    ModuleConfigService moduleConfigService;

    @GetMapping
    public ModuleConfiguration get() {
        return moduleConfigService.get();
    }

    @PutMapping
    public @ResponseBody
    String update(@RequestBody ModuleConfiguration moduleConfiguration) {
        moduleConfigService.update(moduleConfiguration);
        return "ok";
    }

}

