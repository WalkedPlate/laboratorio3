package com.example.laboratorio3.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HistoryController {
    @GetMapping(value = "/historial")
    public String paginaHistorial(){
        return ;
    }
}
