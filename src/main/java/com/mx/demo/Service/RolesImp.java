/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mx.demo.Service;

import com.mx.demo.Dao.RolesDao;
import com.mx.demo.Dominio.Roles;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author david
 */
public class RolesImp implements RolesService{
    @Autowired
    private RolesDao rolesDao;
    @Override
    @Transactional
    public List<Roles> listarRoles() {
    return (List<Roles>)rolesDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Roles rol) {
        rolesDao.save(rol);
    }

    @Override
    public void eliminar(Roles rol) {
     rolesDao.delete(rol);
    }

    @Override
    @Transactional(readOnly = true)
    public Roles encontrarRoles(Roles reserva) {
    return rolesDao.findById(reserva.getIdrol()).orElse(null);
    }
    
}
