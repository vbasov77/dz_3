package com.example.demo.models;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "objs")
public class Obj {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "name_obj")
    private String nameObj;
}
