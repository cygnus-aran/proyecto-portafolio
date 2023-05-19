package com.cl.duoc.nmamaintainer.dto.rol;

import com.cl.duoc.nmamaintainer.entity.RolEntity;

import java.util.List;

public class RolRequest {

    private List<RolEntity> roles;

    public RolRequest() {
    }

    public RolRequest(List<RolEntity> roles) {
        this.roles = roles;
    }

    public List<RolEntity> getRoles() {
        return roles;
    }

    public void setRoles(List<RolEntity> roles) {
        this.roles = roles;
    }
}

