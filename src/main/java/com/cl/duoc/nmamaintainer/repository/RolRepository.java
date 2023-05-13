package com.cl.duoc.nmamaintainer.repository;
import java.util.List;

import com.cl.duoc.nmamaintainer.entity.RolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<RolEntity, Integer> {

    RolEntity save(RolEntity rol);
    RolEntity findById(int id);
    List<RolEntity> findAll();
    RolEntity saveAndFlush(RolEntity rol);
    void deleteById(int id);
}
