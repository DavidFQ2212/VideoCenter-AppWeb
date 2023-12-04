/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mx.demo.Service;


import com.mx.demo.Dominio.Roles;
import java.util.List;

/**
 *
 * @author david
 */
public interface RolesService {
    public List<Roles> listarRoles();
    public void guardar(Roles rol);
    public void eliminar(Roles rol);
    public Roles encontrarRoles(Roles reserva);
    
}
