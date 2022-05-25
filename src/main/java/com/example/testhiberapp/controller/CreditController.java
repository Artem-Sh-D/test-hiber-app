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
        //todo и не забудь указать потом, что кредит выплачен, и в случае чего как-то информировать отправителя
        //(как ты будешь его информировать - дело твоё, можешь просто вернуть стрингу "ПРИПАПУ")
        //todo НА КААААЖДЫЙ запрос показывай клиенту сколько осталось платить
       return creditService.pay(value, userId);
    }
}
