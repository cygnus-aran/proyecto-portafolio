package com.cl.duoc.nmamaintainer.repository;
import com.cl.duoc.nmamaintainer.entity.EpisodioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EpisodioRepository extends JpaRepository<EpisodioEntity, Integer> {
    EpisodioEntity save(EpisodioEntity episodio);
    EpisodioEntity findById(int id);
    List<EpisodioEntity> findAll();
    EpisodioEntity saveAndFlush(EpisodioEntity episodio);
    void deleteById(int id);
}

