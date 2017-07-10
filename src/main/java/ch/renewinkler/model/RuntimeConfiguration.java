package ch.renewinkler.model;

import lombok.Data;

@Data
public class RuntimeConfiguration {

    private RuntimeApplicationConfiguration runtimeApplicationConfiguration;
    private DatabaseConfiguration databaseConfiguration;
    private ModuleConfiguration moduleConfiguration;

}
