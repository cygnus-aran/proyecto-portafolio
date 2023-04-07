package com.cl.duoc.nmamaintainer.service.client.impl;

import com.cl.duoc.nmamaintainer.dto.client.ClientRegisterRequest;
import com.cl.duoc.nmamaintainer.dto.client.ClientRegisterResponse;
import com.cl.duoc.nmamaintainer.dto.employee.EmployeeRegisterResponse;
import com.cl.duoc.nmamaintainer.entity.EmpresaClienteEntity;
import com.cl.duoc.nmamaintainer.entity.PersonaEntity;
import com.cl.duoc.nmamaintainer.repository.EmpresaClienteRepository;
import com.cl.duoc.nmamaintainer.repository.PersonaRepository;
import com.cl.duoc.nmamaintainer.service.client.ClientRegisterService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ClientRegisterServiceImpl implements ClientRegisterService {

    @Autowired
    EmpresaClienteRepository empresaClienteRepository;
    @Override
    public ClientRegisterResponse register(ClientRegisterRequest clientRegisterRequest) {
        ClientRegisterResponse response = new ClientRegisterResponse();
        EmpresaClienteEntity save = empresaClienteRepository.save(clientRegisterRequest.getClients().get(0));
        response.setOperation("Guardado");
        if(save == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        List<EmpresaClienteEntity> clientes = new ArrayList<EmpresaClienteEntity>();
        response.setClientes(clientes);
        response.getClientes().add(save);
        return response;
    }

    @Override
    public ClientRegisterResponse find(ClientRegisterRequest clientRegisterRequest) {
        ClientRegisterResponse response = new ClientRegisterResponse();
        EmpresaClienteEntity find = empresaClienteRepository.findByIdEmpresa(clientRegisterRequest.getClients().get(0).getIdEmpresa());
        response.setOperation("Encontrar");
        if(find == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.getClientes().add(find);
        return response;
    }

    @Override
    public ClientRegisterResponse findAll() {
        ClientRegisterResponse response = new ClientRegisterResponse();
        List<EmpresaClienteEntity> findall = empresaClienteRepository.findAll();
        response.setOperation("Encontrar Todos");
        if(findall == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.setClientes(findall);
        return response;
    }

    @Override
    public ClientRegisterResponse update(ClientRegisterRequest clientRegisterRequest) {
        ClientRegisterResponse response = new ClientRegisterResponse();
        EmpresaClienteEntity update = empresaClienteRepository.saveAndFlush(clientRegisterRequest.getClients().get(0));
        response.setOperation("Actualizar");
        if(update == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.getClientes().add(update);
        return response;    }

    @Override
    public ClientRegisterResponse delete(ClientRegisterRequest clientRegisterRequest) {
        ClientRegisterResponse response = new ClientRegisterResponse();
        response.setOperation("Borrar");
        try {
            empresaClienteRepository.deleteByIdEmpresa(clientRegisterRequest.getClients().get(0).getIdEmpresa());
        } catch (Exception e) {
            response.setStatus("Error");
            throw new RuntimeException(e);
        }
        response.setStatus("Exito");
        return response;
    }
}
