package com.cl.duoc.nmamaintainer.service.visita;

import com.cl.duoc.nmamaintainer.dto.visita.VisitaRequest;
import com.cl.duoc.nmamaintainer.dto.visita.VisitaResponse;

public interface VisitaService {
    VisitaResponse register(VisitaRequest visitaRequest);
    VisitaResponse find(VisitaRequest visitaRequest);
    VisitaResponse findAll();
    VisitaResponse update(VisitaRequest visitaRequest);
    VisitaResponse delete(VisitaRequest visitaRequest);
}
