package com.cl.duoc.nmamaintainer.dto.asesoria;

import com.cl.duoc.nmamaintainer.entity.AsesoriaEntity;

import java.util.List;

public class AsesoriaRegisterRequest {
    private List<AsesoriaEntity> asesorias;

    // Getter and setter
    public List<AsesoriaEntity> getAsesorias() {
        return asesorias;
    }

    public void setAsesorias(List<AsesoriaEntity> asesorias) {
        this.asesorias = asesorias;
    }
}
