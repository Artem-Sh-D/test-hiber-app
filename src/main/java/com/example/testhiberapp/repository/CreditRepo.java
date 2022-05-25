package com.example.testhiberapp.repository;

import com.example.testhiberapp.entity.Credit;
import org.springframework.data.repository.CrudRepository;

public interface CreditRepo  extends CrudRepository<Credit,Long> {
}
