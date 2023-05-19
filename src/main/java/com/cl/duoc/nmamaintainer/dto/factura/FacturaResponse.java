package com.cl.duoc.nmamaintainer.dto.factura;

import com.cl.duoc.nmamaintainer.entity.FacturaEntity;

import java.util.List;

public class FacturaResponse {

    private String operation;
    private String status;
    private List<FacturaEntity> facturas;

    public FacturaResponse() {
    }

    public FacturaResponse(String operation, String status, List<FacturaEntity> facturas) {
        this.operation = operation;
        this.status = status;
        this.facturas = facturas;
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

    public List<FacturaEntity> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<FacturaEntity> facturas) {
        this.facturas = facturas;
    }
}
