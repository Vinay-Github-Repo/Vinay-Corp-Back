package com.springrest.springrest.Controller;

import com.springrest.springrest.Model.Users;
import com.springrest.springrest.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public ResponseEntity getUserByEmailPassword(@RequestParam String email, @RequestParam String password){
        return new ResponseEntity(userService.getUserByEmailPassword(email,password), HttpStatus.ACCEPTED);
    }

    @PostMapping("/user/add")
    public ResponseEntity addNewUser(@RequestBody Users users){
        return new ResponseEntity(userService.addNewUser(users),HttpStatus.CREATED);
    }


}
