package com.example.booknation.controllers;

import com.example.booknation.payload.response.UserResponse;
import com.example.booknation.security.services.UserDetailsImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/user")
public class UserController {
    @GetMapping("/detail")
    public ResponseEntity<?> getUser(Authentication authentication) {
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        return ResponseEntity.ok(new UserResponse(userDetails.getUsername(),userDetails.getEmail()));
    }
}
