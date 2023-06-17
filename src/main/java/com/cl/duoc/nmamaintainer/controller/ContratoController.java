package com.cl.duoc.nmamaintainer.controller;

import com.cl.duoc.nmamaintainer.dto.Response;
import com.cl.duoc.nmamaintainer.dto.contrato.ContratoRequest;
import com.cl.duoc.nmamaintainer.dto.contrato.ContratoResponse;
import com.cl.duoc.nmamaintainer.service.contrato.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/contrato")
public class ContratoController {
    @Autowired
    private ContratoService contratoService;

    @GetMapping("/find-all")
    public ResponseEntity<Response<ContratoResponse>> findAllContratos() {
        ContratoResponse contratoResponse = new ContratoResponse();
        contratoResponse = contratoService.findAll();
        Response<ContratoResponse> response = new Response<>(HttpStatus.OK.value(), "Registros Encontrados", contratoResponse);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/register-contrato")
    public ResponseEntity<Response<ContratoResponse>> registerContrato(@RequestBody ContratoRequest contratoRequest) {
        ContratoResponse contratoResponse = contratoService.register(contratoRequest);
        Response<ContratoResponse> response = new Response<>(HttpStatus.CREATED.value(), "Registro Creado", contratoResponse);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/find")
    public ResponseEntity<Response<ContratoResponse>> findContrato(@RequestBody ContratoRequest contratoRequest) {
        ContratoResponse contratoResponse = contratoService.find(contratoRequest);
        Response<ContratoResponse> response = new Response<>(HttpStatus.OK.value(), "Registro Encontrado", contratoResponse);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<Response<ContratoResponse>> updateContrato(@RequestBody ContratoRequest contratoRequest) {
        ContratoResponse contratoResponse = contratoService.update(contratoRequest);
        Response<ContratoResponse> response = new Response<>(HttpStatus.OK.value(), "Registro Actualizado", contratoResponse);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/delete")
    public ResponseEntity<Response<ContratoResponse>> deleteContrato(@RequestBody ContratoRequest contratoRequest) {
        contratoService.delete(contratoRequest);
        Response<ContratoResponse> response = new Response<>(HttpStatus.OK.value(), "Registro Eliminado", null);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

