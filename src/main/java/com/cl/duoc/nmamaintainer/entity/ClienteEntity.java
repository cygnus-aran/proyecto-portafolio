package com.cl.duoc.nmamaintainer.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente", schema = "nma")
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "id_empresa", nullable = false)
    private String idEmpresa;

    @Column(name = "rut_empresa", nullable = false)
    private String rutEmpresa;

    @Column(name = "nombre_empresa")
    private String nombreEmpresa;

    @Column(name = "fono_empresa")
    private String fonoEmpresa;

    @Column(name = "email_empresa", nullable = false)
    private String emailEmpresa;

    @Column(name = "responsable_empresa")
    private String responsableEmpresa;

    @Column(name = "estado_empresa", nullable = false)
    private String estadoEmpresa;

    @Column(name = "usuario_id_usuario", nullable = false)
    private String usuarioIdUsuario;

    @Column(name = "rol_id_rol", nullable = false)
    private String rolIdRol;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getRutEmpresa() {
        return rutEmpresa;
    }

    public void setRutEmpresa(String rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getFonoEmpresa() {
        return fonoEmpresa;
    }

    public void setFonoEmpresa(String fonoEmpresa) {
        this.fonoEmpresa = fonoEmpresa;
    }

    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }

    public String getResponsableEmpresa() {
        return responsableEmpresa;
    }

    public void setResponsableEmpresa(String responsableEmpresa) {
        this.responsableEmpresa = responsableEmpresa;
    }

    public String getEstadoEmpresa() {
        return estadoEmpresa;
    }

    public void setEstadoEmpresa(String estadoEmpresa) {
        this.estadoEmpresa = estadoEmpresa;
    }

    public String getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(String usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

    public String getRolIdRol() {
        return rolIdRol;
    }

    public void setRolIdRol(String rolIdRol) {
        this.rolIdRol = rolIdRol;
    }
}
