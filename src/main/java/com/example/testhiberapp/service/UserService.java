package com.example.testhiberapp.service;

import com.example.testhiberapp.dto.UserSaveDto;
import com.example.testhiberapp.entity.Bank;
import com.example.testhiberapp.entity.Credit;
import com.example.testhiberapp.entity.User;
import com.example.testhiberapp.repository.BankRepo;
import com.example.testhiberapp.repository.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepo userRepo;
    private BankRepo bankRepo;


    public UserService(UserRepo userRepo, BankRepo bankRepo) {
        this.userRepo = userRepo;
        this.bankRepo = bankRepo;
    }

    public void saveUser(UserSaveDto otd) {
        User user = new User();
        user.setEmail(otd.getUserEmail());
        user.setName(otd.getUserName());

        Bank bank = bankRepo.findByName(otd.getBankName());
        if (bank != null) {
            user.setBank(bank);
        } else {
            throw new IllegalArgumentException("Error!");
        }
        userRepo.save(user);
    }

    public void saveUserCredit(Credit Credit) {

    }
}
