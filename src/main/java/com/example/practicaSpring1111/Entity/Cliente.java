package com.example.practicaSpring1111.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cliente {
    private String nombre;
    private String dni;
    private String domicilio;

    public Cliente(String nombre, String dni, String domicilio) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
    }

    public Cliente(String cliente_no_encontrado) {
    }
    public Cliente() {
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
