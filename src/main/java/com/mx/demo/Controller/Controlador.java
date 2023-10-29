package com.mx.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class Controlador {
    @GetMapping("/")
    public String Home() {
        return "index";
    }

    @GetMapping("/main")
    public String PageMain() {
        return "main";
    }

    @GetMapping("/acercaDe")
    public String PageAcercaDe() {
        return "acercaDe";
    }

    @GetMapping("/Peliculas")
    public String PagePeliculas() {
        return "Peliculas";
    }

    @GetMapping("/series")
    public String PageSeries() {
        return "series";
    }

    @GetMapping("/verVideo")
    public String PageReservar() {
        return "verVideo";
    }

}
