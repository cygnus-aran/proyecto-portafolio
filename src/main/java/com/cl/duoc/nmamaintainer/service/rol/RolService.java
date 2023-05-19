package com.cl.duoc.nmamaintainer.service.rol;

import com.cl.duoc.nmamaintainer.dto.rol.RolRequest;
import com.cl.duoc.nmamaintainer.dto.rol.RolResponse;

public interface RolService {
    RolResponse register(RolRequest rolRequest);
    RolResponse find(RolRequest rolRequest);
    RolResponse findAll();
    RolResponse update(RolRequest rolRequest);
    RolResponse delete(RolRequest rolRequest);
}
