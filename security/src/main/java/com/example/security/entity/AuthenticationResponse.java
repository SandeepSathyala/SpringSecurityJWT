package com.example.security.entity;

public class AuthenticationResponse {

    private String token;

    public AuthenticationResponse(String token, String userAlreadyExist){
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
