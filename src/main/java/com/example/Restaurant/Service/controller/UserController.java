package com.example.Restaurant.Service.controller;

import com.example.Restaurant.Service.Model.User;
import com.example.Restaurant.Service.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("user")
    public User adduser(@RequestBody User user){
        return userService.adduser(user);
    }

    @GetMapping("users")
    public List<User> getalluser() {
        return userService.getalluser();
    }
}
