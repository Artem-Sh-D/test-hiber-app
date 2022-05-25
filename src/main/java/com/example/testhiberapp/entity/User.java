package com.example.testhiberapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    @Column(name = "phoneNumber")
    private String phoneNumber;

    //todo НАВЕСЬ КОНСТРЕИНТ, ЧТОБЫ ВАЛИДАЦИЯ БЫЛА ЖЕСТКАЯ И ДАННЫЕ ИДЕАЛЬНО ПО ФОРМАТУ ПРОХОДИЛИ
    //TODO CONSTRAINT на уникальность, на количество символов в хранимой стринге (Они навешиваются в БД)
    @Column(name = "passNum")
    private String passNum;

    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;

    @OneToOne
    @JoinColumn(name = "credit_id")
    private Credit credit;


    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassNum() {
        return passNum;
    }

    public void setPassNum(String passNum) {
        this.passNum = passNum;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
