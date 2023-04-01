package com.cl.duoc.nmamaintainer.dto.login;

public class LoginResponse {
    private String message;
    private String rol;

    public LoginResponse() {
    }

    public LoginResponse(String message, String rol) {
        this.message = message;
        this.rol = rol;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
