package com.example.lab6_loginfpt.data.model;

public class ChangePasswordRequest {
    private String username;
    private String oldPassword;
    private String newPassword;

    public ChangePasswordRequest(String username, String oldPassword, String newPassword) {
        this.username = username;
        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
    }

    // Optional: Getters & Setters
    public String getUsername() {
        return username;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }
}
