package com.example.demo.controllers;


import com.example.demo.models.Obj;
import com.example.demo.services.ObjService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@AllArgsConstructor
@NoArgsConstructor
public class ObjController {

    @Autowired
    private ObjService objectService;


    @PostMapping("/delete_obj")
    @ResponseBody
    public Object deleteObj(@RequestParam Long id) {
        objectService.deleteObjById(id);
        Map<String, Object> object = new HashMap<>();
        object.put("answer", "ok");
        return object;
    }

    @PostMapping("/add_obj")
    public Object addObj(@RequestParam String nameObj) {
        objectService.save(nameObj);
        return "redirect:/";
    }

    @GetMapping("/edit_obj/id{id}")
    public Object editObj(@PathVariable Long id, Model model) {
        Obj obj = objectService.findObjById(id);
        model.addAttribute("obj", obj);
        return "obj/edit_obj";
    }

    @PostMapping("edit_obj")
    public Object edit(@RequestParam Long id, @RequestParam String nameObj) {
        System.out.println(id);
        objectService.update(nameObj, id);
        return "redirect:/";
    }

}
