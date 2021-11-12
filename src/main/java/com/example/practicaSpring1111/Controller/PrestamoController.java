package com.example.practicaSpring1111.Controller;

import com.example.practicaSpring1111.Entity.Cliente;
import com.example.practicaSpring1111.Entity.Prestamo;
import com.example.practicaSpring1111.service.PrestamoService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PrestamoController {
    @Autowired
    private PrestamoService service;

    @PostMapping("/postPrestamo")
    public void generarPrestamo(@RequestBody Prestamo prestamo){service.agregarPrestamo(prestamo);}

    @GetMapping("/porestado/{e}")
    public Prestamo getClienteByEstado(@PathVariable("e")String estado){
        return service.getPrestamo(estado);
    }
}
