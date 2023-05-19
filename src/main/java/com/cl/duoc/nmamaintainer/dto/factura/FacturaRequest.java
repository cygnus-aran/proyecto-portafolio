package com.cl.duoc.nmamaintainer.dto.factura;

import com.cl.duoc.nmamaintainer.entity.FacturaEntity;

import java.util.List;

public class FacturaRequest {

    private List<FacturaEntity> facturas;

    public FacturaRequest() {
    }

    public FacturaRequest(List<FacturaEntity> facturas) {
        this.facturas = facturas;
    }

    public List<FacturaEntity> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<FacturaEntity> facturas) {
        this.facturas = facturas;
    }
}
