package com.cl.duoc.nmamaintainer.dto.servicio;

import com.cl.duoc.nmamaintainer.entity.ServicioEntity;

import java.util.List;

public class ServicioRequest {

    private List<ServicioEntity> servicios;

    public ServicioRequest() {
    }

    public ServicioRequest(List<ServicioEntity> servicios) {
        this.servicios = servicios;
    }

    public List<ServicioEntity> getServicios() {
        return servicios;
    }

    public void setServicios(List<ServicioEntity> servicios) {
        this.servicios = servicios;
    }
}
