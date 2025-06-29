package com.example.auth.record;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record SignupRequest(
		
		@NotBlank(message="Email cannot be null or empty.")
		@Pattern(
		regexp = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.(com|in|uk|co)$",
		flags = Pattern.Flag.CASE_INSENSITIVE,
	    message = "Email must end with .com, .in, .uk, or .co"
		)
		String email,
		
		@NotBlank(message="Password cannot be null or empty.")
		@Size(min=8,max=16,message="Password length should be between 8 to 16")
		String password,
		
		@NotBlank(message="Role cannot be null or empty.")
		String role
		
		) {

}
