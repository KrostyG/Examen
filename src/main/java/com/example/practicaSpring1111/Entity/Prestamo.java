package com.example.practicaSpring1111.Entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Prestamo {
    private Date fecha;
    private ItemPrestamo itemPrestamo;
    private String estado;
    private int fechadevolucion;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
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

    public Prestamo(Date fecha, ItemPrestamo itemPrestamo, String estado, int fechadevolucion) {
        this.fecha = fecha;
        this.itemPrestamo = itemPrestamo;
        this.estado = estado;
        this.fechadevolucion=fechadevolucion;
    }

    public Prestamo(String prestamo_no_encontrado) {
    }
    public Prestamo() {
    }

    public int getFechadevolucion() {
        return fechadevolucion;
    }

    public void setFechadevolucion(int fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }
}
