package com.example.auth.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.auth.record.GenericResponse;
import com.example.auth.record.LoginRequest;
import com.example.auth.record.SignupRequest;
import com.example.auth.record.UserDetailsResponse;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/auth")
@Slf4j
public class AuthController {
	
	
	@PostMapping("/signup")
	public ResponseEntity<GenericResponse> registerUser(@Valid @RequestBody SignupRequest request)
	{
		
	}
	
	@PostMapping("/login")
	public ResponseEntity<UserDetailsResponse> authenticateUser(@Valid @RequestBody LoginRequest request)
	{
		
	}
	
	
	

}
