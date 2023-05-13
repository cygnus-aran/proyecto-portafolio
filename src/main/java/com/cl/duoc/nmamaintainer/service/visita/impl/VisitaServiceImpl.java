package com.cl.duoc.nmamaintainer.service.visita.impl;

import com.cl.duoc.nmamaintainer.dto.client.ClientRegisterResponse;
import com.cl.duoc.nmamaintainer.dto.visita.VisitaRequest;
import com.cl.duoc.nmamaintainer.dto.visita.VisitaResponse;
import com.cl.duoc.nmamaintainer.entity.ClienteEntity;
import com.cl.duoc.nmamaintainer.entity.VisitaEntity;
import com.cl.duoc.nmamaintainer.repository.VisitaRepository;
import com.cl.duoc.nmamaintainer.service.visita.VisitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VisitaServiceImpl implements VisitaService {

    @Autowired
    VisitaRepository visitaRepository;

    @Override
    public VisitaResponse register(VisitaRequest visitaRequest) {
        VisitaResponse response = new VisitaResponse();
        VisitaEntity save = visitaRepository.save(visitaRequest.getVisits().get(0));
        response.setOperation("Guardado");
        if(save == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        List<VisitaEntity> visits = new ArrayList<VisitaEntity>();
        response.setVisits(visits);
        response.getVisits().add(save);
        return response;
    }

    @Override
    public VisitaResponse find(VisitaRequest visitaRequest) {
        VisitaResponse response = new VisitaResponse();
        Optional<VisitaEntity> find = visitaRepository.findById(visitaRequest.getVisits().get(0).getIdVisita());
        response.setOperation("Encontrar");
        response.setStatus("Exito");
        response.getVisits().add(find.get());
        return response;
    }

    @Override
    public VisitaResponse findAll() {
        VisitaResponse response = new VisitaResponse();
        List<VisitaEntity> findall = visitaRepository.findAll();
        response.setOperation("Encontrar Todos");
        if(findall == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.setVisits(findall);
        return response;
    }

    @Override
    public VisitaResponse update(VisitaRequest visitaRequest) {
        VisitaResponse response = new VisitaResponse();
        VisitaEntity update = visitaRepository.saveAndFlush(visitaRequest.getVisits().get(0));
        response.setOperation("Actualizar");
        if(update == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.getVisits().add(update);
        return response;
    }

    @Override
    public VisitaResponse delete(VisitaRequest visitaRequest) {
        VisitaResponse response = new VisitaResponse();
        response.setOperation("Borrar");
        try {
            visitaRepository.deleteById(visitaRequest.getVisits().get(0).getIdVisita());
        } catch (Exception e) {
            response.setStatus("Error");
            throw new RuntimeException(e);
        }
        response.setStatus("Exito");
        return response;
    }
}
