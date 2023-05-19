package com.cl.duoc.nmamaintainer.service.rol.impl;

import com.cl.duoc.nmamaintainer.dto.rol.RolRequest;
import com.cl.duoc.nmamaintainer.dto.rol.RolResponse;
import com.cl.duoc.nmamaintainer.entity.RolEntity;
import com.cl.duoc.nmamaintainer.repository.RolRepository;
import com.cl.duoc.nmamaintainer.service.rol.RolService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RolServiceImpl implements RolService {

    @Autowired
    RolRepository rolRepository;

    @Override
    public RolResponse register(RolRequest rolRequest) {
        RolResponse response = new RolResponse();
        RolEntity save = rolRepository.save(rolRequest.getRoles().get(0));
        response.setOperation("Guardado");
        if (save == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        List<RolEntity> roles = new ArrayList<>();
        response.setRoles(roles);
        response.getRoles().add(save);
        return response;
    }

    @Override
    public RolResponse find(RolRequest rolRequest) {
        RolResponse response = new RolResponse();
        Optional<RolEntity> find = Optional.ofNullable(rolRepository.findById(rolRequest.getRoles().get(0).getIdRol()));
        response.setOperation("Encontrar");
        response.setStatus("Exito");
        response.getRoles().add(find.get());
        return response;
    }

    @Override
    public RolResponse findAll() {
        RolResponse response = new RolResponse();
        List<RolEntity> findAll = rolRepository.findAll();
        response.setOperation("Encontrar Todos");
        if (findAll == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.setRoles(findAll);
        return response;
    }

    @Override
    public RolResponse update(RolRequest rolRequest) {
        RolResponse response = new RolResponse();
        RolEntity update = rolRepository.saveAndFlush(rolRequest.getRoles().get(0));
        response.setOperation("Actualizar");
        if (update == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.getRoles().add(update);
        return response;
    }

    @Override
    public RolResponse delete(RolRequest rolRequest) {
        RolResponse response = new RolResponse();
        response.setOperation("Borrar");
        try {
            rolRepository.deleteById(rolRequest.getRoles().get(0).getIdRol());
        } catch (Exception e) {
            response.setStatus("Error");
            throw new RuntimeException(e);
        }
        response.setStatus("Exito");
        return response;
    }
}
