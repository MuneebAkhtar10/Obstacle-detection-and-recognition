package com.example.fyp1;

public class User {
    private String email;
    private String name;
    private String id;
    private String password;

    public User() {
    }

    public User(String email, String name, String id, String password) {
        this.email = email;
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
