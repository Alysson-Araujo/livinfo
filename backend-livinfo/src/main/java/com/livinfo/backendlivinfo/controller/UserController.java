package com.livinfo.backendlivinfo.controller;

import com.livinfo.backendlivinfo.domain.user.User;
import com.livinfo.backendlivinfo.domain.user.UserDTO;
import com.livinfo.backendlivinfo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserService service;
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserDTO user){
        User newUser = service.createUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> listUsers = service.getAllUsers();
        return new ResponseEntity<>(listUsers, HttpStatus.ACCEPTED);
    }
}
