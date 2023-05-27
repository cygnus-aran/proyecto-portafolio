package com.cl.duoc.nmamaintainer.service.asesoria;

import com.cl.duoc.nmamaintainer.dto.asesoria.AsesoriaRegisterRequest;
import com.cl.duoc.nmamaintainer.dto.asesoria.AsesoriaRegisterResponse;

public interface AsesoriaService {
    AsesoriaRegisterResponse register(AsesoriaRegisterRequest asesoriaRegisterRequest);
    AsesoriaRegisterResponse find(AsesoriaRegisterRequest asesoriaRegisterRequest);
    AsesoriaRegisterResponse findAll();
    AsesoriaRegisterResponse update(AsesoriaRegisterRequest asesoriaRegisterRequest);
    AsesoriaRegisterResponse delete(AsesoriaRegisterRequest asesoriaRegisterRequest);
}

