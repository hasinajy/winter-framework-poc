package jy.itu.poc.model.entity;

import lombok.Data;

@Data
public class SystemUser {
    private long id;
    private String username;
    private String password;
    private String role;
}
