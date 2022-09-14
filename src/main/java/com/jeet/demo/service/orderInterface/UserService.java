package com.jeet.demo.service.orderInterface;

import com.jeet.demo.entity.User;

public interface UserService {
    public String addUser(User user);
    public Boolean authenticateUser(String username, String password);
}
