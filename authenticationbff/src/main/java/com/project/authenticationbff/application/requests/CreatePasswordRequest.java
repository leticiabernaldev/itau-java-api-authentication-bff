package com.project.authenticationbff.application.requests;

public class CreatePasswordRequest {

    private String password;

    public CreatePasswordRequest() {
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
