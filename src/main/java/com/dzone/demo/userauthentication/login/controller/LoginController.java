package com.dzone.demo.userauthentication.login.controller;

import com.dzone.demo.userauthentication.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
 class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/login")
     ResponseEntity<String> registerUser(@RequestBody LoginDTO loginDTO) {
        boolean login=loginService.login(loginDTO);
        if(login)
        return new ResponseEntity<>("Login Successful", HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }
}
