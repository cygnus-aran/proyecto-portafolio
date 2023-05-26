package com.cl.duoc.nmamaintainer.dto.checklist;

import com.cl.duoc.nmamaintainer.entity.ChecklistEntity;
import com.cl.duoc.nmamaintainer.entity.ClienteEntity;

import java.util.List;

public class ChecklistRegisterResponse {
    private String operation;
    private String status;
    private List<ChecklistEntity> checklists;

    public ChecklistRegisterResponse() {
    }

    public ChecklistRegisterResponse(String operation, String status, List<ChecklistEntity> checklists) {
        this.operation = operation;
        this.status = status;
        this.checklists = checklists;
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

    public List<ChecklistEntity> getChecklists() {
        return checklists;
    }

    public void setChecklists(List<ChecklistEntity> checklists) {
        this.checklists = checklists;
    }
}