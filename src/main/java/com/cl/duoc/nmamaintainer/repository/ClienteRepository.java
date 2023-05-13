package com.cl.duoc.nmamaintainer.repository;

import com.cl.duoc.nmamaintainer.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {

    ClienteEntity save(ClienteEntity cliente);
    ClienteEntity findById(int id);
    List<ClienteEntity> findAll();
    ClienteEntity saveAndFlush(ClienteEntity cliente);
    void deleteById(int id);
}
