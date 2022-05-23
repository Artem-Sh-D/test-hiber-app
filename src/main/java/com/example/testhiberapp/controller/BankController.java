package com.example.testhiberapp.controller;

import com.example.testhiberapp.entity.Bank;
import com.example.testhiberapp.service.BankService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    private BankService bankService;

    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @PostMapping("/addbank")
    public void addBank(@RequestBody Bank bank) {
        bankService.saveBank(bank);
    }
}
