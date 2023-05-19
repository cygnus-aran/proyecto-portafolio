package com.cl.duoc.nmamaintainer.service.servicio;

import com.cl.duoc.nmamaintainer.dto.servicio.ServicioRequest;
import com.cl.duoc.nmamaintainer.dto.servicio.ServicioResponse;

public interface ServicioService {
    ServicioResponse register(ServicioRequest servicioRequest);
    ServicioResponse find(ServicioRequest servicioRequest);
    ServicioResponse findAll();
    ServicioResponse update(ServicioRequest servicioRequest);
    ServicioResponse delete(ServicioRequest servicioRequest);
}