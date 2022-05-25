package com.example.testhiberapp.controller;


import com.example.testhiberapp.dto.CreditSaveDto;
import com.example.testhiberapp.service.CreditService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/credit")
public class CreditController {

    private UserService userService;

    public CreditController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/newCredit")
    public void addCredit(@RequestBody CreditSaveDto dto) {
        creditService.saveCredit(dto);
    }
}
