package com.openclassroom.webapp.model;

import lombok.Data;

@Data // um getter und setter automatisch zu generieren
public class Employee {

    private Integer id;
    private String firstName;
    private String lastName;
    private String mail;
    private String password;
}
