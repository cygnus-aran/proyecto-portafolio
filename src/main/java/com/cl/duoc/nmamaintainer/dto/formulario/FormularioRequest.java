package com.cl.duoc.nmamaintainer.dto.formulario;

import com.cl.duoc.nmamaintainer.entity.FormularioEntity;

import java.util.List;

public class FormularioRequest {

    private List<FormularioEntity> formularios;

    public FormularioRequest() {
    }

    public FormularioRequest(List<FormularioEntity> formularios) {
        this.formularios = formularios;
    }

    public List<FormularioEntity> getFormularios() {
        return formularios;
    }

    public void setFormularios(List<FormularioEntity> formularios) {
        this.formularios = formularios;
    }
}
