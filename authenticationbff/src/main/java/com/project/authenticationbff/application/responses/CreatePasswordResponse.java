package com.project.authenticationbff.application.responses;

public class CreatePasswordResponse {
    private boolean succeeded;

    private String message;

    public CreatePasswordResponse(boolean succeeded, String message) {
        this.succeeded = succeeded;
        this.message = message;
    }

    public boolean isSucceeded() {
        return succeeded;
    }

    public String getMessage() {
        return message;
    }
}
