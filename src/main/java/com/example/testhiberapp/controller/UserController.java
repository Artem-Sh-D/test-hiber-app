package com.example.testhiberapp.controller;

import com.example.testhiberapp.dto.UserSaveDto;
import com.example.testhiberapp.entity.User;
import com.example.testhiberapp.repository.UserRepo;
import com.example.testhiberapp.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;
    private UserRepo userRepo;

    public UserController(UserService userService, UserRepo userRepo) {
        this.userRepo = userRepo;
        this.userService = userService;
    }

    @GetMapping("/allusers")
    public Iterable<User> viewUsers() {
        return userRepo.findAll();
    }

    @PostMapping("/adduser")
    public void saveUser(@RequestBody UserSaveDto dto) {
        userService.saveUser(dto);
    }
}
