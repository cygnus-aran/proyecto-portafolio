package com.cl.duoc.nmamaintainer.repository;

import com.cl.duoc.nmamaintainer.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity, String> {

    PersonaEntity save(PersonaEntity persona);
    PersonaEntity findByIdUsuario(String idUsuario);
    List<PersonaEntity> findAll();
    PersonaEntity saveAndFlush(PersonaEntity persona);
    void deleteByIdUsuario(String idUsuario);
}
