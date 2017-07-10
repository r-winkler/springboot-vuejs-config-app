package ch.renewinkler.model;

import lombok.Data;

@Data
public class DatabaseConfiguration {

    private String type;
    private String url;
    private Integer port;
    private String username;
    private String password;
}
