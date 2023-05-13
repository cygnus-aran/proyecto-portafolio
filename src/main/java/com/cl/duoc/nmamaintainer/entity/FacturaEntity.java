package com.cl.duoc.nmamaintainer.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "factura", schema = "nma")
public class FacturaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Integer idFactura;

    @Column(name = "fecha_factura_emision")
    private Date fechaFacturaEmision;

    @Column(name = "fectura_total_neto")
    private BigDecimal facturaTotalNeto;

    @Column(name = "factura_total_bruto")
    private BigDecimal facturaTotalBruto;

    @Column(name = "factura_iva")
    private BigDecimal facturaIva;

    @Column(name = "cliente_id_empresa")
    private String clienteIdEmpresa;

    @Column(name = "servicio_id_servicio")
    private String servicioIdServicio;

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFechaFacturaEmision() {
        return fechaFacturaEmision;
    }

    public void setFechaFacturaEmision(Date fechaFacturaEmision) {
        this.fechaFacturaEmision = fechaFacturaEmision;
    }

    public BigDecimal getFacturaTotalNeto() {
        return facturaTotalNeto;
    }

    public void setFacturaTotalNeto(BigDecimal facturaTotalNeto) {
        this.facturaTotalNeto = facturaTotalNeto;
    }

    public BigDecimal getFacturaTotalBruto() {
        return facturaTotalBruto;
    }

    public void setFacturaTotalBruto(BigDecimal facturaTotalBruto) {
        this.facturaTotalBruto = facturaTotalBruto;
    }

    public BigDecimal getFacturaIva() {
        return facturaIva;
    }

    public void setFacturaIva(BigDecimal facturaIva) {
        this.facturaIva = facturaIva;
    }

    public String getClienteIdEmpresa() {
        return clienteIdEmpresa;
    }

    public void setClienteIdEmpresa(String clienteIdEmpresa) {
        this.clienteIdEmpresa = clienteIdEmpresa;
    }

    public String getServicioIdServicio() {
        return servicioIdServicio;
    }

    public void setServicioIdServicio(String servicioIdServicio) {
        this.servicioIdServicio = servicioIdServicio;
    }
}
