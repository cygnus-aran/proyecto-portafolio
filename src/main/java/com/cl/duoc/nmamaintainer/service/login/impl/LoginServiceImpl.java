package com.cl.duoc.nmamaintainer.service.login.impl;

import com.cl.duoc.nmamaintainer.dto.login.LoginRequest;
import com.cl.duoc.nmamaintainer.dto.login.LoginResponse;
import com.cl.duoc.nmamaintainer.entity.LoginEntity;
import com.cl.duoc.nmamaintainer.entity.PersonaEntity;
import com.cl.duoc.nmamaintainer.entity.UsuarioEntity;
import com.cl.duoc.nmamaintainer.repository.LoginRepository;
import com.cl.duoc.nmamaintainer.repository.UsuarioRepository;
import com.cl.duoc.nmamaintainer.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import java.util.Random;


@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginRepository loginRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public LoginResponse validate(LoginRequest loginRequest) {
        LoginResponse response = new LoginResponse();
        UsuarioEntity login = usuarioRepository.findByNombreUsuarioAndContraseñaUsuario(loginRequest.getUser(),
                loginRequest.getPassword());
        if(login == null) {
            response.setRol("");
            response.setMessage("Usuario o Contraseña Inválido");
            return response;
        }
        LoginEntity le = new LoginEntity();
        le.setEstado("A");
        le.setFechaLogin(LocalDate.now());
        le.setFechaLogout(LocalDate.of(1900, 1,1));
        le.setUsuarioIdUsuario(login.getIdUsuario().toString());
        le.setIdLogin(new Random().nextInt(101));
        try {
            loginRepository.save(le);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        response.setRol(String.valueOf(login.getRolIdRol()));
        response.setMessage("Login Exitoso");
        return response;
    }
}
