package com.cl.duoc.nmamaintainer.dto.employee;

import com.cl.duoc.nmamaintainer.entity.PersonaEntity;

import java.util.List;

public class EmployeeRegisterRequest {
    private List<PersonaEntity> employees;

    public EmployeeRegisterRequest() {
    }

    public EmployeeRegisterRequest(List<PersonaEntity> employees) {
        this.employees = employees;
    }

    public List<PersonaEntity> getEmployees() {
        return employees;
    }

    public void setEmployees(List<PersonaEntity> employees) {
        this.employees = employees;
    }
}
