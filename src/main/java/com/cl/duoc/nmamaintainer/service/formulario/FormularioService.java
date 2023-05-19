package com.cl.duoc.nmamaintainer.service.formulario;

import com.cl.duoc.nmamaintainer.dto.formulario.FormularioRequest;
import com.cl.duoc.nmamaintainer.dto.formulario.FormularioResponse;

public interface FormularioService {
    FormularioResponse register(FormularioRequest formularioRequest);
    FormularioResponse find(FormularioRequest formularioRequest);
    FormularioResponse findAll();
    FormularioResponse update(FormularioRequest formularioRequest);
    FormularioResponse delete(FormularioRequest formularioRequest);
}
