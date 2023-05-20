package com.cl.duoc.nmamaintainer.dto.contrato;

import com.cl.duoc.nmamaintainer.entity.ContratoEntity;

import java.util.List;

public class ContratoRequest {

    private List<ContratoEntity> contracts;

    public ContratoRequest() {
    }

    public ContratoRequest(List<ContratoEntity> contracts) {
        this.contracts = contracts;
    }

    public List<ContratoEntity> getContracts() {
        return contracts;
    }

    public void setContracts(List<ContratoEntity> contracts) {
        this.contracts = contracts;
    }
}