package com.cl.duoc.nmamaintainer.repository;

import com.cl.duoc.nmamaintainer.entity.ContratoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContratoRepository extends JpaRepository<ContratoEntity, Integer> {

    ContratoEntity save(ContratoEntity contrato);
    ContratoEntity findByIdContrato(Integer idContrato);
    List<ContratoEntity> findAll();
    ContratoEntity saveAndFlush(ContratoEntity contrato);
    @Modifying
    @Query("UPDATE ContratoEntity c SET c.estadoContrato = 'I' WHERE c.idContrato = :idContrato")
    void softDeleteByIdContrato(@Param("idContrato") Integer idContrato);
}
