package com.example.practicaSpring1111.Entity;

import lombok.Getter;
import lombok.Setter;

import java.net.Inet4Address;


public class ItemPrestamo {
    private Integer codigo;
    private String nombre;

    public ItemPrestamo(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
