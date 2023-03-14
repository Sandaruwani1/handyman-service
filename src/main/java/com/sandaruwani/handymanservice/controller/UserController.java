package com.sandaruwani.handymanservice.controller;


import com.sandaruwani.handymanservice.dto.UserRequest;
import com.sandaruwani.handymanservice.model.User;
import com.sandaruwani.handymanservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UserController {

    // CREATE - POST - /api/users
    // READ - GET
    //              DATA LIST - GET /api/users
    //              SINGLE DATA - GET /api/users/1
    // UPDATE - PUT - /api/users/1
    // DELETE - DELETE - /api/users/1

    @Autowired
    public UserService userService;

    @GetMapping()
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") int userId){
        return null;
    }

    @PostMapping()
    public void createUser(@RequestBody UserRequest userRequest){

    }

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable("userId") int userId, @RequestBody User user){
        return null;
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") int userId){

    }

}
