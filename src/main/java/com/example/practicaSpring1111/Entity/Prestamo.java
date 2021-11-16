package com.example.practicaSpring1111.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class Prestamo {
    private String fecha;
    @Autowired
    private ItemPrestamo itemPrestamo;
    private String estado;
    private String fechadevolucion;

    public Prestamo(String fecha, ItemPrestamo itemPrestamo, String estado, String fechadevolucion) {
        this.fecha = fecha;
        this.itemPrestamo = itemPrestamo;
        this.estado = estado;
        this.fechadevolucion = fechadevolucion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ItemPrestamo getItemPrestamo() {
        return itemPrestamo;
    }

    public void setItemPrestamo(ItemPrestamo itemPrestamo) {
        this.itemPrestamo = itemPrestamo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechadevolucion() {
        return fechadevolucion;
    }

    public void setFechadevolucion(String fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }



    public Prestamo(String prestamo_no_encontrado) {
    }


}
