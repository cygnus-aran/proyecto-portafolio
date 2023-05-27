package com.cl.duoc.nmamaintainer.controller;

import com.cl.duoc.nmamaintainer.dto.Response;
import com.cl.duoc.nmamaintainer.dto.asesoria.AsesoriaRegisterRequest;
import com.cl.duoc.nmamaintainer.dto.asesoria.AsesoriaRegisterResponse;
import com.cl.duoc.nmamaintainer.service.asesoria.AsesoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="v1/asesoria")
public class AsesoriaController {
    @Autowired
    private AsesoriaService asesoriaService;

    @GetMapping("/find-all")
    public ResponseEntity<Response<AsesoriaRegisterResponse>> getFindAllAsesorias() {
        AsesoriaRegisterResponse asesoriaRegisterResponse = asesoriaService.findAll();
        Response<AsesoriaRegisterResponse> response = new Response<>(HttpStatus.CREATED.value(),
                "Registros Encontrados", asesoriaRegisterResponse);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/register-asesoria")
    public ResponseEntity<Response<AsesoriaRegisterResponse>> postRegisterAsesoria
            (@RequestBody AsesoriaRegisterRequest asesoriaRegisterRequest) {
        AsesoriaRegisterResponse asesoriaRegisterResponse = asesoriaService.register(asesoriaRegisterRequest);
        Response<AsesoriaRegisterResponse> response = new Response<>(HttpStatus.CREATED.value(),
                "Registro Creado", asesoriaRegisterResponse);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/find-asesoria")
    public ResponseEntity<Response<AsesoriaRegisterResponse>> postFindAsesoria
            (@RequestBody AsesoriaRegisterRequest asesoriaRegisterRequest) {
        AsesoriaRegisterResponse asesoriaRegisterResponse = asesoriaService.find(asesoriaRegisterRequest);
        Response<AsesoriaRegisterResponse> response = new Response<>(HttpStatus.FOUND.value(),
                "Registro Encontrado", asesoriaRegisterResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    @PostMapping("/update-asesoria")
    public ResponseEntity<Response<AsesoriaRegisterResponse>> postUpdateAsesoria
            (@RequestBody AsesoriaRegisterRequest asesoriaRegisterRequest) {
        AsesoriaRegisterResponse asesoriaRegisterResponse = asesoriaService.update(asesoriaRegisterRequest);
        Response<AsesoriaRegisterResponse> response = new Response<>(HttpStatus.FOUND.value(),
                "Registro Actualizado", asesoriaRegisterResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    @PostMapping("/delete-asesoria")
    public ResponseEntity<Response<AsesoriaRegisterResponse>> postDeleteAsesoria
            (@RequestBody AsesoriaRegisterRequest asesoriaRegisterRequest) {
        AsesoriaRegisterResponse asesoriaRegisterResponse = asesoriaService.delete(asesoriaRegisterRequest);
        Response<AsesoriaRegisterResponse> response = new Response<>(HttpStatus.OK.value(),
                "Registro Eliminado", asesoriaRegisterResponse);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

