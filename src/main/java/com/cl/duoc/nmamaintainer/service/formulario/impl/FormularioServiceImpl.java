package com.cl.duoc.nmamaintainer.service.formulario.impl;

import com.cl.duoc.nmamaintainer.dto.formulario.FormularioRequest;
import com.cl.duoc.nmamaintainer.dto.formulario.FormularioResponse;
import com.cl.duoc.nmamaintainer.entity.FormularioEntity;
import com.cl.duoc.nmamaintainer.repository.FormularioRepository;
import com.cl.duoc.nmamaintainer.service.formulario.FormularioService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FormularioServiceImpl implements FormularioService {

    @Autowired
    FormularioRepository formularioRepository;

    @Override
    public FormularioResponse register(FormularioRequest formularioRequest) {
        FormularioResponse response = new FormularioResponse();
        FormularioEntity save = formularioRepository.save(formularioRequest.getFormularios().get(0));
        response.setOperation("Guardado");
        if (save == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        List<FormularioEntity> formularios = new ArrayList<>();
        response.setFormularios(formularios);
        response.getFormularios().add(save);
        return response;
    }

    @Override
    public FormularioResponse find(FormularioRequest formularioRequest) {
        FormularioResponse response = new FormularioResponse();
        Optional<FormularioEntity> find = formularioRepository.findById(formularioRequest.getFormularios().get(0).getFolio());
        response.setOperation("Encontrar");
        response.setStatus("Exito");
        response.getFormularios().add(find.get());
        return response;
    }

    @Override
    public FormularioResponse findAll() {
        FormularioResponse response = new FormularioResponse();
        List<FormularioEntity> findAll = formularioRepository.findAll();
        response.setOperation("Encontrar Todos");
        if (findAll == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.setFormularios(findAll);
        return response;
    }

    @Override
    public FormularioResponse update(FormularioRequest formularioRequest) {
        FormularioResponse response = new FormularioResponse();
        FormularioEntity update = formularioRepository.saveAndFlush(formularioRequest.getFormularios().get(0));
        response.setOperation("Actualizar");
        if (update == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.getFormularios().add(update);
        return response;
    }

    @Override
    public FormularioResponse delete(FormularioRequest formularioRequest) {
        FormularioResponse response = new FormularioResponse();
        response.setOperation("Borrar");
        try {
            formularioRepository.deleteById(formularioRequest.getFormularios().get(0).getFolio());
        } catch (Exception e) {
            response.setStatus("Error");
            throw new RuntimeException(e);
        }
        response.setStatus("Exito");
        return response;
    }
}
