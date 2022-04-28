/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avalon.app.principal.controller.json;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Avalon
 */
@Controller
@RequestMapping("/views/json")
public class JsonController {

    @GetMapping("/")
    public String listarJson(Model model) {
//        http://localhost:8080/views/json/
        model.addAttribute("titulo", "Estas en la vista del json");
        return "/views/json/listarjson";
    }

}
