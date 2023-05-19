package com.cl.duoc.nmamaintainer.dto.usuario;

import com.cl.duoc.nmamaintainer.entity.UsuarioEntity;

import java.util.List;

public class UsuarioRequest {

    private List<UsuarioEntity> usuarios;

    public UsuarioRequest() {
    }

    public UsuarioRequest(List<UsuarioEntity> usuarios) {
        this.usuarios = usuarios;
    }

    public List<UsuarioEntity> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<UsuarioEntity> usuarios) {
        this.usuarios = usuarios;
    }
}
