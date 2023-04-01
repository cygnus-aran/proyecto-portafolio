package com.cl.duoc.nmamaintainer.service.employee;

import com.cl.duoc.nmamaintainer.dto.employee.EmployeeRegisterRequest;
import com.cl.duoc.nmamaintainer.dto.employee.EmployeeRegisterResponse;

public interface EmployeeRegisterService {
    EmployeeRegisterResponse register(EmployeeRegisterRequest employeeRegisterRequest);
    EmployeeRegisterResponse find(EmployeeRegisterRequest employeeRegisterRequest);
    EmployeeRegisterResponse findAll();
    EmployeeRegisterResponse update(EmployeeRegisterRequest employeeRegisterRequest);
    EmployeeRegisterResponse delete(EmployeeRegisterRequest employeeRegisterRequest);

}
