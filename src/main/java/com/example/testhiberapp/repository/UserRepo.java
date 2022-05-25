package com.example.testhiberapp.repository;

import com.example.testhiberapp.entity.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepo extends CrudRepository<User,Long> {
    User findUserById(Long userId);
    User findUserByPassNum(String passNum);
}
