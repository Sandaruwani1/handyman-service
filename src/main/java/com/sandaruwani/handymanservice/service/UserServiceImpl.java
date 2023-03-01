package com.sandaruwani.handymanservice.service;

import com.sandaruwani.handymanservice.model.User;
import com.sandaruwani.handymanservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        List<User> users=userRepository.findAll();
        return users;
    }
}
