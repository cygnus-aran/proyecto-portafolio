package com.cl.duoc.nmamaintainer.service.checklist;

import com.cl.duoc.nmamaintainer.dto.checklist.ChecklistRegisterRequest;
import com.cl.duoc.nmamaintainer.dto.checklist.ChecklistRegisterResponse;

public interface ChecklistService {
    ChecklistRegisterResponse register(ChecklistRegisterRequest ChecklistRegisterRequest);
    ChecklistRegisterResponse find(ChecklistRegisterRequest ChecklistRegisterRequest);
    ChecklistRegisterResponse findAll();
    ChecklistRegisterResponse update(ChecklistRegisterRequest ChecklistRegisterRequest);
    ChecklistRegisterResponse delete(ChecklistRegisterRequest ChecklistRegisterRequest);
}
