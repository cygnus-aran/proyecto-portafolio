package com.cl.duoc.nmamaintainer.entity;

import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "episodio", schema = "nma")
public class EpisodioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_episodio")
    private Integer idEpisodio;

    @Column(name = "fecha_episodio", nullable = false)
    private LocalDate fechaEpisodio;

    @Column(name = "estado", nullable = false)
    private String estado;

    @Column(name = "formulario_folio", nullable = false)
    private String formularioFolio;

    public Integer getIdEpisodio() {
        return idEpisodio;
    }

    public void setIdEpisodio(Integer idEpisodio) {
        this.idEpisodio = idEpisodio;
    }

    public LocalDate getFechaEpisodio() {
        return fechaEpisodio;
    }

    public void setFechaEpisodio(LocalDate fechaEpisodio) {
        this.fechaEpisodio = fechaEpisodio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFormularioFolio() {
        return formularioFolio;
    }

    public void setFormularioFolio(String formularioFolio) {
        this.formularioFolio = formularioFolio;
    }
}