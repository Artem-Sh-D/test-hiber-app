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

    public void saveUser(UserSaveDto dto) {
        User user = new User();
        user.setFirstname(dto.getFirstName());
        user.setLastname(dto.getLastName());
        user.setAge(dto.getAge());
        user.setPhoneNumber(dto.getPhoneNumber());
        user.setAddress(dto.getAddress());
        user.setEmail(dto.getUserEmail());
        user.setPassNum(dto.getPassNum());

        Bank bank = bankRepo.findByName(dto.getBankName());
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
