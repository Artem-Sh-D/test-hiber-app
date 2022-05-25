package com.example.testhiberapp.service;

import com.example.testhiberapp.dto.UserSaveDto;
import com.example.testhiberapp.entity.Bank;
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
        user.setFirstname(otd.getFirstName());
        user.setLastname(otd.getLastName());
        user.setAge(otd.getAge());
        user.setPhoneNumber(otd.getPhoneNumber());
        user.setAddress(otd.getAddress());
        user.setEmail(otd.getUserEmail());
        user.setPassNum(otd.getPassNum());

        Bank bank = bankRepo.findByName(otd.getBankName());
        if (bank != null) {
            user.setBank(bank);
        } else {
            throw new IllegalArgumentException("Error!");
        }
        userRepo.save(user);
    }

    public Iterable<User> getAllUsers() {
        return userRepo.findAll();
    }
}
