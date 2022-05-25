package com.example.testhiberapp.service;


import com.example.testhiberapp.dto.CreditSaveDto;
import com.example.testhiberapp.entity.Credit;
import com.example.testhiberapp.entity.User;
import com.example.testhiberapp.repository.CreditRepo;
import com.example.testhiberapp.repository.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class CreditService {

    private UserRepo userRepo;
    private CreditRepo creditRepo;

    public CreditService(UserRepo userRepo, CreditRepo creditRepo) {
        this.userRepo = userRepo;
        this.creditRepo = creditRepo;
    }

    public void saveCredit(CreditSaveDto dto) {
        Credit credit = createCredit(dto);
        User user = userRepo.findUserByPassNum(dto.getPassNum());
        user.setCredit(credit);
        userRepo.save(user);
    }

    private Credit createCredit(CreditSaveDto dto) {
        Credit creditForSave = new Credit();
        creditForSave.setValue(dto.getValue());
        creditRepo.save(creditForSave);
        //todo Прочитать про состояния объекта Hibernate (Persist и прочие)
        return creditForSave;
    }

    public String pay(Long value, Long userId) {
        User user = userRepo.findUserById(userId);
        if(user.getCredit().getValue() != 0){
            user.getCredit().setValue((int) (user.getCredit().getValue() - value));
            userRepo.save(user);
            return "Вам осталось выплатить " + user.getCredit().getValue();
        } else {
            return "Вы выплатили свой кредит !";
        }
    }
}
