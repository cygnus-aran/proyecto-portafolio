package com.cl.duoc.nmamaintainer.controller;

import com.cl.duoc.nmamaintainer.dto.Response;
import com.cl.duoc.nmamaintainer.dto.employee.EmployeeRegisterRequest;
import com.cl.duoc.nmamaintainer.dto.employee.EmployeeRegisterResponse;
import com.cl.duoc.nmamaintainer.service.employee.EmployeeRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRegisterService employeeRegisterService;

    @GetMapping("/find-all")
    public ResponseEntity<Response<EmployeeRegisterResponse>> postFindAllEmployees() {

        EmployeeRegisterResponse employeeRegisterResponse = new EmployeeRegisterResponse();

        employeeRegisterResponse = employeeRegisterService.findAll();

        Response<EmployeeRegisterResponse> response = new Response<>(HttpStatus.CREATED.value(),
                "Registros Encontrados", employeeRegisterResponse);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
    @PostMapping("/register-employee")
    public ResponseEntity<Response<EmployeeRegisterResponse>> postRegisterEmployee
            (@RequestBody EmployeeRegisterRequest employeeRegisterRequest) {

        EmployeeRegisterResponse employeeRegisterResponse = new EmployeeRegisterResponse();

        employeeRegisterResponse = employeeRegisterService.register(employeeRegisterRequest);

        Response<EmployeeRegisterResponse> response = new Response<>(HttpStatus.CREATED.value(),
                "Registro Creado", employeeRegisterResponse);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
    @PostMapping("/find-employee")
    public ResponseEntity<Response<EmployeeRegisterResponse>> postFindEmployee
            (@RequestBody EmployeeRegisterRequest employeeRegisterRequest) {

        EmployeeRegisterResponse employeeRegisterResponse = new EmployeeRegisterResponse();

        employeeRegisterResponse = employeeRegisterService.find(employeeRegisterRequest);

        Response<EmployeeRegisterResponse> response = new Response<>(HttpStatus.FOUND.value(),
                "Registro Encontrado", employeeRegisterResponse);

        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }
    @PostMapping("/update-employee")
    public ResponseEntity<Response<EmployeeRegisterResponse>> postUpdateEmployee
            (@RequestBody EmployeeRegisterRequest employeeRegisterRequest) {

        EmployeeRegisterResponse employeeRegisterResponse = new EmployeeRegisterResponse();

        employeeRegisterResponse = employeeRegisterService.update(employeeRegisterRequest);

        Response<EmployeeRegisterResponse> response = new Response<>(HttpStatus.CREATED.value(),
                "Registro Modificado", employeeRegisterResponse);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
    @PostMapping("/delete-employee")
    public ResponseEntity<Response<EmployeeRegisterResponse>> postDeleteEmployee
            (@RequestBody EmployeeRegisterRequest employeeRegisterRequest) {

        EmployeeRegisterResponse employeeRegisterResponse = new EmployeeRegisterResponse();

        employeeRegisterResponse = employeeRegisterService.delete(employeeRegisterRequest);

        Response<EmployeeRegisterResponse> response = new Response<>(HttpStatus.CREATED.value(),
                "Registro Eliminado", employeeRegisterResponse);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
