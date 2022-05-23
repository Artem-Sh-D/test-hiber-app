package com.example.testhiberapp.repository;

import com.example.testhiberapp.entity.Bank;
import org.springframework.data.repository.CrudRepository;

public interface BankRepo extends CrudRepository<Bank,Long> {
    Bank findByName(String bankName);
}
