package com.cl.duoc.nmamaintainer.service.servicio.impl;

import com.cl.duoc.nmamaintainer.dto.servicio.ServicioRequest;
import com.cl.duoc.nmamaintainer.dto.servicio.ServicioResponse;
import com.cl.duoc.nmamaintainer.entity.ServicioEntity;
import com.cl.duoc.nmamaintainer.repository.ServicioRepository;
import com.cl.duoc.nmamaintainer.service.servicio.ServicioService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ServicioServiceImpl implements ServicioService {

    @Autowired
    ServicioRepository servicioRepository;

    @Override
    public ServicioResponse register(ServicioRequest servicioRequest) {
        ServicioResponse response = new ServicioResponse();
        ServicioEntity save = servicioRepository.save(servicioRequest.getServicios().get(0));
        response.setOperation("Guardado");
        if (save == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        List<ServicioEntity> servicios = new ArrayList<>();
        response.setServicios(servicios);
        response.getServicios().add(save);
        return response;
    }

    @Override
    public ServicioResponse find(ServicioRequest servicioRequest) {
        ServicioResponse response = new ServicioResponse();
        Optional<ServicioEntity> find = servicioRepository.findById(servicioRequest.getServicios().get(0).getIdServicio());
        response.setOperation("Encontrar");
        response.setStatus("Exito");
        response.getServicios().add(find.get());
        return response;
    }

    @Override
    public ServicioResponse findAll() {
        ServicioResponse response = new ServicioResponse();
        List<ServicioEntity> findAll = servicioRepository.findAll();
        response.setOperation("Encontrar Todos");
        if (findAll == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.setServicios(findAll);
        return response;
    }

    @Override
    public ServicioResponse update(ServicioRequest servicioRequest) {
        ServicioResponse response = new ServicioResponse();
        ServicioEntity update = servicioRepository.saveAndFlush(servicioRequest.getServicios().get(0));
        response.setOperation("Actualizar");
        if (update == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.getServicios().add(update);
        return response;
    }

    @Override
    public ServicioResponse delete(ServicioRequest servicioRequest) {
        ServicioResponse response = new ServicioResponse();
        response.setOperation("Borrar");
        try {
            servicioRepository.deleteById(servicioRequest.getServicios().get(0).getIdServicio());
        } catch (Exception e) {
            response.setStatus("Error");
            throw new RuntimeException(e);
        }
        response.setStatus("Exito");
        return response;
    }
}
