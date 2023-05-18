package com.cl.duoc.nmamaintainer.service.episodio;

import com.cl.duoc.nmamaintainer.dto.episodio.EpisodioRequest;
import com.cl.duoc.nmamaintainer.dto.episodio.EpisodioResponse;

public interface EpisodioService {
    EpisodioResponse register(EpisodioRequest episodioRequest);
    EpisodioResponse find(EpisodioRequest episodioRequest);
    EpisodioResponse findAll();
    EpisodioResponse update(EpisodioRequest episodioRequest);
    EpisodioResponse delete(EpisodioRequest episodioRequest);
}
