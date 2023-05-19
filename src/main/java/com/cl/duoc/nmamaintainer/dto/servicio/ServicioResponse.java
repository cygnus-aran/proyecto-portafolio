package com.cl.duoc.nmamaintainer.dto.servicio;

import com.cl.duoc.nmamaintainer.entity.ServicioEntity;

import java.util.List;

public class ServicioResponse {

    private String operation;
    private String status;
    private List<ServicioEntity> servicios;

    public ServicioResponse() {
    }

    public ServicioResponse(String operation, String status, List<ServicioEntity> servicios) {
        this.operation = operation;
        this.status = status;
        this.servicios = servicios;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ServicioEntity> getServicios() {
        return servicios;
    }

    public void setServicios(List<ServicioEntity> servicios) {
        this.servicios = servicios;
    }
}
