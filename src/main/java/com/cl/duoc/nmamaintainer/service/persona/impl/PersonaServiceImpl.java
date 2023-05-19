package com.cl.duoc.nmamaintainer.service.persona.impl;

import com.cl.duoc.nmamaintainer.dto.persona.PersonaRequest;
import com.cl.duoc.nmamaintainer.dto.persona.PersonaResponse;
import com.cl.duoc.nmamaintainer.entity.PersonaEntity;
import com.cl.duoc.nmamaintainer.repository.PersonaRepository;
import com.cl.duoc.nmamaintainer.service.persona.PersonaService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public PersonaResponse register(PersonaRequest personaRequest) {
        PersonaResponse response = new PersonaResponse();
        PersonaEntity save = personaRepository.save(personaRequest.getPersonas().get(0));
        response.setOperation("Guardado");
        if (save == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        List<PersonaEntity> personas = new ArrayList<>();
        response.setPersonas(personas);
        response.getPersonas().add(save);
        return response;
    }

    @Override
    public PersonaResponse find(PersonaRequest personaRequest) {
        PersonaResponse response = new PersonaResponse();
        Optional<PersonaEntity> find = personaRepository.findById(personaRequest.getPersonas().get(0).getIdPersona().toString());
        response.setOperation("Encontrar");
        response.setStatus("Exito");
        response.getPersonas().add(find.get());
        return response;
    }

    @Override
    public PersonaResponse findAll() {
        PersonaResponse response = new PersonaResponse();
        List<PersonaEntity> findAll = personaRepository.findAll();
        response.setOperation("Encontrar Todos");
        if (findAll == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.setPersonas(findAll);
        return response;
    }

    @Override
    public PersonaResponse update(PersonaRequest personaRequest) {
        PersonaResponse response = new PersonaResponse();
        PersonaEntity update = personaRepository.saveAndFlush(personaRequest.getPersonas().get(0));
        response.setOperation("Actualizar");
        if (update == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.getPersonas().add(update);
        return response;
    }

    @Override
    public PersonaResponse delete(PersonaRequest personaRequest) {
        PersonaResponse response = new PersonaResponse();
        response.setOperation("Borrar");
        try {
            personaRepository.deleteById(personaRequest.getPersonas().get(0).getIdPersona().toString());
        } catch (Exception e) {
            response.setStatus("Error");
            throw new RuntimeException(e);
        }
        response.setStatus("Exito");
        return response;
    }
}
