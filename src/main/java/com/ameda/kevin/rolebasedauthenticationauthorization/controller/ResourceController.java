package com.ameda.kevin.rolebasedauthenticationauthorization.controller;

import com.ameda.kevin.rolebasedauthenticationauthorization.entity.Dummy;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/resource")
public class ResourceController {
    @GetMapping("/name")
    public ResponseEntity<?> getEngineer(){
        return new ResponseEntity<>(
                "Welcome to my life as Software Engineer Ameda Kevin Kisevu..."
                ,HttpStatus.OK);
    }
    @GetMapping("/guru")
    public ResponseEntity<?> getGuru(){
        return new ResponseEntity<>(
                "People call me the guru of Java and I " +
                        "feel obliged to assume such a responsibility..."
                ,HttpStatus.OK);
    }
}
