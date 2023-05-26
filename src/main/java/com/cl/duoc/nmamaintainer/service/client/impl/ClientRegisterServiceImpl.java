package com.cl.duoc.nmamaintainer.service.client.impl;

import com.cl.duoc.nmamaintainer.dto.client.ClientRegisterRequest;
import com.cl.duoc.nmamaintainer.dto.client.ClientRegisterResponse;
import com.cl.duoc.nmamaintainer.entity.ClienteEntity;
import com.cl.duoc.nmamaintainer.repository.ClienteRepository;
import com.cl.duoc.nmamaintainer.service.client.ClientRegisterService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ClientRegisterServiceImpl implements ClientRegisterService {

    @Autowired
    ClienteRepository clienteRepository;
    @Override
    public ClientRegisterResponse register(ClientRegisterRequest clientRegisterRequest) {
        ClientRegisterResponse response = new ClientRegisterResponse();
        ClienteEntity save = clienteRepository.save(clientRegisterRequest.getClients().get(0));
        response.setOperation("Guardado");
        if(save == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        List<ClienteEntity> clientes = new ArrayList<ClienteEntity>();
        response.setClientes(clientes);
        response.getClientes().add(save);
        return response;
    }

    @Override
    public ClientRegisterResponse find(ClientRegisterRequest clientRegisterRequest) {
        ClientRegisterResponse response = new ClientRegisterResponse();
        Optional<ClienteEntity> find = clienteRepository.findById(clientRegisterRequest.getClients().get(0).getId());
        response.setOperation("Encontrar");
        response.setStatus("Exito");
        response.getClientes().add(find.get());
        return response;
    }

    @Override
    public ClientRegisterResponse findAll() {
        ClientRegisterResponse response = new ClientRegisterResponse();
        List<ClienteEntity> findall = clienteRepository.findAll();
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
        ClienteEntity update = clienteRepository.saveAndFlush(clientRegisterRequest.getClients().get(0));
        response.setOperation("Actualizar");
        if(update == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.getClientes().add(update);
        return response;
    }

    @Override
    public ClientRegisterResponse delete(ClientRegisterRequest clientRegisterRequest) {
        ClientRegisterResponse response = new ClientRegisterResponse();
        response.setOperation("Borrar");
        try {
            clienteRepository.deleteByIdEmpresa(clientRegisterRequest.getClients().get(0).getIdEmpresa());
        } catch (Exception e) {
            response.setStatus("Error");
            throw new RuntimeException(e);
        }
        response.setStatus("Exito");
        return response;
    }
}
