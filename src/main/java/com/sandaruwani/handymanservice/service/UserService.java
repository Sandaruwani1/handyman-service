package com.sandaruwani.handymanservice.service;

import com.sandaruwani.handymanservice.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> getUsers();
}
