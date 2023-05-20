package com.cl.duoc.nmamaintainer.controller;

import com.cl.duoc.nmamaintainer.dto.Response;
import com.cl.duoc.nmamaintainer.dto.login.LoginRequest;
import com.cl.duoc.nmamaintainer.dto.login.LoginResponse;
import com.cl.duoc.nmamaintainer.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/credentials")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<Response<LoginResponse>> postLogin
            (@RequestBody LoginRequest loginRequest) {
        LoginResponse loginResponse = new LoginResponse();
        loginResponse = loginService.validate(loginRequest);
        Response<LoginResponse> response;
        if(loginResponse.getRol().length() == 0) {
            response = new Response<>(HttpStatus.UNAUTHORIZED.value(), "Usuario Inválido", loginResponse);
        } else {
            response = new Response<>(HttpStatus.ACCEPTED.value(), "Bienvenido!", loginResponse);
        }
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
