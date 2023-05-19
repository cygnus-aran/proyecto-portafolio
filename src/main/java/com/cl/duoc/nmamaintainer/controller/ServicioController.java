package com.cl.duoc.nmamaintainer.controller;

import com.cl.duoc.nmamaintainer.dto.Response;
import com.cl.duoc.nmamaintainer.dto.servicio.ServicioRequest;
import com.cl.duoc.nmamaintainer.dto.servicio.ServicioResponse;
import com.cl.duoc.nmamaintainer.service.servicio.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/servicio")
public class ServicioController {
    @Autowired
    private ServicioService servicioService;

    @GetMapping("/find-all")
    public ResponseEntity<Response<ServicioResponse>> getFindAllServicios() {
        ServicioResponse servicioResponse = servicioService.findAll();
        Response<ServicioResponse> response = new Response<>(HttpStatus.OK.value(), "Registros Encontrados", servicioResponse);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/register-servicio")
    public ResponseEntity<Response<ServicioResponse>> postRegisterServicio(@RequestBody ServicioRequest servicioRequest) {
        ServicioResponse servicioResponse = servicioService.register(servicioRequest);
        Response<ServicioResponse> response = new Response<>(HttpStatus.CREATED.value(), "Registro Creado", servicioResponse);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/find-servicio")
    public ResponseEntity<Response<ServicioResponse>> postFindServicio(@RequestBody ServicioRequest servicioRequest) {
        ServicioResponse servicioResponse = servicioService.find(servicioRequest);
        Response<ServicioResponse> response = new Response<>(HttpStatus.FOUND.value(), "Registro Encontrado", servicioResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    @PostMapping("/update-servicio")
    public ResponseEntity<Response<ServicioResponse>> postUpdateServicio(@RequestBody ServicioRequest servicioRequest) {
        ServicioResponse servicioResponse = servicioService.update(servicioRequest);
        Response<ServicioResponse> response = new Response<>(HttpStatus.FOUND.value(), "Registro Encontrado", servicioResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    @PostMapping("/delete-servicio")
    public ResponseEntity<Response<ServicioResponse>> postDeleteServicio(@RequestBody ServicioRequest servicioRequest) {
        ServicioResponse servicioResponse = servicioService.delete(servicioRequest);
        Response<ServicioResponse> response = new Response<>(HttpStatus.FOUND.value(), "Registro Eliminado", servicioResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }
}
