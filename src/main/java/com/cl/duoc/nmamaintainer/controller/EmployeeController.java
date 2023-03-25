package com.cl.duoc.nmamaintainer.controller;

import com.cl.duoc.nmamaintainer.dto.Response;
import com.cl.duoc.nmamaintainer.dto.employee.EmployeeRegisterRequest;
import com.cl.duoc.nmamaintainer.dto.employee.EmployeeRegisterResponse;
import com.cl.duoc.nmamaintainer.service.employee.EmployeeRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRegisterService employeeRegisterService;

    @PostMapping("/register-employee")
    public ResponseEntity<Response<EmployeeRegisterResponse>> postRegisterEmployee
            (@RequestBody EmployeeRegisterRequest employeeRegisterRequest) {

        EmployeeRegisterResponse employeeRegisterResponse = new EmployeeRegisterResponse();

        employeeRegisterResponse = employeeRegisterService.register(employeeRegisterRequest);

        Response<EmployeeRegisterResponse> response = new Response<>();

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
