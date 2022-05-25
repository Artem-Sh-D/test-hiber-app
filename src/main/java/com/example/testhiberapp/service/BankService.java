package com.example.testhiberapp.service;


import com.example.testhiberapp.entity.Bank;
import com.example.testhiberapp.repository.BankRepo;
import org.springframework.stereotype.Service;

@Service
public class BankService {

    private BankRepo bankRepo;

    public BankService(BankRepo bankRepo) {
        this.bankRepo = bankRepo;
    }

    public void saveBank(Bank bank) {
        bankRepo.save(bank);
    }

}
