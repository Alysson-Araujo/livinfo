package com.livinfo.backendlivinfo.services;

import com.livinfo.backendlivinfo.domain.user.User;
import com.livinfo.backendlivinfo.domain.user.UserDTO;

import java.util.List;

public interface UserServiceInterface {
    User createUser(UserDTO user);
    List<User> getAllUsers();
}