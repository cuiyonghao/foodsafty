package com.foodsafty.entity;

public class manager {

    private String managerName;

    private String managerPassword;


    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

    @Override
    public String toString() {
        return "manager{" +
                "managerName='" + managerName + '\'' +
                ", managerPassword='" + managerPassword + '\'' +
                '}';
    }
}
