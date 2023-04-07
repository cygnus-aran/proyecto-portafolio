package com.cl.duoc.nmamaintainer.service.client;

import com.cl.duoc.nmamaintainer.dto.client.ClientRegisterRequest;
import com.cl.duoc.nmamaintainer.dto.client.ClientRegisterResponse;
import com.cl.duoc.nmamaintainer.dto.employee.EmployeeRegisterRequest;
import com.cl.duoc.nmamaintainer.dto.employee.EmployeeRegisterResponse;

public interface ClientRegisterService {
    ClientRegisterResponse register(ClientRegisterRequest clientRegisterRequest);

    ClientRegisterResponse find(ClientRegisterRequest clientRegisterRequest);
    ClientRegisterResponse findAll();
    ClientRegisterResponse update(ClientRegisterRequest clientRegisterRequest);
    ClientRegisterResponse delete(ClientRegisterRequest clientRegisterRequest);
}
