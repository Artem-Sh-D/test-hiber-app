package com.example.testhiberapp.controller;


import com.example.testhiberapp.dto.CreditSaveDto;
import com.example.testhiberapp.service.CreditService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/credit")
public class CreditController {

    private CreditService creditService;

    public CreditController(CreditService creditService) {
        this.creditService = creditService;
    }

    @PostMapping("/newCredit")
    public void addCredit(@RequestBody CreditSaveDto dto) {
        creditService.saveCredit(dto);
    }

    @PostMapping("/pay")
    public String creditPay(@RequestParam Long value, @RequestParam Long userId) {
       return creditService.pay(value, userId);
    }
}
