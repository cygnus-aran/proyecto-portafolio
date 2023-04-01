package com.cl.duoc.nmamaintainer.service.login.impl;

import com.cl.duoc.nmamaintainer.dto.login.LoginRequest;
import com.cl.duoc.nmamaintainer.dto.login.LoginResponse;
import com.cl.duoc.nmamaintainer.entity.PersonaEntity;
import com.cl.duoc.nmamaintainer.repository.LoginRepository;
import com.cl.duoc.nmamaintainer.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Objects;


@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginRepository loginRepository;
    @Override
    public LoginResponse validate(LoginRequest loginRequest) {
        LoginResponse response = new LoginResponse();
        PersonaEntity login = loginRepository.findByPasswordAndRutPersona(loginRequest.getPassword(),
                Integer.parseInt(loginRequest.getUser()));
        if(login == null) {
            response.setRol("");
            response.setMessage("Usuario o Contraseña Inválido");
            return response;
        }
        response.setRol(String.valueOf(login.getIdRol()));
        response.setMessage("Login Exitoso");
        return response;
    }
}
