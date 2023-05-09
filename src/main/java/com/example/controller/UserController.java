package com.example.controller;

import com.example.dto.UserDTO;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/")
    public ResponseEntity<Void> createUser(@RequestBody UserDTO userDTO) {
        userRepository.insertUserData(userDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
