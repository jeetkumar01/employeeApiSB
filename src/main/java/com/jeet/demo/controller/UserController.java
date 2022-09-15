package com.jeet.demo.controller;

import com.jeet.demo.dto.UserLoginDto;
import com.jeet.demo.entity.Users;
import com.jeet.demo.service.orderInterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

   @Autowired
   private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<Boolean> getLoginStatus(@RequestBody UserLoginDto userLoginDto){

        Boolean userAuthenticated = userService.authenticateUser(userLoginDto);
        if(userAuthenticated){
            return new ResponseEntity<>(true, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(false,HttpStatus.UNAUTHORIZED);
        }
    }

    @PostMapping("/user")
    public ResponseEntity<?> addUser(@RequestBody Users users){
        String result = userService.addUser(users);

        return new ResponseEntity<>(result,HttpStatus.CREATED);
    }
}
