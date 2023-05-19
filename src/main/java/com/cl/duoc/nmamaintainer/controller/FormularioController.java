package com.cl.duoc.nmamaintainer.controller;

import com.cl.duoc.nmamaintainer.dto.Response;
import com.cl.duoc.nmamaintainer.dto.formulario.FormularioRequest;
import com.cl.duoc.nmamaintainer.dto.formulario.FormularioResponse;
import com.cl.duoc.nmamaintainer.service.formulario.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/formulario")
public class FormularioController {
    @Autowired
    private FormularioService formularioService;

    @GetMapping("/find-all")
    public ResponseEntity<Response<FormularioResponse>> getFindAllFormularios() {
        FormularioResponse formularioResponse = formularioService.findAll();
        Response<FormularioResponse> response = new Response<>(HttpStatus.OK.value(), "Registros Encontrados", formularioResponse);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/register-formulario")
    public ResponseEntity<Response<FormularioResponse>> postRegisterFormulario(@RequestBody FormularioRequest formularioRequest) {
        FormularioResponse formularioResponse = formularioService.register(formularioRequest);
        Response<FormularioResponse> response = new Response<>(HttpStatus.CREATED.value(), "Registro Creado", formularioResponse);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/find-formulario")
    public ResponseEntity<Response<FormularioResponse>> postFindFormulario(@RequestBody FormularioRequest formularioRequest) {
        FormularioResponse formularioResponse = formularioService.find(formularioRequest);
        Response<FormularioResponse> response = new Response<>(HttpStatus.FOUND.value(), "Registro Encontrado", formularioResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    @PostMapping("/update-formulario")
    public ResponseEntity<Response<FormularioResponse>> postUpdateFormulario(@RequestBody FormularioRequest formularioRequest) {
        FormularioResponse formularioResponse = formularioService.update(formularioRequest);
        Response<FormularioResponse> response = new Response<>(HttpStatus.FOUND.value(), "Registro Encontrado", formularioResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    @PostMapping("/delete-formulario")
    public ResponseEntity<Response<FormularioResponse>> postDeleteFormulario(@RequestBody FormularioRequest formularioRequest) {
        FormularioResponse formularioResponse = formularioService.delete(formularioRequest);
        Response<FormularioResponse> response = new Response<>(HttpStatus.FOUND.value(), "Registro Eliminado", formularioResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }
}
