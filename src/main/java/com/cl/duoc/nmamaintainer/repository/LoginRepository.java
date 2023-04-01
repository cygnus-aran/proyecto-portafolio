package com.cl.duoc.nmamaintainer.repository;

import com.cl.duoc.nmamaintainer.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginRepository extends JpaRepository<PersonaEntity, String> {
    PersonaEntity findByPasswordAndRutPersona(String password, int rutPersona);
}
