package com.roll.services.impl;

import com.roll.entities.User;
import com.roll.repository.UserRepository;
import com.roll.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(long id) {
        return userRepository.findOne(id);
    }

    public User saveUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    public void remove(long id) {
        userRepository.delete(id);
    }
}
