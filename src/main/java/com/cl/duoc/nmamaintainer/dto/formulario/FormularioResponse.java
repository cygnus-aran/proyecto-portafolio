package com.cl.duoc.nmamaintainer.dto.formulario;

import com.cl.duoc.nmamaintainer.entity.FormularioEntity;

import java.util.List;

public class FormularioResponse {

    private String operation;
    private String status;
    private List<FormularioEntity> formularios;

    public FormularioResponse() {
    }

    public FormularioResponse(String operation, String status, List<FormularioEntity> formularios) {
        this.operation = operation;
        this.status = status;
        this.formularios = formularios;
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

    public List<FormularioEntity> getFormularios() {
        return formularios;
    }

    public void setFormularios(List<FormularioEntity> formularios) {
        this.formularios = formularios;
    }
}
