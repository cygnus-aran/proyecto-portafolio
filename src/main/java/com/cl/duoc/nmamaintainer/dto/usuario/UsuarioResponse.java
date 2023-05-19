package com.cl.duoc.nmamaintainer.dto.usuario;

import com.cl.duoc.nmamaintainer.entity.UsuarioEntity;

import java.util.List;

public class UsuarioResponse {

    private String operation;
    private String status;
    private List<UsuarioEntity> usuarios;

    public UsuarioResponse() {
    }

    public UsuarioResponse(String operation, String status, List<UsuarioEntity> usuarios) {
        this.operation = operation;
        this.status = status;
        this.usuarios = usuarios;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<UsuarioEntity> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<UsuarioEntity> usuarios) {
        this.usuarios = usuarios;
    }
}
