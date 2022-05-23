package com.example.testhiberapp.dto;

/**
 * {
 *     userName: "Vova",
 *     userEmail: "Vova@email.com"
 *     bankName : "ВТБ"
 * }
 * */

public class UserSaveDto {
    private String userName;
    private String userEmail;
    private String bankName;

    public UserSaveDto() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
