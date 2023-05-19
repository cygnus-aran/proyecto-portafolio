package com.cl.duoc.nmamaintainer.service.factura;

import com.cl.duoc.nmamaintainer.dto.factura.FacturaRequest;
import com.cl.duoc.nmamaintainer.dto.factura.FacturaResponse;

public interface FacturaService {
    FacturaResponse register(FacturaRequest facturaRequest);

    FacturaResponse find(FacturaRequest facturaRequest);
    FacturaResponse findAll();
    FacturaResponse update(FacturaRequest facturaRequest);
    FacturaResponse delete(FacturaRequest facturaRequest);
}
