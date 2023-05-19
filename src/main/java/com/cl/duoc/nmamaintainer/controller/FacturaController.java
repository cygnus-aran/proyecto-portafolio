package com.cl.duoc.nmamaintainer.controller;

import com.cl.duoc.nmamaintainer.dto.factura.FacturaRequest;
import com.cl.duoc.nmamaintainer.dto.factura.FacturaResponse;
import com.cl.duoc.nmamaintainer.service.factura.FacturaService;

import com.cl.duoc.nmamaintainer.dto.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/factura")
public class FacturaController {
    @Autowired
    private FacturaService facturaService;

    @GetMapping("/find-all")
    public ResponseEntity<Response<FacturaResponse>> getFindAllFacturas() {
        FacturaResponse facturaResponse = facturaService.findAll();
        Response<FacturaResponse> response = new Response<>(HttpStatus.OK.value(), "Registros Encontrados", facturaResponse);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/register-factura")
    public ResponseEntity<Response<FacturaResponse>> postRegisterFactura(@RequestBody FacturaRequest facturaRequest) {
        FacturaResponse facturaResponse = facturaService.register(facturaRequest);
        Response<FacturaResponse> response = new Response<>(HttpStatus.CREATED.value(), "Registro Creado", facturaResponse);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/find-factura")
    public ResponseEntity<Response<FacturaResponse>> postFindFactura(@RequestBody FacturaRequest facturaRequest) {
        FacturaResponse facturaResponse = facturaService.find(facturaRequest);
        Response<FacturaResponse> response = new Response<>(HttpStatus.FOUND.value(), "Registro Encontrado", facturaResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    @PostMapping("/update-factura")
    public ResponseEntity<Response<FacturaResponse>> postUpdateFactura(@RequestBody FacturaRequest facturaRequest) {
        FacturaResponse facturaResponse = facturaService.update(facturaRequest);
        Response<FacturaResponse> response = new Response<>(HttpStatus.FOUND.value(), "Registro Encontrado", facturaResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    @PostMapping("/delete-factura")
    public ResponseEntity<Response<FacturaResponse>> postDeleteFactura(@RequestBody FacturaRequest facturaRequest) {
        FacturaResponse facturaResponse = facturaService.delete(facturaRequest);
        Response<FacturaResponse> response = new Response<>(HttpStatus.FOUND.value(), "Registro Eliminado", facturaResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }
}
