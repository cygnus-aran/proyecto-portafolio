package com.cl.duoc.nmamaintainer.entity;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "login", schema = "nma")
public class LoginEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "fecha_login", nullable = false)
    private LocalDate fechaLogin;

    @Column(name = "fecha_logout", nullable = false)
    private LocalDate fechaLogout;

    @Column(name = "estado", nullable = false)
    private String estado;

    @Column(name = "usuario_id_usuario", nullable = false)
    private String usuarioIdUsuario;

    @Column(name =  "id_login")
    private  Integer idLogin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFechaLogin() {
        return fechaLogin;
    }

    public void setFechaLogin(LocalDate fechaLogin) {
        this.fechaLogin = fechaLogin;
    }

    public LocalDate getFechaLogout() {
        return fechaLogout;
    }

    public void setFechaLogout(LocalDate fechaLogout) {
        this.fechaLogout = fechaLogout;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(String usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

    public Integer getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(Integer idLogin) {
        this.idLogin = idLogin;
    }
}

