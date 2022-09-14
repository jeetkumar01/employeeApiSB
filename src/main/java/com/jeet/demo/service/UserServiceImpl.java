package com.jeet.demo.service;

import com.jeet.demo.entity.User;
import com.jeet.demo.service.orderInterface.UserService;

public class UserServiceImpl implements UserService{
    public String addUser(User user){
        return "Successfully added.";
    };
    public Boolean authenticateUser(String username, String password){
        return true;
    };
}
