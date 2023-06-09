package com.cl.duoc.nmamaintainer.dto.persona;

import com.cl.duoc.nmamaintainer.entity.PersonaEntity;

import java.util.List;

public class PersonaResponse {

    private String operation;
    private String status;
    private List<PersonaEntity> personas;

    public PersonaResponse() {
    }

    public PersonaResponse(String operation, String status, List<PersonaEntity> personas) {
        this.operation = operation;
        this.status = status;
        this.personas = personas;
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

    public List<PersonaEntity> getPersonas() {
        return personas;
    }

    public void setPersonas(List<PersonaEntity> personas) {
        this.personas = personas;
    }
}
