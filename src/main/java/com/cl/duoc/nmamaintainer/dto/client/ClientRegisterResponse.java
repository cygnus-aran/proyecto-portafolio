package com.cl.duoc.nmamaintainer.dto.client;

import com.cl.duoc.nmamaintainer.entity.ClienteEntity;

import java.util.List;

public class ClientRegisterResponse {

    private String operation;
    private String status;
    private List<ClienteEntity> clientes;

    public ClientRegisterResponse() {
    }

    public ClientRegisterResponse(String operation, String status, List<ClienteEntity> clientes) {
        this.operation = operation;
        this.status = status;
        this.clientes = clientes;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ClienteEntity> getClientes() {
        return clientes;
    }

    public void setClientes(List<ClienteEntity> clientes) {
        this.clientes = clientes;
    }
}
