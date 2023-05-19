package com.cl.duoc.nmamaintainer.controller;

import com.cl.duoc.nmamaintainer.dto.Response;
import com.cl.duoc.nmamaintainer.dto.rol.RolRequest;
import com.cl.duoc.nmamaintainer.dto.rol.RolResponse;
import com.cl.duoc.nmamaintainer.service.rol.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/rol")
public class RolController {
    @Autowired
    private RolService rolService;

    @GetMapping("/find-all")
    public ResponseEntity<Response<RolResponse>> getFindAllRols() {
        RolResponse rolResponse = rolService.findAll();
        Response<RolResponse> response = new Response<>(HttpStatus.OK.value(), "Registros Encontrados", rolResponse);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/register-rol")
    public ResponseEntity<Response<RolResponse>> postRegisterRol(@RequestBody RolRequest rolRequest) {
        RolResponse rolResponse = rolService.register(rolRequest);
        Response<RolResponse> response = new Response<>(HttpStatus.CREATED.value(), "Registro Creado", rolResponse);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/find-rol")
    public ResponseEntity<Response<RolResponse>> postFindRol(@RequestBody RolRequest rolRequest) {
        RolResponse rolResponse = rolService.find(rolRequest);
        Response<RolResponse> response = new Response<>(HttpStatus.FOUND.value(), "Registro Encontrado", rolResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    @PostMapping("/update-rol")
    public ResponseEntity<Response<RolResponse>> postUpdateRol(@RequestBody RolRequest rolRequest) {
        RolResponse rolResponse = rolService.update(rolRequest);
        Response<RolResponse> response = new Response<>(HttpStatus.FOUND.value(), "Registro Encontrado", rolResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    @PostMapping("/delete-rol")
    public ResponseEntity<Response<RolResponse>> postDeleteRol(@RequestBody RolRequest rolRequest) {
        RolResponse rolResponse = rolService.delete(rolRequest);
        Response<RolResponse> response = new Response<>(HttpStatus.FOUND.value(), "Registro Eliminado", rolResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }
}