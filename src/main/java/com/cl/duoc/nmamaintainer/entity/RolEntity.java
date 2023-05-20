package com.cl.duoc.nmamaintainer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rol")
public class RolEntity {

    @Id
    @Column(name = "id")
    private int idRol;

    @Column(name = "descripcion_rol", nullable = false)
    private String descripcionRol;

    @Column(name = "usuario_id_usuario", nullable = false)
    private String usuarioIdUsuario;

    @Column(name = "cliente_id_empresa", nullable = false)
    private String clienteIdEmpresa;

    @Column(name = "persona_run_persona", nullable = false)
    private String personaRunPersona;

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getDescripcionRol() {
        return descripcionRol;
    }

    public void setDescripcionRol(String descripcionRol) {
        this.descripcionRol = descripcionRol;
    }

    public String getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(String usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

    public String getClienteIdEmpresa() {
        return clienteIdEmpresa;
    }

    public void setClienteIdEmpresa(String clienteIdEmpresa) {
        this.clienteIdEmpresa = clienteIdEmpresa;
    }

    public String getPersonaRunPersona() {
        return personaRunPersona;
    }

    public void setPersonaRunPersona(String personaRunPersona) {
        this.personaRunPersona = personaRunPersona;
    }
}
