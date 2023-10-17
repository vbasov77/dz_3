package com.example.demo.repositories;


import com.example.demo.models.Obj;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ObjRepository extends JpaRepository<Obj, Long> {

    List<Obj> findAll();

    Obj findObjById(Long id);

    @Transactional
    @Modifying
    @Query(value = "UPDATE objs SET name_obj = :nameObj WHERE id = :id",
            nativeQuery = true)
    void update(String nameObj, Long id);

}
