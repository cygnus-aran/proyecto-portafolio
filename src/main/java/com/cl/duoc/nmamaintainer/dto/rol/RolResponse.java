package com.cl.duoc.nmamaintainer.dto.rol;

import com.cl.duoc.nmamaintainer.entity.RolEntity;

import java.util.List;

public class RolResponse {

    private String operation;
    private String status;
    private List<RolEntity> roles;

    public RolResponse() {
    }

    public RolResponse(String operation, String status, List<RolEntity> roles) {
        this.operation = operation;
        this.status = status;
        this.roles = roles;
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

    public List<RolEntity> getRoles() {
        return roles;
    }

    public void setRoles(List<RolEntity> roles) {
        this.roles = roles;
    }
}
