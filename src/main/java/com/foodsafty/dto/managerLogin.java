package com.foodsafty.dto;

public class managerLogin {
    //
    private boolean state;

    private String managerId;

    private String stateInfo;

    public managerLogin(boolean state, String managerId) {
        this.state = state;
        this.managerId = managerId;
    }

    public managerLogin(boolean state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }
}
