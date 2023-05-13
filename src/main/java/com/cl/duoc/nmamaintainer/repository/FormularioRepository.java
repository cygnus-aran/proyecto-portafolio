package com.cl.duoc.nmamaintainer.repository;

import com.cl.duoc.nmamaintainer.entity.FormularioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormularioRepository extends JpaRepository<FormularioEntity, Integer> {

    FormularioEntity save(FormularioEntity formulario);
    FormularioEntity findById(int id);
    List<FormularioEntity> findAll();
    FormularioEntity saveAndFlush(FormularioEntity formulario);
    void deleteById(int id);
}

