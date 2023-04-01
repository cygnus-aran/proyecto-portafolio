package com.cl.duoc.nmamaintainer.service.employee.impl;

import com.cl.duoc.nmamaintainer.dto.employee.EmployeeRegisterRequest;
import com.cl.duoc.nmamaintainer.dto.employee.EmployeeRegisterResponse;
import com.cl.duoc.nmamaintainer.entity.PersonaEntity;
import com.cl.duoc.nmamaintainer.repository.PersonaRepository;
import com.cl.duoc.nmamaintainer.service.employee.EmployeeRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.validation.constraints.NotNull;
import java.util.List;

@Service
@Transactional
public class EmployeeRegisterServiceImpl implements EmployeeRegisterService {

    @Autowired
    PersonaRepository personaRepository;
    @Override
    public EmployeeRegisterResponse register(@NotNull EmployeeRegisterRequest employeeRegisterRequest) {
        EmployeeRegisterResponse response = new EmployeeRegisterResponse();
        PersonaEntity save = personaRepository.save(employeeRegisterRequest.getEmployees().get(0));
        response.setOperation("Guardado");
        if(save == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.getPersonas().add(save);
        return response;
    }
    @Override
    public EmployeeRegisterResponse find(@NotNull EmployeeRegisterRequest employeeRegisterRequest) {
        EmployeeRegisterResponse response = new EmployeeRegisterResponse();
        PersonaEntity find = personaRepository.findByIdUsuario(employeeRegisterRequest.getEmployees().get(0).getIdUsuario());
        response.setOperation("Encontrar");
        if(find == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.getPersonas().add(find);
        return response;
    }

    @Override
    public EmployeeRegisterResponse findAll() {
        EmployeeRegisterResponse response = new EmployeeRegisterResponse();
        List<PersonaEntity> findall = personaRepository.findAll();
        response.setOperation("Encontrar Todos");
        if(findall == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.setPersonas(findall);
        return response;
    }
    @Override
    public EmployeeRegisterResponse update(@NotNull EmployeeRegisterRequest employeeRegisterRequest) {
        EmployeeRegisterResponse response = new EmployeeRegisterResponse();
        PersonaEntity update = personaRepository.saveAndFlush(employeeRegisterRequest.getEmployees().get(0));
        response.setOperation("Actualizar");
        if(update == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.getPersonas().add(update);
        return response;
    }
    @Override
    public EmployeeRegisterResponse delete(@NotNull EmployeeRegisterRequest employeeRegisterRequest) {
        EmployeeRegisterResponse response = new EmployeeRegisterResponse();
        response.setOperation("Borrar");
        try {
            personaRepository.deleteByIdUsuario(employeeRegisterRequest.getEmployees().get(0).getIdUsuario());
        } catch (Exception e) {
            response.setStatus("Error");
            throw new RuntimeException(e);
        }
        response.setStatus("Exito");
        return response;
    }
}
