package com.cl.duoc.nmamaintainer.repository;

import com.cl.duoc.nmamaintainer.entity.FacturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FacturaRepository extends JpaRepository<FacturaEntity, Integer> {

    FacturaEntity save(FacturaEntity factura);
    FacturaEntity findById(int id);
    List<FacturaEntity> findAll();
    FacturaEntity saveAndFlush(FacturaEntity factura);
    void deleteById(int id);
}