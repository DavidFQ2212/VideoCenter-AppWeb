/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mx.demo.Service;

import com.mx.demo.Dao.TrabajadoresDao;
import com.mx.demo.Dominio.Trabajadores;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author david
 */
public class TrabajadoresImp implements TrabajadoresServiece {
  @Autowired
  private TrabajadoresDao trabajadoresDao;

  @Override
  @Transactional
  public List<Trabajadores> listarPersonal() {
    return (List<Trabajadores>) trabajadoresDao.findAll();
  }

  @Override
  @Transactional
  public void guardar(Trabajadores trabajador) {
    trabajadoresDao.save(trabajador);
  }

  @Override
  public void eliminar(Trabajadores trabajador) {
    trabajadoresDao.delete(trabajador);
  }

  @Override
  @Transactional(readOnly = true)
  public Trabajadores encontrarPersonal(Trabajadores trabajador) {
    return trabajadoresDao.findById(trabajador.getIdpersonal()).orElse(null);
  }

}
