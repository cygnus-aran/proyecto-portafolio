package com.cl.duoc.nmamaintainer.repository;

import java.util.List;

import com.cl.duoc.nmamaintainer.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {

    UsuarioEntity save(UsuarioEntity usuario);
    UsuarioEntity findByNombreUsuarioAndContraseñaUsuario(String nombre, String pass);
    List<UsuarioEntity> findAll();
    UsuarioEntity saveAndFlush(UsuarioEntity usuario);
    void deleteByIdUsuario(int idUsuario);
}
