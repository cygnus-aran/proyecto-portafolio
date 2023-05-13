package com.cl.duoc.nmamaintainer.repository;
import com.cl.duoc.nmamaintainer.entity.ServicioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ServicioRepository extends JpaRepository<ServicioEntity, Integer> {

    ServicioEntity save(ServicioEntity servicio);
    ServicioEntity findById(int id);
    List<ServicioEntity> findAll();
    ServicioEntity saveAndFlush(ServicioEntity servicio);
    void deleteById(int id);
}
