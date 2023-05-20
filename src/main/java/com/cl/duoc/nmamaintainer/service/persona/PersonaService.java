package com.cl.duoc.nmamaintainer.service.persona;

import com.cl.duoc.nmamaintainer.dto.persona.PersonaRequest;
import com.cl.duoc.nmamaintainer.dto.persona.PersonaResponse;
import com.cl.duoc.nmamaintainer.dto.persona.PersonaSaveRequest;

public interface PersonaService {
    PersonaResponse register(PersonaSaveRequest personaRequest);
    PersonaResponse find(PersonaRequest personaRequest);
    PersonaResponse findAll();
    PersonaResponse update(PersonaRequest personaRequest);
    PersonaResponse delete(PersonaRequest personaRequest);
}
