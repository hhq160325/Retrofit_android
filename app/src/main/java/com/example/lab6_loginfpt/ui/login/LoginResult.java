package com.example.lab6_loginfpt.ui.login;

public class LoginResult {
    private boolean success;
    private String errorMessage;
    private LoggedInUserView user;

    public LoginResult(boolean success, String errorMessage, LoggedInUserView user) {
        this.success = success;
        this.errorMessage = errorMessage;
        this.user = user;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public LoggedInUserView getUser() {
        return user;
    }

    public void setUser(LoggedInUserView user) {
        this.user = user;
    }
}