package com.mx.demo.Dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "reservas")
public class Reserva implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idreserva;
    private String titulo;
    private  int idPersonal;
    private String fechaPrestamo;
    private String fechaDevolucion;
    private int precio;
}
