package com.example.practicaSpring1111.service;

import com.example.practicaSpring1111.Entity.Cliente;
import com.example.practicaSpring1111.Entity.Prestamo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrestamoService {

    private List<Prestamo> prestamoList = new ArrayList<>();

    public void agregarPrestamo(Prestamo prestamo){prestamoList.add(prestamo);}

    public Prestamo getPrestamo(String estado){
        for (Prestamo c:prestamoList) {
            if(estado.equalsIgnoreCase((c.getEstado()))){
                return c;
            }
        }
        return new Prestamo("Prestamo no encontrado");
    }

    public List<Prestamo>getPrestamoList(){ return prestamoList; }

}
