package com.example.auth.record;

public record UserDetailsResponse(
		GenericResponse response,
		Long id,
		String email,
		String role,
		String token
		) {

}
