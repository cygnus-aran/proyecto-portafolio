package com.cl.duoc.nmamaintainer.dto.contrato;

import com.cl.duoc.nmamaintainer.entity.ContratoEntity;

import java.util.List;

public class ContratoResponse {

    private String operation;
    private String status;
    private List<ContratoEntity> contracts;

    public ContratoResponse() {
    }

    public ContratoResponse(String operation, String status, List<ContratoEntity> contracts) {
        this.operation = operation;
        this.status = status;
        this.contracts = contracts;
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

    public List<ContratoEntity> getContracts() {
        return contracts;
    }

    public void setContracts(List<ContratoEntity> contracts) {
        this.contracts = contracts;
    }
}
