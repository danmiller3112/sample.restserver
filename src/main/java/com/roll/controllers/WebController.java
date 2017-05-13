package com.roll.controllers;


import com.roll.entities.User;
import com.roll.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "/api")
public class WebController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Collection<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable long id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @RequestMapping(value = "/delUser/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable long id) {
        userService.remove(id);
    }


}
