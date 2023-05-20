package com.cl.duoc.nmamaintainer.dto.persona;

import com.cl.duoc.nmamaintainer.entity.PersonaEntity;

import java.util.List;

public class PersonaSaveRequest {

    private List<PersonaIn> personas;

    public PersonaSaveRequest() {
    }

    public PersonaSaveRequest(List<PersonaIn> personas) {
        this.personas = personas;
    }

    public List<PersonaIn> getPersonas() {
        return personas;
    }

    public void setPersonas(List<PersonaIn> personas) {
        this.personas = personas;
    }
}
