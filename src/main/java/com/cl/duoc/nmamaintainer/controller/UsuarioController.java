package com.cl.duoc.nmamaintainer.controller;

import com.cl.duoc.nmamaintainer.dto.Response;
import com.cl.duoc.nmamaintainer.dto.usuario.UsuarioRequest;
import com.cl.duoc.nmamaintainer.dto.usuario.UsuarioResponse;
import com.cl.duoc.nmamaintainer.service.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
// Other imports...

@RestController
@RequestMapping(value = "v1/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/find-all")
    public ResponseEntity<Response<UsuarioResponse>> getFindAllUsuarios() {
        UsuarioResponse usuarioResponse = usuarioService.findAll();
        Response<UsuarioResponse> response = new Response<>(HttpStatus.OK.value(), "Registros Encontrados", usuarioResponse);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/register-usuario")
    public ResponseEntity<Response<UsuarioResponse>> postRegisterUsuario(@RequestBody UsuarioRequest usuarioRequest) {
        UsuarioResponse usuarioResponse = usuarioService.register(usuarioRequest);
        Response<UsuarioResponse> response = new Response<>(HttpStatus.CREATED.value(), "Registro Creado", usuarioResponse);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/find-usuario")
    public ResponseEntity<Response<UsuarioResponse>> postFindUsuario(@RequestBody UsuarioRequest usuarioRequest) {
        UsuarioResponse usuarioResponse = usuarioService.find(usuarioRequest);
        Response<UsuarioResponse> response = new Response<>(HttpStatus.FOUND.value(), "Registro Encontrado", usuarioResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    @PostMapping("/update-usuario")
    public ResponseEntity<Response<UsuarioResponse>> postUpdateUsuario(@RequestBody UsuarioRequest usuarioRequest) {
        UsuarioResponse usuarioResponse = usuarioService.update(usuarioRequest);
        Response<UsuarioResponse> response = new Response<>(HttpStatus.FOUND.value(), "Registro Encontrado", usuarioResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    @PostMapping("/delete-usuario")
    public ResponseEntity<Response<UsuarioResponse>> postDeleteUsuario(@RequestBody UsuarioRequest usuarioRequest) {
        UsuarioResponse usuarioResponse = usuarioService.delete(usuarioRequest);
        Response<UsuarioResponse> response = new Response<>(HttpStatus.FOUND.value(), "Registro Eliminado", usuarioResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }
}
