package com.jeet.demo.service;

import com.jeet.demo.dto.UserLoginDto;
import com.jeet.demo.entity.Users;
import com.jeet.demo.repository.UserRepository;
import com.jeet.demo.service.orderInterface.UserService;
import com.jeet.demo.utility.PasswordDecrypter;
import com.jeet.demo.utility.PasswordEncrypter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    public String addUser(Users users){
        users.setPassword(PasswordEncrypter.encryptPassword(users.getPassword()));
        userRepository.save(users);
        return "Successfully added.";
    };
    public Boolean authenticateUser(UserLoginDto userLoginDto){
        try{
        Users users =userRepository.findByUsername(userLoginDto.getUsername());
        String loggedPassword=PasswordDecrypter.decryptPassword(users.getPassword());
        if(loggedPassword.equals(userLoginDto.getPassword())){
            return true;
        }}catch(NullPointerException ex){
            return false;
        }
        return false;
    };
}
