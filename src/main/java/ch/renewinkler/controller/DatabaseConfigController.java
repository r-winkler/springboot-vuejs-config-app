package ch.renewinkler.controller;

import ch.renewinkler.model.DatabaseConfiguration;
import ch.renewinkler.service.DatabaseConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/config/database")
public class DatabaseConfigController {

    @Autowired
    DatabaseConfigService databaseConfigService;

    @GetMapping
    public DatabaseConfiguration get() throws IOException {
        return databaseConfigService.getDatabaseConfiguration();
    }

    @PutMapping
    public @ResponseBody
    String update(@RequestBody DatabaseConfiguration databaseConfiguration) throws IOException {
        databaseConfigService.update(databaseConfiguration);
        return "ok";
    }

}

