package com.cl.duoc.nmamaintainer.entity;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "asesoria", schema = "nma")
public class AsesoriaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asesoria")
    private Integer idAsesoria;

    @Column(name = "fecha_asesoria", nullable = false)
    private LocalDate fechaAsesoria;

    @Column(name = "cliente_asesoria", nullable = false)
    private String clienteAsesoria;

    @Column(name = "id_profesional", nullable = false)
    private String idProfesional;

    @Column(name = "nombre_profesional", nullable = false)
    private String nombreProfesional;


    // Getters and setters

    public Integer getIdAsesoria() {
        return idAsesoria;
    }

    public void setIdAsesoria(Integer idAsesoria) {
        this.idAsesoria = idAsesoria;
    }

    public LocalDate getFechaAsesoria() {
        return fechaAsesoria;
    }

    public void setFechaAsesoria(LocalDate fechaAsesoria) {
        this.fechaAsesoria = fechaAsesoria;
    }

    public String getClienteAsesoria() {
        return clienteAsesoria;
    }

    public void setClienteAsesoria(String clienteAsesoria) {
        this.clienteAsesoria = clienteAsesoria;
    }

    public String getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(String idProfesional) {
        this.idProfesional = idProfesional;
    }

    public String getNombreProfesional() {
        return nombreProfesional;
    }

    public void setNombreProfesional(String nombreProfesional) {
        this.nombreProfesional = nombreProfesional;
    }

}

