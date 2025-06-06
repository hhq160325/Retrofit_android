package com.example.lab6_loginfpt.ui.login;

public class LoggedInUserView {
    private String displayName;
    private String email;
    private String profileImageUrl;

    public LoggedInUserView(String displayName, String email, String profileImageUrl) {
        this.displayName = displayName;
        this.email = email;
        this.profileImageUrl = profileImageUrl;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }
}