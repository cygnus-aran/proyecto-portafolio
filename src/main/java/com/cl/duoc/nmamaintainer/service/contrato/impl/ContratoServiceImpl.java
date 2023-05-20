package com.cl.duoc.nmamaintainer.service.contrato.impl;

import com.cl.duoc.nmamaintainer.dto.contrato.ContratoRequest;
import com.cl.duoc.nmamaintainer.dto.contrato.ContratoResponse;
import com.cl.duoc.nmamaintainer.entity.ContratoEntity;
import com.cl.duoc.nmamaintainer.repository.ContratoRepository;
import com.cl.duoc.nmamaintainer.service.contrato.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ContratoServiceImpl implements ContratoService {

    @Autowired
    ContratoRepository contratoRepository;

    @Override
    public ContratoResponse register(ContratoRequest contratoRequest) {
        ContratoResponse response = new ContratoResponse();
        ContratoEntity save = contratoRepository.save(contratoRequest.getContracts().get(0));
        response.setOperation("Guardado");
        if (save == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        List<ContratoEntity> contracts = new ArrayList<>();
        response.setContracts(contracts);
        response.getContracts().add(save);
        return response;
    }

    @Override
    public ContratoResponse find(ContratoRequest contratoRequest) {
        ContratoResponse response = new ContratoResponse();
        Optional<ContratoEntity> find = contratoRepository.findById(contratoRequest.getContracts().get(0).getIdContrato());
        response.setOperation("Encontrar");
        response.setStatus("Exito");
        response.getContracts().add(find.get());
        return response;
    }

    @Override
    public ContratoResponse findAll() {
        ContratoResponse response = new ContratoResponse();
        List<ContratoEntity> findAll = contratoRepository.findAll();
        response.setOperation("Encontrar Todos");
        if (findAll == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.setContracts(findAll);
        return response;
    }

    @Override
    public ContratoResponse update(ContratoRequest contratoRequest) {
        ContratoResponse response = new ContratoResponse();
        ContratoEntity update = contratoRepository.saveAndFlush(contratoRequest.getContracts().get(0));
        response.setOperation("Actualizar");
        if (update == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.getContracts().add(update);
        return response;
    }

    @Override
    public ContratoResponse delete(ContratoRequest contratoRequest) {
        ContratoResponse response = new ContratoResponse();
        response.setOperation("Borrar");
        try {
            contratoRepository.deleteById(contratoRequest.getContracts().get(0).getIdContrato());
        } catch (Exception e) {
            response.setStatus("Error");
            throw new RuntimeException(e);
        }
        response.setStatus("Exito");
        return response;
    }
}
