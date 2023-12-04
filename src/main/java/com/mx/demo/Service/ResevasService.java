/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mx.demo.Service;

import com.mx.demo.Dominio.Reserva;
import java.util.List;

/**
 *
 * @author david
 */
public interface ResevasService {
    public List<Reserva> listarReservas();
    public void guardar(Reserva reserva);
    public void eliminar(Reserva reserva);
    public Reserva encontrarReserva(Reserva reserva);
}
