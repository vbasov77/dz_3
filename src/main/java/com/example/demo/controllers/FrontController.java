package com.example.demo.controllers;


import com.example.demo.models.Obj;
import com.example.demo.services.ObjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FrontController {

    @Autowired
    private ObjService objectService;

    @GetMapping("/")
    public String front(Model model) {
        List<Obj> objs = objectService.findAll();
        model.addAttribute("objs", objs);
        return "front";
    }
}
