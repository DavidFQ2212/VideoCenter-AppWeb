/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mx.demo.Service;

import com.mx.demo.Dao.UsuariosDao;
import com.mx.demo.Dominio.Usuarios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author david
 */
public class UsuariosImp implements UsuariosService{
    @Autowired
    private UsuariosDao usuariosDao;
    @Override
    @Transactional
    public List<Usuarios> listarUsuarios() {
       return (List<Usuarios>)usuariosDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Usuarios usuario) {
    usuariosDao.save(usuario);
    }

    @Override
    public void eliminar(Usuarios usuario) {
        }

    @Override
    public Usuarios encontrarUsuarios(Usuarios usuario) {
         return usuariosDao.findById(usuario.getIdusuario()).orElse(null);
    }
    
}
