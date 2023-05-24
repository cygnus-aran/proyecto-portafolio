package com.cl.duoc.nmamaintainer.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "servicio", schema = "nma")
public class ServicioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_servicio")
    private Integer idServicio;

    @Column(name = "nombre_servicio", nullable = false)
    private String nombreServicio;

    @Column(name = "valor_servicio", nullable = false)
    private Double valorServicio;

    @Column(name = "descripcion_servicio")
    private String descripcionServicio;

    @Column(name = "fecha_creacion_servicio", nullable = false)
    private java.sql.Date fechaCreacionServicio;

    @Column(name = "fecha_baja_servicio")
    private java.sql.Date fechaBajaServicio;

    @Column(name = "id_cliente", nullable = false)
    private String idCliente;

    @Column(name = "id_persona", nullable = false)
    private String idPersona;

    @Column(name = "estado_servicio", nullable = false)
    private String estadoServicio;

    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public Double getValorServicio() {
        return valorServicio;
    }

    public void setValorServicio(Double valorServicio) {
        this.valorServicio = valorServicio;
    }

    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public void setDescripcionServicio(String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }

    public Date getFechaCreacionServicio() {
        return fechaCreacionServicio;
    }

    public void setFechaCreacionServicio(Date fechaCreacionServicio) {
        this.fechaCreacionServicio = fechaCreacionServicio;
    }

    public Date getFechaBajaServicio() {
        return fechaBajaServicio;
    }

    public void setFechaBajaServicio(Date fechaBajaServicio) {
        this.fechaBajaServicio = fechaBajaServicio;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getEstadoServicio() {
        return estadoServicio;
    }

    public void setEstadoServicio(String estadoServicio) {
        this.estadoServicio = estadoServicio;
    }
}