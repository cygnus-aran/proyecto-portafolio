package com.cl.duoc.nmamaintainer.dto.client;

import com.cl.duoc.nmamaintainer.entity.EmpresaClienteEntity;

import java.util.List;

public class ClientRegisterRequest {

    private List<EmpresaClienteEntity> clients;

    public ClientRegisterRequest() {
    }

    public ClientRegisterRequest(List<EmpresaClienteEntity> clients) {
        this.clients = clients;
    }

    public List<EmpresaClienteEntity> getClients() {
        return clients;
    }

    public void setClients(List<EmpresaClienteEntity> clients) {
        this.clients = clients;
    }
}
