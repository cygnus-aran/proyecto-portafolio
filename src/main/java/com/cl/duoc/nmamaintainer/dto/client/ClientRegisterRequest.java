package com.cl.duoc.nmamaintainer.dto.client;

import com.cl.duoc.nmamaintainer.entity.ClienteEntity;

import java.util.List;

public class ClientRegisterRequest {

    private List<ClienteEntity> clients;

    public ClientRegisterRequest() {
    }

    public ClientRegisterRequest(List<ClienteEntity> clients) {
        this.clients = clients;
    }

    public List<ClienteEntity> getClients() {
        return clients;
    }

    public void setClients(List<ClienteEntity> clients) {
        this.clients = clients;
    }
}
