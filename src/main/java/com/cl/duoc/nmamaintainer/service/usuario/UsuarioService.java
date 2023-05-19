package com.cl.duoc.nmamaintainer.service.usuario;

import com.cl.duoc.nmamaintainer.dto.usuario.UsuarioRequest;
import com.cl.duoc.nmamaintainer.dto.usuario.UsuarioResponse;

public interface UsuarioService {
    UsuarioResponse register(UsuarioRequest usuarioRequest);
    UsuarioResponse find(UsuarioRequest usuarioRequest);
    UsuarioResponse findAll();
    UsuarioResponse update(UsuarioRequest usuarioRequest);
    UsuarioResponse delete(UsuarioRequest usuarioRequest);
}
