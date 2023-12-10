/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mx.demo.Service;

import com.mx.demo.Dao.ReservasDao;
import com.mx.demo.Dominio.Reserva;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author david
 */
@Service
public class ReservaImp implements ResevasService {
    @Autowired
    private ReservasDao reservaDao;

    @Override
    @Transactional()
    public List<Reserva> listarReservas() {
        return (List<Reserva>) reservaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Reserva reserva) {
        reservaDao.save(reserva);
    }

    @Override
    public void eliminar(Reserva reserva) {
        reservaDao.delete(reserva);
    }

    @Override
    @Transactional(readOnly = true)
    public Reserva encontrarReserva(Reserva reserva) {
        return reservaDao.findById(reserva.getIdreservas()).orElse(null);
    }

}
