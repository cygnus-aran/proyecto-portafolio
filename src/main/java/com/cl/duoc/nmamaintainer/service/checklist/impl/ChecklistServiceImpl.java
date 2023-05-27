package com.cl.duoc.nmamaintainer.service.checklist.impl;

import com.cl.duoc.nmamaintainer.dto.checklist.ChecklistRegisterRequest;
import com.cl.duoc.nmamaintainer.dto.checklist.ChecklistRegisterResponse;
import com.cl.duoc.nmamaintainer.entity.ChecklistEntity;
import com.cl.duoc.nmamaintainer.repository.ChecklistRepository;
import com.cl.duoc.nmamaintainer.service.checklist.ChecklistService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ChecklistServiceImpl implements ChecklistService {

    @Autowired
    ChecklistRepository checklistRepository;
    
    @Override
    public ChecklistRegisterResponse register(ChecklistRegisterRequest ChecklistRegisterRequest) {
        ChecklistRegisterResponse response = new ChecklistRegisterResponse();
        List<ChecklistEntity> save = checklistRepository.saveAll(ChecklistRegisterRequest.getChecklists());
        response.setOperation("Guardado");
        if(save == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        List<ChecklistEntity> checklists = save;
        response.setChecklists(save);
        return response;
    }

    @Override
    public ChecklistRegisterResponse find(ChecklistRegisterRequest ChecklistRegisterRequest) {
        ChecklistRegisterResponse response = new ChecklistRegisterResponse();
        Optional<ChecklistEntity> find = checklistRepository.findById(ChecklistRegisterRequest.getChecklists().get(0).getId());
        response.setOperation("Encontrar");
        response.setStatus("Exito");
        response.getChecklists().add(find.get());
        return response;
    }

    @Override
    public ChecklistRegisterResponse findAll() {
        ChecklistRegisterResponse response = new ChecklistRegisterResponse();
        List<ChecklistEntity> findall = checklistRepository.findAll();
        response.setOperation("Encontrar Todos");
        if(findall == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.setChecklists(findall);
        return response;
    }

    @Override
    public ChecklistRegisterResponse update(ChecklistRegisterRequest ChecklistRegisterRequest) {
        ChecklistRegisterResponse response = new ChecklistRegisterResponse();
        ChecklistEntity update = checklistRepository.saveAndFlush(ChecklistRegisterRequest.getChecklists().get(0));
        response.setOperation("Actualizar");
        if(update == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.getChecklists().add(update);
        return response;
    }

    @Override
    public ChecklistRegisterResponse delete(ChecklistRegisterRequest ChecklistRegisterRequest) {
        ChecklistRegisterResponse response = new ChecklistRegisterResponse();
        response.setOperation("Borrar");
        try {
            checklistRepository.deleteByIdChecklist(String.valueOf(ChecklistRegisterRequest.getChecklists().get(0).getId()));
        } catch (Exception e) {
            response.setStatus("Error");
            throw new RuntimeException(e);
        }
        response.setStatus("Exito");
        return response;
    }
}
