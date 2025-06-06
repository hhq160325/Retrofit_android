package com.example.lab6_loginfpt.data.model;

public class NewPassRequest {
    private String email;
    private String newPassword;

    public NewPassRequest(String email, String newPassword) {
        this.email = email;
        this.newPassword = newPassword;
    }

    // Optional getters
    public String getEmail() {
        return email;
    }

    public String getNewPassword() {
        return newPassword;
    }
}

