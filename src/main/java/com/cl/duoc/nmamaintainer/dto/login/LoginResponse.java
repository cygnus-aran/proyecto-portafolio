package com.cl.duoc.nmamaintainer.dto.login;

public class LoginResponse {
    private String message;
    private String rol;

    private String idUsuario;

    private String idEmpresa;


    public LoginResponse() {
    }

    public LoginResponse(String message, String rol, String idUsuario, String idEmpresa) {
        this.message = message;
        this.rol = rol;
        this.idUsuario = idUsuario;
        this.idEmpresa = idEmpresa;
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

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
}
