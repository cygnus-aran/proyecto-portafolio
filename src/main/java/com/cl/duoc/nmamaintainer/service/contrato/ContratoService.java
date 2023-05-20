package com.cl.duoc.nmamaintainer.service.contrato;

import com.cl.duoc.nmamaintainer.dto.contrato.ContratoRequest;
import com.cl.duoc.nmamaintainer.dto.contrato.ContratoResponse;

public interface ContratoService {
    ContratoResponse register(ContratoRequest contratoRequest);
    ContratoResponse find(ContratoRequest contratoRequest);
    ContratoResponse findAll();
    ContratoResponse update(ContratoRequest contratoRequest);
    ContratoResponse delete(ContratoRequest contratoRequest);
}
