package com.cl.duoc.nmamaintainer.controller;

import com.cl.duoc.nmamaintainer.dto.Response;
import com.cl.duoc.nmamaintainer.dto.checklist.ChecklistRegisterRequest;
import com.cl.duoc.nmamaintainer.dto.checklist.ChecklistRegisterResponse;
import com.cl.duoc.nmamaintainer.service.checklist.ChecklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="v1/checklist")
public class ChecklistController {
    @Autowired
    private ChecklistService checklistService;

    @GetMapping("/find-all")
    public ResponseEntity<Response<ChecklistRegisterResponse>> getFindAllChecklists() {

        ChecklistRegisterResponse checklistRegisterResponse = new ChecklistRegisterResponse();

        checklistRegisterResponse = checklistService.findAll();

        Response<ChecklistRegisterResponse> response = new Response<>(HttpStatus.CREATED.value(),
                "Registros Encontrados", checklistRegisterResponse);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/register-checklist")
    public ResponseEntity<Response<ChecklistRegisterResponse>> postRegisterChecklist
            (@RequestBody ChecklistRegisterRequest checklistRegisterRequest) {

        ChecklistRegisterResponse checklistRegisterResponse = new ChecklistRegisterResponse();
        checklistRegisterResponse = checklistService.register(checklistRegisterRequest);
        Response<ChecklistRegisterResponse> response = new Response<>(HttpStatus.CREATED.value(),
                "Registro Creado", checklistRegisterResponse);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/find-checklist")
    public ResponseEntity<Response<ChecklistRegisterResponse>> postFindChecklist
            (@RequestBody ChecklistRegisterRequest checklistRegisterRequest) {

        ChecklistRegisterResponse checklistRegisterResponse = new ChecklistRegisterResponse();

        checklistRegisterResponse = checklistService.find(checklistRegisterRequest);

        Response<ChecklistRegisterResponse> response = new Response<>(HttpStatus.FOUND.value(),
                "Registro Encontrado", checklistRegisterResponse);

        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    @PostMapping("/update-checklist")
    public ResponseEntity<Response<ChecklistRegisterResponse>> postUpdateChecklist
            (@RequestBody ChecklistRegisterRequest checklistRegisterRequest) {

        ChecklistRegisterResponse checklistRegisterResponse = new ChecklistRegisterResponse();

        checklistRegisterResponse = checklistService.update(checklistRegisterRequest);

        Response<ChecklistRegisterResponse> response = new Response<>(HttpStatus.FOUND.value(),
                "Registro Encontrado", checklistRegisterResponse);

        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    @PostMapping("/delete-checklist")
    public ResponseEntity<Response<ChecklistRegisterResponse>> postDeleteChecklist
            (@RequestBody ChecklistRegisterRequest checklistRegisterRequest) {

        ChecklistRegisterResponse checklistRegisterResponse = new ChecklistRegisterResponse();

        checklistRegisterResponse = checklistService.delete(checklistRegisterRequest);

        Response<ChecklistRegisterResponse> response = new Response<>(HttpStatus.OK.value(),
                "Registro Eliminado", checklistRegisterResponse);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
