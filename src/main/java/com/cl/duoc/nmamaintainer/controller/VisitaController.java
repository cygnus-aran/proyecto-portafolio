package com.cl.duoc.nmamaintainer.controller;

import com.cl.duoc.nmamaintainer.dto.Response;
import com.cl.duoc.nmamaintainer.dto.client.ClientRegisterRequest;
import com.cl.duoc.nmamaintainer.dto.client.ClientRegisterResponse;
import com.cl.duoc.nmamaintainer.dto.visita.VisitaRequest;
import com.cl.duoc.nmamaintainer.dto.visita.VisitaResponse;
import com.cl.duoc.nmamaintainer.service.visita.VisitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="vi/client")
public class VisitaController {

    @Autowired
    private VisitaService visitaService;

    @GetMapping("/find-all")
    public ResponseEntity<Response<VisitaResponse>> getFindAllVisits() {
        VisitaResponse visitaResponse = new VisitaResponse();
        visitaResponse = visitaService.findAll();
        Response<VisitaResponse> response = new Response<>(HttpStatus.CREATED.value(),
                "Registros Encontrados", visitaResponse);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/register-visita")
    public ResponseEntity<Response<VisitaResponse>> postRegisterVisit
            (@RequestBody VisitaRequest visitaRequest) {
        VisitaResponse visitaResponse = new VisitaResponse();
        visitaResponse = visitaService.register(visitaRequest);
        Response<VisitaResponse> response = new Response<>(HttpStatus.CREATED.value(),
                "Registro Creado", visitaResponse);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/find-visita")
    public ResponseEntity<Response<VisitaResponse>> postFindVisita
            (@RequestBody VisitaRequest visitaRequest) {
        VisitaResponse visitaResponse = new VisitaResponse();
        visitaResponse = visitaService.find(visitaRequest);
        Response<VisitaResponse> response = new Response<>(HttpStatus.FOUND.value(),
                "Registro Encontrado", visitaResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    @PostMapping("/update-client")
    public ResponseEntity<Response<VisitaResponse>> postUpdateVisita
            (@RequestBody VisitaRequest visitaRequest) {
        VisitaResponse visitaResponse = new VisitaResponse();
        visitaResponse = visitaService.update(visitaRequest);
        Response<VisitaResponse> response = new Response<>(HttpStatus.FOUND.value(),
                "Registro Encontrado", visitaResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    @PostMapping("/delete-client")
    public ResponseEntity<Response<VisitaResponse>> postDeleteVisita
            (@RequestBody VisitaRequest visitaRequest) {
        VisitaResponse visitaResponse = new VisitaResponse();
        visitaResponse = visitaService.delete(visitaRequest);
        Response<VisitaResponse> response = new Response<>(HttpStatus.FOUND.value(),
                "Registro Eliminado", visitaResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }


}
