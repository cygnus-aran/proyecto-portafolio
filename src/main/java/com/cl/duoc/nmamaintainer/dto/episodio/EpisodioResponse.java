package com.cl.duoc.nmamaintainer.dto.episodio;

import com.cl.duoc.nmamaintainer.entity.EpisodioEntity;

import java.util.List;

public class EpisodioResponse {

    private String operation;

    private String status;

    private List<EpisodioEntity> episodes;

    public EpisodioResponse() {
    }

    public EpisodioResponse(String operation, String status, List<EpisodioEntity> episodes) {
        this.operation = operation;
        this.status = status;
        this.episodes = episodes;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<EpisodioEntity> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<EpisodioEntity> episodes) {
        this.episodes = episodes;
    }
}
