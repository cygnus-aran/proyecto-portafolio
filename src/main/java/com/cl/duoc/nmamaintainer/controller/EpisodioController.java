package com.cl.duoc.nmamaintainer.controller;

import com.cl.duoc.nmamaintainer.dto.Response;
import com.cl.duoc.nmamaintainer.dto.episodio.EpisodioRequest;
import com.cl.duoc.nmamaintainer.dto.episodio.EpisodioResponse;
import com.cl.duoc.nmamaintainer.service.episodio.EpisodioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="v1/episodio")
public class EpisodioController {

    @Autowired
    private EpisodioService episodioService;


    @GetMapping("/find-all")
    public ResponseEntity<Response<EpisodioResponse>> getFindAllVisits() {
        EpisodioResponse episodioResponse = new EpisodioResponse();
        episodioResponse = episodioService.findAll();
        Response<EpisodioResponse> response = new Response<>(HttpStatus.CREATED.value(),
                "Registros Encontrados", episodioResponse);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/register-visita")
    public ResponseEntity<Response<EpisodioResponse>> postRegisterVisit
            (@RequestBody EpisodioRequest episodioRequest) {
        EpisodioResponse episodioResponse = new EpisodioResponse();
        episodioResponse = episodioService.register(episodioRequest);
        Response<EpisodioResponse> response = new Response<>(HttpStatus.CREATED.value(),
                "Registro Creado", episodioResponse);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/find-visita")
    public ResponseEntity<Response<EpisodioResponse>> postFindVisita
            (@RequestBody EpisodioRequest episodioRequest) {
        EpisodioResponse episodioResponse = new EpisodioResponse();
        episodioResponse = episodioService.find(episodioRequest);
        Response<EpisodioResponse> response = new Response<>(HttpStatus.FOUND.value(),
                "Registro Encontrado", episodioResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    @PostMapping("/update-client")
    public ResponseEntity<Response<EpisodioResponse>> postUpdateVisita
            (@RequestBody EpisodioRequest episodioRequest) {
        EpisodioResponse episodioResponse = new EpisodioResponse();
        episodioResponse = episodioService.update(episodioRequest);
        Response<EpisodioResponse> response = new Response<>(HttpStatus.FOUND.value(),
                "Registro Encontrado", episodioResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    @PostMapping("/delete-client")
    public ResponseEntity<Response<EpisodioResponse>> postDeleteVisita
            (@RequestBody EpisodioRequest episodioRequest) {
        EpisodioResponse episodioResponse = new EpisodioResponse();
        episodioResponse = episodioService.delete(episodioRequest);
        Response<EpisodioResponse> response = new Response<>(HttpStatus.FOUND.value(),
                "Registro Eliminado", episodioResponse);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

}
