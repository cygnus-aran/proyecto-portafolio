package com.cl.duoc.nmamaintainer.dto.checklist;

import com.cl.duoc.nmamaintainer.entity.ChecklistEntity;

import java.util.List;

public class ChecklistRegisterRequest {
    private List<ChecklistEntity> checklists;

    public ChecklistRegisterRequest() {
    }

    public ChecklistRegisterRequest(List<ChecklistEntity> checklists) {
        this.checklists = checklists;
    }

    public List<ChecklistEntity> getChecklists() {
        return checklists;
    }

    public void setChecklists(List<ChecklistEntity> checklists) {
        this.checklists = checklists;
    }
}
