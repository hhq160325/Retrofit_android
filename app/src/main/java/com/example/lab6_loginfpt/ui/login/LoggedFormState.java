package com.example.lab6_loginfpt.ui.login;

public class LoggedFormState {
    private boolean isLoggedIn;
    private String email;
    private String errorMessage;

    public LoggedFormState(boolean isLoggedIn, String email, String errorMessage) {
        this.isLoggedIn = isLoggedIn;
        this.email = email;
        this.errorMessage = errorMessage;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}