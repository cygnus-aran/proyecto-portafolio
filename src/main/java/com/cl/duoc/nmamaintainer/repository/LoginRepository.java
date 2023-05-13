package com.cl.duoc.nmamaintainer.repository;

import com.cl.duoc.nmamaintainer.entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginRepository extends JpaRepository<LoginEntity, Integer> {

    LoginEntity findById(int id);
    List<LoginEntity> findAll();
    LoginEntity saveAndFlush(LoginEntity login);
    void deleteById(int id);

}
