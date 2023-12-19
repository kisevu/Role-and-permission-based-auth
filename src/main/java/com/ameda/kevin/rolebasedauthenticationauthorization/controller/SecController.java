package com.ameda.kevin.rolebasedauthenticationauthorization.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class SecController {
    @GetMapping
    public ResponseEntity<?> authenticate(){
        return new ResponseEntity<>("Please authenticate yourself to my application...",HttpStatus.OK);
    }
}
