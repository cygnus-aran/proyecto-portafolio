package com.cl.duoc.nmamaintainer.service.usuario.impl;

import com.cl.duoc.nmamaintainer.dto.usuario.UsuarioRequest;
import com.cl.duoc.nmamaintainer.dto.usuario.UsuarioResponse;
import com.cl.duoc.nmamaintainer.entity.UsuarioEntity;
import com.cl.duoc.nmamaintainer.repository.UsuarioRepository;
import com.cl.duoc.nmamaintainer.service.usuario.UsuarioService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public UsuarioResponse register(UsuarioRequest usuarioRequest) {
        UsuarioResponse response = new UsuarioResponse();
        UsuarioEntity save = usuarioRepository.save(usuarioRequest.getUsuarios().get(0));
        response.setOperation("Guardado");
        if (save == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        List<UsuarioEntity> usuarios = new ArrayList<>();
        response.setUsuarios(usuarios);
        response.getUsuarios().add(save);
        return response;
    }

    @Override
    public UsuarioResponse find(UsuarioRequest usuarioRequest) {
        UsuarioResponse response = new UsuarioResponse();
        Optional<UsuarioEntity> find = usuarioRepository.findById(usuarioRequest.getUsuarios().get(0).getIdUsuario());
        response.setOperation("Encontrar");
        response.setStatus("Exito");
        response.getUsuarios().add(find.get());
        return response;
    }

    @Override
    public UsuarioResponse findAll() {
        UsuarioResponse response = new UsuarioResponse();
        List<UsuarioEntity> findAll = usuarioRepository.findAll();
        response.setOperation("Encontrar Todos");
        if (findAll == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.setUsuarios(findAll);
        return response;
    }

    @Override
    public UsuarioResponse update(UsuarioRequest usuarioRequest) {
        UsuarioResponse response = new UsuarioResponse();
        UsuarioEntity update = usuarioRepository.saveAndFlush(usuarioRequest.getUsuarios().get(0));
        response.setOperation("Actualizar");
        if (update == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.getUsuarios().add(update);
        return response;
    }

    @Override
    public UsuarioResponse delete(UsuarioRequest usuarioRequest) {
        UsuarioResponse response = new UsuarioResponse();
        response.setOperation("Borrar");
        try {
            usuarioRepository.deleteById(usuarioRequest.getUsuarios().get(0).getIdUsuario());
        } catch (Exception e) {
            response.setStatus("Error");
            throw new RuntimeException(e);
        }
        response.setStatus("Exito");
        return response;
    }
}
