package com.example.practicaSpring1111.Entity;

import java.util.Date;

public class Cd extends ItemPrestamo{
    Date fecha = new Date();
    public Cd(int codigo, String nombre) {
        super(codigo, nombre);
    }
    public void getFechaDevoculion(int dev){
        dev=fecha.getDate()+7;
    }

}
