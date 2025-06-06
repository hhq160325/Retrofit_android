package com.example.lab6_loginfpt.data.model;

public class ForgotPasswordRequest {
    private String email;

    public ForgotPasswordRequest(String email) {
        this.email = email;
    }

    // Optional getter
    public String getEmail() {
        return email;
    }
}
