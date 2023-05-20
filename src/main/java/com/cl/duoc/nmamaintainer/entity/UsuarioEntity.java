package com.cl.duoc.nmamaintainer.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "usuario", schema = "nma")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idUsuario;

    @Column(name = "nombre_usuario", nullable = false)
    private String nombreUsuario;

    @Column(name = "contraseña_usuario", nullable = false)
    private String contraseñaUsuario;

    @Column(name = "fecha_alta")
    private java.sql.Date fechaAlta;

    @Column(name = "cliente_id_empresa", nullable = false)
    private String clienteIdEmpresa;

    @Column(name = "persona_run_persona", nullable = false)
    private String personaRunPersona;

    @Column(name = "rol_id_rol", nullable = false)
    private String rolIdRol;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseñaUsuario() {
        return contraseñaUsuario;
    }

    public void setContraseñaUsuario(String contraseñaUsuario) {
        this.contraseñaUsuario = contraseñaUsuario;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
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

    public String getRolIdRol() {
        return rolIdRol;
    }

    public void setRolIdRol(String rolIdRol) {
        this.rolIdRol = rolIdRol;
    }
}
