package com.cl.duoc.nmamaintainer.dto.asesoria;
import com.cl.duoc.nmamaintainer.entity.AsesoriaEntity;

import java.util.List;

public class AsesoriaRegisterResponse {
    private String operation;
    private String status;
    private List<AsesoriaEntity> asesorias;

    public AsesoriaRegisterResponse() {
    }

    public AsesoriaRegisterResponse(String operation, String status, List<AsesoriaEntity> asesorias) {
        this.operation = operation;
        this.status = status;
        this.asesorias = asesorias;
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

    public List<AsesoriaEntity> getAsesorias() {
        return asesorias;
    }

    public void setAsesorias(List<AsesoriaEntity> asesorias) {
        this.asesorias = asesorias;
    }
}
