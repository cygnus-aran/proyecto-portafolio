package com.cl.duoc.nmamaintainer.controller;


import com.cl.duoc.nmamaintainer.dto.Response;
import com.cl.duoc.nmamaintainer.dto.client.ClientRegisterRequest;
import com.cl.duoc.nmamaintainer.dto.client.ClientRegisterResponse;
import com.cl.duoc.nmamaintainer.service.client.ClientRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="v1/client")
public class ClientController {
    @Autowired
    private ClientRegisterService clientRegisterService;

    @PostMapping("/register-client")
    public ResponseEntity<Response<ClientRegisterResponse>> postRegisterClient
            (@RequestBody ClientRegisterRequest clientRegisterRequest) {

        ClientRegisterResponse clientRegisterResponse = new ClientRegisterResponse();
        clientRegisterResponse = clientRegisterService.register(clientRegisterRequest);
        Response<ClientRegisterResponse> response = new Response<>(HttpStatus.CREATED.value(),
                "Pago informado", clientRegisterResponse);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
