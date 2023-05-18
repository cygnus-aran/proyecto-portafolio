package com.cl.duoc.nmamaintainer.dto.episodio;

import com.cl.duoc.nmamaintainer.entity.EpisodioEntity;

import java.util.List;

public class EpisodioRequest {
    private List<EpisodioEntity> episodes;

    public EpisodioRequest() {
    }

    public EpisodioRequest(List<EpisodioEntity> episodes) {
        this.episodes = episodes;
    }

    public List<EpisodioEntity> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<EpisodioEntity> episodes) {
        this.episodes = episodes;
    }
}
