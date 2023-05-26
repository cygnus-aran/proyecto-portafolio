package com.cl.duoc.nmamaintainer.repository;

import com.cl.duoc.nmamaintainer.entity.ChecklistEntity;
import com.cl.duoc.nmamaintainer.entity.ClienteEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ChecklistRepository {
    ChecklistEntity save(ChecklistEntity checklist);
    ChecklistEntity findById(int id);
    List<ChecklistEntity> findAll();
    ChecklistEntity saveAndFlush(ChecklistEntity checklist);
    @Modifying
    @Query("UPDATE ChecklistEntity c SET c.estadoChecklist = 'I' WHERE c.id = :id")
    void deleteByIdChecklist(String id);
}
