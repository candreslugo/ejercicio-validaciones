package com.example.demo.controler;


import com.example.springcrud_bd.interfaceService.IpersonaService;
import com.example.springcrud_bd.modelo.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Slf4j
@RequestMapping
public class Controler {
    @Autowired
    private IpersonaService ipersonaService;

    @GetMapping("/listar")
    public String listar(Model model) {

        List<Persona>personas=ipersonaService.listar();

        log.info("ejecutando el contrlador rest");
        model.addAttribute("personas",personas);
        return "index";
    }
}