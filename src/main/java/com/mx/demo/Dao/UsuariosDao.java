/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mx.demo.Dao;

import com.mx.demo.Dominio.Usuarios;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author david
 */
public interface UsuariosDao extends CrudRepository<Usuarios, Long>{
    
}
