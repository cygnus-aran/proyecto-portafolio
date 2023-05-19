package com.cl.duoc.nmamaintainer.service.client;

import com.cl.duoc.nmamaintainer.dto.client.ClientRegisterRequest;
import com.cl.duoc.nmamaintainer.dto.client.ClientRegisterResponse;

public interface ClientRegisterService {
    ClientRegisterResponse register(ClientRegisterRequest clientRegisterRequest);

    ClientRegisterResponse find(ClientRegisterRequest clientRegisterRequest);
    ClientRegisterResponse findAll();
    ClientRegisterResponse update(ClientRegisterRequest clientRegisterRequest);
    ClientRegisterResponse delete(ClientRegisterRequest clientRegisterRequest);
}
