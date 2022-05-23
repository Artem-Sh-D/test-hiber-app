package com.example.testhiberapp.service;


import com.example.testhiberapp.entity.Bank;
import com.example.testhiberapp.repository.BankRepo;
import org.springframework.stereotype.Service;

@Service
public class BankService {

    public BankService(BankRepo bankRepo) {
        this.bankRepo = bankRepo;
    }

    private BankRepo bankRepo;

    public void saveBank(Bank bank) {
        bankRepo.save(bank);
    }

}
