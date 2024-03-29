package com.livinfo.backendlivinfo.services;

import com.livinfo.backendlivinfo.domain.user.User;
import com.livinfo.backendlivinfo.domain.user.UserDTO;
import com.livinfo.backendlivinfo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserServiceInterface {

    @Autowired
    private UserRepository repository;
    public User createUser(UserDTO user) {
        User newUser = new User(user);
        this.saveUser(newUser);
        return newUser;
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(this.findAllUsers());
    }

    private void saveUser(User user) {
        this.repository.save(user);
    }

    private List<User> findAllUsers(){
        return this.repository.findAll();
    }
}