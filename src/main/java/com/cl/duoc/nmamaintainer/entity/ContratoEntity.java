package com.cl.duoc.nmamaintainer.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "contrato")
public class ContratoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contrato")
    private Integer idContrato;

    @Column(name = "fecha_contrato", nullable = false)
    private LocalDate fechaContrato;

    @Column(name = "estado_contrato", nullable = false)
    private String estadoContrato;

    @Column(name = "id_cliente_contrato", nullable = false)
    private String idClienteContrato;

    @Column(name = "cantidad_visita", nullable = false)
    private String cantidadVisita;

    @Column(name = "cantidad_servicio", nullable = false)
    private String cantidadServicio;

    @Column(name = "total_contrato")
    private String totalContrato;


    public ContratoEntity() {
    }

    public ContratoEntity(Integer idContrato, LocalDate fechaContrato, String estadoContrato, String idClienteContrato, String cantidadVisita, String cantidadServicio, String totalContrato) {
        this.idContrato = idContrato;
        this.fechaContrato = fechaContrato;
        this.estadoContrato = estadoContrato;
        this.idClienteContrato = idClienteContrato;
        this.cantidadVisita = cantidadVisita;
        this.cantidadServicio = cantidadServicio;
        this.totalContrato = totalContrato;
    }

    public String getCantidadVisita() {
        return cantidadVisita;
    }

    public void setCantidadVisita(String cantidadVisita) {
        this.cantidadVisita = cantidadVisita;
    }

    public String getCantidadServicio() {
        return cantidadServicio;
    }

    public void setCantidadServicio(String cantidadServicio) {
        this.cantidadServicio = cantidadServicio;
    }

    public Integer getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(Integer idContrato) {
        this.idContrato = idContrato;
    }

    public LocalDate getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(LocalDate fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public String getEstadoContrato() {
        return estadoContrato;
    }

    public void setEstadoContrato(String estadoContrato) {
        this.estadoContrato = estadoContrato;
    }

    public String getIdClienteContrato() {
        return idClienteContrato;
    }

    public void setIdClienteContrato(String idClienteContrato) {
        this.idClienteContrato = idClienteContrato;
    }

    public String getTotalContrato() {
        return totalContrato;
    }

    public void setTotalContrato(String totalContrato) {
        this.totalContrato = totalContrato;
    }
}
