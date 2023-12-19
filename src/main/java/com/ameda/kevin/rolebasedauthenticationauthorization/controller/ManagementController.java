package com.ameda.kevin.rolebasedauthenticationauthorization.controller;
import com.ameda.kevin.rolebasedauthenticationauthorization.entity.Dummy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
@RestController
@RequestMapping("/api/management")
public class ManagementController {
    @GetMapping("/welcome")
    public ResponseEntity<?> greetings(Principal principal){
        return new ResponseEntity<>("Welcome Admin, "+principal.getName(),
                HttpStatus.OK);
    }
    @PostMapping("/message")
    public ResponseEntity<?> passMessage(@RequestBody Dummy dummy){
        return new ResponseEntity<>(dummy.getName()+" and my message is "+dummy.getMessage(),
                HttpStatus.OK);
    }
}
