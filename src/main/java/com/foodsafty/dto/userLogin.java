package com.foodsafty.dto;

public class userLogin {
    private boolean state;

    private String userId;

    private String userPassword;

    public userLogin(boolean state, String userId) {
        this.state = state;
        this.userId = userId;
    }

    public userLogin(boolean state) {
        this.state = state;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
