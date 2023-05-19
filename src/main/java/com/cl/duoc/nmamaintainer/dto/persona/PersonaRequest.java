package com.cl.duoc.nmamaintainer.dto.persona;

import com.cl.duoc.nmamaintainer.entity.PersonaEntity;

import java.util.List;

public class PersonaRequest {

    private List<PersonaEntity> personas;

    public PersonaRequest() {
    }

    public PersonaRequest(List<PersonaEntity> personas) {
        this.personas = personas;
    }

    public List<PersonaEntity> getPersonas() {
        return personas;
    }

    public void setPersonas(List<PersonaEntity> personas) {
        this.personas = personas;
    }
}
