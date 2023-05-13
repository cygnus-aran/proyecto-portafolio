package com.cl.duoc.nmamaintainer.repository;

import com.cl.duoc.nmamaintainer.entity.VisitaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VisitaRepository extends JpaRepository<VisitaEntity, Integer> {

    VisitaEntity save(VisitaEntity visita);
    VisitaEntity findById(int id);
    List<VisitaEntity> findAll();
    VisitaEntity saveAndFlush(VisitaEntity visita);
    void deleteById(int id);

}
