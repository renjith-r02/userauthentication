package com.dzone.demo.userauthentication.userregistration.controller;

import com.dzone.demo.userauthentication.userregistration.domain.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
 class UserAuthenticationController {

    @Autowired
    private UserRegistrationService userRegistrationService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        userRegistrationService.registerUser(user);
        return new ResponseEntity<>("User registered successfully", HttpStatus.CREATED);
    }

    @PostMapping("/verify/{userName}")
    public ResponseEntity<Boolean> registerUser(@PathVariable String userName) {
       boolean verify= userRegistrationService.verify(userName);
        return new ResponseEntity<>(verify, HttpStatus.OK);
    }
}