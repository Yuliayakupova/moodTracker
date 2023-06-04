package com.example.controller;

import com.example.dto.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/user")
    public ResponseEntity<Void> createUser(@RequestBody User user) {
        userRepository.saveUserData(user);
       return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }
}
