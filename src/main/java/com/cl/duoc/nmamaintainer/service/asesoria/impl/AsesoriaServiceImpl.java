package com.cl.duoc.nmamaintainer.service.asesoria.impl;

import com.cl.duoc.nmamaintainer.dto.asesoria.AsesoriaRegisterRequest;
import com.cl.duoc.nmamaintainer.dto.asesoria.AsesoriaRegisterResponse;
import com.cl.duoc.nmamaintainer.entity.AsesoriaEntity;
import com.cl.duoc.nmamaintainer.repository.AsesoriaRepository;
import com.cl.duoc.nmamaintainer.service.asesoria.AsesoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AsesoriaServiceImpl implements AsesoriaService {

    @Autowired
    AsesoriaRepository asesoriaRepository;

    @Override
    public AsesoriaRegisterResponse register(AsesoriaRegisterRequest asesoriaRegisterRequest) {
        AsesoriaRegisterResponse response = new AsesoriaRegisterResponse();
        AsesoriaEntity save = asesoriaRepository.save(asesoriaRegisterRequest.getAsesorias().get(0));
        response.setOperation("Guardado");
        if (save == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        List<AsesoriaEntity> asesorias = new ArrayList<>();
        response.setAsesorias(asesorias);
        response.getAsesorias().add(save);
        return response;
    }

    @Override
    public AsesoriaRegisterResponse find(AsesoriaRegisterRequest asesoriaRegisterRequest) {
        AsesoriaRegisterResponse response = new AsesoriaRegisterResponse();
        Optional<AsesoriaEntity> find = asesoriaRepository.findById(asesoriaRegisterRequest.getAsesorias().get(0).getIdAsesoria());
        response.setOperation("Encontrar");
        response.setStatus("Exito");
        response.getAsesorias().add(find.get());
        return response;
    }

    @Override
    public AsesoriaRegisterResponse findAll() {
        AsesoriaRegisterResponse response = new AsesoriaRegisterResponse();
        List<AsesoriaEntity> findAll = asesoriaRepository.findAll();
        response.setOperation("Encontrar Todos");
        if (findAll == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.setAsesorias(findAll);
        return response;
    }

    @Override
    public AsesoriaRegisterResponse update(AsesoriaRegisterRequest asesoriaRegisterRequest) {
        AsesoriaRegisterResponse response = new AsesoriaRegisterResponse();
        AsesoriaEntity update = asesoriaRepository.saveAndFlush(asesoriaRegisterRequest.getAsesorias().get(0));
        response.setOperation("Actualizar");
        if (update == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.getAsesorias().add(update);
        return response;
    }

    @Override
    public AsesoriaRegisterResponse delete(AsesoriaRegisterRequest asesoriaRegisterRequest) {
        AsesoriaRegisterResponse response = new AsesoriaRegisterResponse();
        response.setOperation("Borrar");
        try {
            asesoriaRepository.deleteById(asesoriaRegisterRequest.getAsesorias().get(0).getIdAsesoria());
        } catch (Exception e) {
            response.setStatus("Error");
            throw new RuntimeException(e);
        }
        response.setStatus("Exito");
        return response;
    }
}

