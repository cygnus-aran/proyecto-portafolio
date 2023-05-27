package com.cl.duoc.nmamaintainer.repository;

import com.cl.duoc.nmamaintainer.entity.AsesoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsesoriaRepository extends JpaRepository<AsesoriaEntity, Integer> {
    AsesoriaEntity findById(int id);
    List<AsesoriaEntity> findAll();
    AsesoriaEntity saveAndFlush(AsesoriaEntity asesoria);

    void deleteByIdAsesoria(String id);
}
