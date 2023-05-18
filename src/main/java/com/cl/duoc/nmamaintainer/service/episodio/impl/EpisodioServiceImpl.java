package com.cl.duoc.nmamaintainer.service.episodio.impl;

import com.cl.duoc.nmamaintainer.dto.episodio.EpisodioRequest;
import com.cl.duoc.nmamaintainer.dto.episodio.EpisodioResponse;
import com.cl.duoc.nmamaintainer.dto.visita.VisitaResponse;
import com.cl.duoc.nmamaintainer.entity.EpisodioEntity;
import com.cl.duoc.nmamaintainer.entity.VisitaEntity;
import com.cl.duoc.nmamaintainer.repository.EpisodioRepository;
import com.cl.duoc.nmamaintainer.service.episodio.EpisodioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EpisodioServiceImpl implements EpisodioService {

    @Autowired
    EpisodioRepository episodioRepository;

    @Override
    public EpisodioResponse register(EpisodioRequest episodioRequest) {
        EpisodioResponse response = new EpisodioResponse();
        EpisodioEntity save = episodioRepository.save(episodioRequest.getEpisodes().get(0));
        response.setOperation("Guardado");
        if(save == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        List<EpisodioEntity> episodes = new ArrayList<EpisodioEntity>();
        response.setEpisodes(episodes);
        response.getEpisodes().add(save);
        return response;
    }

    @Override
    public EpisodioResponse find(EpisodioRequest episodioRequest) {
        EpisodioResponse response = new EpisodioResponse();
        Optional<EpisodioEntity> find = episodioRepository.findById(episodioRequest.getEpisodes().get(0).getIdEpisodio());
        response.setOperation("Encontrar");
        response.setStatus("Exito");
        response.getEpisodes().add(find.get());
        return response;
    }

    @Override
    public EpisodioResponse findAll() {
        EpisodioResponse response = new EpisodioResponse();
        List<EpisodioEntity> findall = episodioRepository.findAll();
        response.setOperation("Encontrar Todos");
        if(findall == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.setEpisodes(findall);
        return response;
    }

    @Override
    public EpisodioResponse update(EpisodioRequest episodioRequest) {
        EpisodioResponse response = new EpisodioResponse();
        EpisodioEntity update = episodioRepository.saveAndFlush(episodioRequest.getEpisodes().get(0));
        response.setOperation("Actualizar");
        if(update == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.getEpisodes().add(update);
        return response;
    }

    @Override
    public EpisodioResponse delete(EpisodioRequest episodioRequest) {
        EpisodioResponse response = new EpisodioResponse();
        response.setOperation("Borrar");
        try {
            episodioRepository.deleteById(episodioRequest.getEpisodes().get(0).getIdEpisodio());
        } catch (Exception e) {
            response.setStatus("Error");
            throw new RuntimeException(e);
        }
        response.setStatus("Exito");
        return response;
    }
}
