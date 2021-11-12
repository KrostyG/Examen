package com.example.practicaSpring1111.Entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class Prestamo {
    private Date fecha;
    private ItemPrestamo itemPrestamo;
    private String estado;
    private int fechadevolucion=fecha.getDay()+7;

    public Prestamo(Date fecha, ItemPrestamo itemPrestamo, String estado, int fechadevolucion) {
        this.fecha = fecha;
        this.itemPrestamo = itemPrestamo;
        this.estado = estado;
        this.fechadevolucion=fechadevolucion;
    }

    public Prestamo(String prestamo_no_encontrado) {
    }

}
