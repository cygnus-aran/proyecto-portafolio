package com.cl.duoc.nmamaintainer.dto.visita;

import com.cl.duoc.nmamaintainer.entity.VisitaEntity;

import java.util.List;

public class VisitaResponse {

    private String operation;
    private String status;
    private List<VisitaEntity> visits;

    public VisitaResponse() {
    }

    public VisitaResponse(String operation, String status, List<VisitaEntity> visits) {
        this.operation = operation;
        this.status = status;
        this.visits = visits;
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

    public List<VisitaEntity> getVisits() {
        return visits;
    }

    public void setVisits(List<VisitaEntity> visits) {
        this.visits = visits;
    }
}
