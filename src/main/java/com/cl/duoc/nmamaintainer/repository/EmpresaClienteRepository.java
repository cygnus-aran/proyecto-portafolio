package com.cl.duoc.nmamaintainer.repository;

import com.cl.duoc.nmamaintainer.entity.EmpresaClienteEntity;
import com.cl.duoc.nmamaintainer.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmpresaClienteRepository extends JpaRepository<EmpresaClienteEntity, String> {

    EmpresaClienteEntity save(EmpresaClienteEntity empresa);
    EmpresaClienteEntity findByIdEmpresa(int idEmpresa);
    List<EmpresaClienteEntity> findAll();
    EmpresaClienteEntity saveAndFlush(EmpresaClienteEntity empresa);
    void deleteByIdEmpresa(int idEmpresa);
}
