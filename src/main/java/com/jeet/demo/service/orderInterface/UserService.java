package com.jeet.demo.service.orderInterface;

import com.jeet.demo.dto.UserLoginDto;
import com.jeet.demo.entity.Users;


public interface UserService {
    public String addUser(Users users);
    public Boolean authenticateUser(UserLoginDto userLoginDto);
}
