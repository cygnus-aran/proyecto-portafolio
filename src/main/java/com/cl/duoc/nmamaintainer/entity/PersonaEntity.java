package com.cl.duoc.nmamaintainer.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "persona", schema = "nma")
public class PersonaEntity {

    @Id
    @Column(name = "id_persona")
    private Integer idPersona;

    @Column(name = "run_persona")
    private String runPersona;

    @Column(name = "nombre_persona")
    private String nombrePersona;

    @Column(name = "fecha_alta")
    private LocalDate fechaAlta;

    @Column(name = "fecha_baja")
    private LocalDate fechaBaja;

    @Column(name = "estado_persona")
    private String estadoPersona;

    @Column(name = "puesto_persona")
    private String puestoPersona;

    @Column(name = "usuario_id_usuario")
    private String usuarioIdUsuario;

    @Column(name = "rol_id_rol")
    private String rolIdRol;

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getRunPersona() {
        return runPersona;
    }

    public void setRunPersona(String runPersona) {
        this.runPersona = runPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getEstadoPersona() {
        return estadoPersona;
    }

    public void setEstadoPersona(String estadoPersona) {
        this.estadoPersona = estadoPersona;
    }

    public String getPuestoPersona() {
        return puestoPersona;
    }

    public void setPuestoPersona(String puestoPersona) {
        this.puestoPersona = puestoPersona;
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
