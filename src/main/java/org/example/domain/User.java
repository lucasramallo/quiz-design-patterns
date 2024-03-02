package org.example.domain;

import org.example.interfaces.IProgress;

import java.util.UUID;

public class User {
    public final UUID userId;
    private String userName;
    private String password;
    private IProgress progress;

    public User(String userName, String password) {
        this.userId = UUID.randomUUID();
        this.userName = userName;
        this.password = password;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

