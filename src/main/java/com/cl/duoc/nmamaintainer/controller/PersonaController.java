package com.cl.duoc.nmamaintainer.controller;

import com.cl.duoc.nmamaintainer.dto.Response;
import com.cl.duoc.nmamaintainer.dto.persona.PersonaRequest;
import com.cl.duoc.nmamaintainer.dto.persona.PersonaResponse;
import com.cl.duoc.nmamaintainer.service.persona.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/persona")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping("/find-all")
    public ResponseEntity<Response<PersonaResponse>> getFindAllPersonas() {
        PersonaResponse personaResponse = personaService.findAll();
        Response<PersonaResponse> response = new Response<>(HttpStatus.OK.value(), "Registros Encontrados", personaResponse);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/register-persona")
    public ResponseEntity<Response<PersonaResponse>> postRegisterPersona(@RequestBody PersonaRequest personaRequest) {
        PersonaResponse personaResponse = personaService.register(personaRequest);
        Response<PersonaResponse> response = new Response<>(HttpStatus.CREATED.value(), "Registro Creado", personaResponse);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/find-persona")
    public ResponseEntity<Response<PersonaResponse>> postFindPersona(@RequestBody PersonaRequest personaRequest) {
        PersonaResponse personaResponse = personaService.find(personaRequest);
        Response<PersonaResponse> response = new Response<>(HttpStatus.FOUND.value(), "Registro Encontrado", personaResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    @PostMapping("/update-persona")
    public ResponseEntity<Response<PersonaResponse>> postUpdatePersona(@RequestBody PersonaRequest personaRequest) {
        PersonaResponse personaResponse = personaService.update(personaRequest);
        Response<PersonaResponse> response = new Response<>(HttpStatus.FOUND.value(), "Registro Encontrado", personaResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    @PostMapping("/delete-persona")
    public ResponseEntity<Response<PersonaResponse>> postDeletePersona(@RequestBody PersonaRequest personaRequest) {
        PersonaResponse personaResponse = personaService.delete(personaRequest);
        Response<PersonaResponse> response = new Response<>(HttpStatus.FOUND.value(), "Registro Eliminado", personaResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }
}
