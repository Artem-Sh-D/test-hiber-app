package com.example.testhiberapp.controller;

import com.example.testhiberapp.entity.Credit;
import com.example.testhiberapp.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditController {

    private UserService userService;

    public CreditController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/addcredit")
    public void addCredit(@RequestBody Credit credit) {
        userService.saveUserCredit(credit);
    }
}
