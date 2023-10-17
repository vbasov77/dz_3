package com.example.demo.services;


import com.example.demo.models.Obj;
import com.example.demo.repositories.ObjRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjService {

    @Autowired
    private ObjRepository objRepository;

    public List<Obj> findAll() {
        return objRepository.findAll();
    }

    public void deleteObjById(Long id) {
        objRepository.deleteById(id);
    }

    public void save(String nameObj) {
        Obj obj = new Obj();
        obj.setNameObj(nameObj);
        obj.setUserId(1L);
        objRepository.save(obj);
    }

    public Obj findObjById(Long id) {
        return objRepository.findObjById(id);
    }

    public void update(String nameObj, Long id){
        objRepository.update(nameObj, id);
    }
}
