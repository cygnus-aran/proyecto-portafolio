package com.cl.duoc.nmamaintainer.repository;

import com.cl.duoc.nmamaintainer.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity, String> {

    PersonaEntity save(PersonaEntity persona);
    PersonaEntity findByIdPersona(int idPersona);
    List<PersonaEntity> findAll();
    PersonaEntity saveAndFlush(PersonaEntity persona);
    @Modifying
    @Query("UPDATE PersonaEntity p SET p.estadoPersona = 'I' WHERE p.idPersona = :idPersona")
    void deleteByIdPersona(int idPersona);
}
