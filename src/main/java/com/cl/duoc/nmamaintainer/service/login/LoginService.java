package com.cl.duoc.nmamaintainer.service.login;

import com.cl.duoc.nmamaintainer.dto.login.LoginRequest;
import com.cl.duoc.nmamaintainer.dto.login.LoginResponse;

public interface LoginService {
    LoginResponse validate(LoginRequest loginRequest);
}
