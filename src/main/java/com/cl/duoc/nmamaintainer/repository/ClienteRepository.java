package com.cl.duoc.nmamaintainer.repository;

import com.cl.duoc.nmamaintainer.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {

    ClienteEntity save(ClienteEntity cliente);
    ClienteEntity findById(int id);
    List<ClienteEntity> findAll();
    ClienteEntity saveAndFlush(ClienteEntity cliente);
    @Modifying
    @Query("UPDATE ClienteEntity c SET c.estadoEmpresa = 'I' WHERE c.idEmpresa = :id")
    void deleteByIdEmpresa(String id);
}
