package com.roll.services;

import com.roll.entities.User;

import java.util.List;


public interface UserService {

    List<User> getAllUsers();

    User getUserById(long id);

    User saveUser(User user);

    void remove(long id);
}
