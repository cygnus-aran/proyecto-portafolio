package com.cl.duoc.nmamaintainer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response<T> {
    int code;
    String message;
    T data;

}
