package com.example.testhiberapp.dto;

/**
 * {
 *     firstName: "Vova",
 *     lastName: "Kramaruha",
 *     age: "22",
 *     phoneNumber: "+791323212312",
 *     address: "Partizanskaya,125",
 *     userEmail: "Vova@email.com",
 *     bankName : "ВТБ",
 *     passNum:  "12345"
 * }
 * */

public class UserSaveDto {
    private String firstName;
    private String lastName;
    private Integer age;
    private String phoneNumber;
    private String address;
    private String userEmail;
    private String bankName;
    private String passNum;

    public UserSaveDto() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getPassNum() {
        return passNum;
    }

    public void setPassNum(String passNum) {
        this.passNum = passNum;
    }
}
