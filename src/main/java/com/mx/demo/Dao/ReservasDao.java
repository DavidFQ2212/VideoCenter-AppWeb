/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import com.mx.demo.Dominio.Reserva;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author david
 */
public interface ReservasDao  extends CrudRepository<Reserva ,Long>{
    
}
