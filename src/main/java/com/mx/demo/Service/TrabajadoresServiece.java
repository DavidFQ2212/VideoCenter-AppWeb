/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mx.demo.Service;


import com.mx.demo.Dominio.Trabajadores;
import java.util.List;

/**
 *
 * @author david
 */
public interface TrabajadoresServiece {
    public List<Trabajadores> listarPersonal();
    public void guardar(Trabajadores trabajador);
    public void eliminar(Trabajadores trabajador);
    public Trabajadores encontrarPersonal(Trabajadores trabajador);
}
