package com.cl.duoc.nmamaintainer.controller;


import com.cl.duoc.nmamaintainer.dto.Response;
import com.cl.duoc.nmamaintainer.dto.client.ClientRegisterRequest;
import com.cl.duoc.nmamaintainer.dto.client.ClientRegisterResponse;
import com.cl.duoc.nmamaintainer.dto.employee.EmployeeRegisterRequest;
import com.cl.duoc.nmamaintainer.dto.employee.EmployeeRegisterResponse;
import com.cl.duoc.nmamaintainer.service.client.ClientRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="v1/client")
public class ClientController {
    @Autowired
    private ClientRegisterService clientRegisterService;


    @GetMapping("/find-all")
    public ResponseEntity<Response<ClientRegisterResponse>> getFindAllClients() {

        ClientRegisterResponse clientRegisterResponse = new ClientRegisterResponse();

        clientRegisterResponse = clientRegisterService.findAll();

        Response<ClientRegisterResponse> response = new Response<>(HttpStatus.CREATED.value(),
                "Registros Encontrados", clientRegisterResponse);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/register-client")
    public ResponseEntity<Response<ClientRegisterResponse>> postRegisterClient
            (@RequestBody ClientRegisterRequest clientRegisterRequest) {

        ClientRegisterResponse clientRegisterResponse = new ClientRegisterResponse();
        clientRegisterResponse = clientRegisterService.register(clientRegisterRequest);
        Response<ClientRegisterResponse> response = new Response<>(HttpStatus.CREATED.value(),
                "Registro Creado", clientRegisterResponse);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/find-client")
    public ResponseEntity<Response<ClientRegisterResponse>> postFindClient
            (@RequestBody ClientRegisterRequest clientRegisterRequest) {

        ClientRegisterResponse clientRegisterResponse = new ClientRegisterResponse();

        clientRegisterResponse = clientRegisterService.find(clientRegisterRequest);

        Response<ClientRegisterResponse> response = new Response<>(HttpStatus.FOUND.value(),
                "Registro Encontrado", clientRegisterResponse);

        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    @PostMapping("/update-client")
    public ResponseEntity<Response<ClientRegisterResponse>> postUpdateClient
            (@RequestBody ClientRegisterRequest clientRegisterRequest) {

        ClientRegisterResponse clientRegisterResponse = new ClientRegisterResponse();

        clientRegisterResponse = clientRegisterService.update(clientRegisterRequest);

        Response<ClientRegisterResponse> response = new Response<>(HttpStatus.FOUND.value(),
                "Registro Encontrado", clientRegisterResponse);

        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    @PostMapping("/delete-client")
    public ResponseEntity<Response<ClientRegisterResponse>> postDeleteClient
            (@RequestBody ClientRegisterRequest clientRegisterRequest) {

        ClientRegisterResponse clientRegisterResponse = new ClientRegisterResponse();

        clientRegisterResponse = clientRegisterService.delete(clientRegisterRequest);

        Response<ClientRegisterResponse> response = new Response<>(HttpStatus.FOUND.value(),
                "Registro Eliminado", clientRegisterResponse);

        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

}
