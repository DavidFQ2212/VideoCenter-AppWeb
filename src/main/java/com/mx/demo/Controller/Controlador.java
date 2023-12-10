package com.mx.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mx.demo.Dominio.Trabajadores;
import com.mx.demo.Dominio.Reserva;
import com.mx.demo.Service.ResevasService;
import com.mx.demo.Service.TrabajadoresServiece;

@Controller

public class Controlador {
    @Autowired
    private ResevasService reservaS;
    @Autowired
    private TrabajadoresServiece trabajadoresS;

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

    /* ReservasEndpoint */
    @GetMapping("/verVideo")
    public String PageReservar(Reserva reserva, Model model) {
        var reservas = reservaS.listarReservas();
        model.addAttribute("reservas", reservas);
        return "verVideo";
    }

    @PostMapping("/GuardarReserva")
    public String GuardarReserva(Reserva reservas) {
        reservaS.guardar(reservas);
        return "redirect:/verVideo";
    }

    public String EliminarReserva() {
        return "";
    }

    public String ModificarReserva() {
        return "";
    }

    /* Trabajadores Endpoint */
    @GetMapping("/trabajadores")
    public String PagePersonal(Trabajadores personal, Model model) {
        var empelados = trabajadoresS.listaTrabajadores();
        model.addAttribute("empleados", empelados);
        return "Trabajadres";
    }

    @PostMapping("/GardarTrabajador")
    public String GuardarTrabajador(Trabajadores trabajador) {
        trabajadoresS.guardar(trabajador);
        return "redirect:/trabajadores";

    }

    public String EliminarTrabajador() {
        return "";

    }

    public String ModificarTrabajador() {
        return "";
    }
}
