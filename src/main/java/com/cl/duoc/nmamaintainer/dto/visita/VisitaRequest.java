package com.cl.duoc.nmamaintainer.dto.visita;

import com.cl.duoc.nmamaintainer.entity.VisitaEntity;

import java.util.List;

public class VisitaRequest {

    private List<VisitaEntity> visits;

    public VisitaRequest() {
    }

    public VisitaRequest(List<VisitaEntity> visits) {
        this.visits = visits;
    }

    public List<VisitaEntity> getVisits() {
        return visits;
    }

    public void setVisits(List<VisitaEntity> visits) {
        this.visits = visits;
    }
}
