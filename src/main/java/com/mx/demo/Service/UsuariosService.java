/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mx.demo.Service;


import com.mx.demo.Dominio.Usuarios;
import java.util.List;

/**
 *
 * @author david
 */

public interface UsuariosService {
    public List<Usuarios> listarUsuarios();
    public void guardar(Usuarios usuario);
    public void eliminar(Usuarios usuario);
    public Usuarios encontrarUsuarios(Usuarios usuario);
}
