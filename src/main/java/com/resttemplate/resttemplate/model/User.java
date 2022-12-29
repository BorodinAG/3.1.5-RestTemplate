package com.resttemplate.resttemplate.model;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private String lastName;
    private Integer age;

    public User(Long id, String name, String lastName, Integer age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}
