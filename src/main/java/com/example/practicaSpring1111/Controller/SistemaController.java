package com.example.practicaSpring1111.Controller;

import com.example.practicaSpring1111.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SistemaController {
    @Autowired private SistemaRepository sistemaRepository;
    @Autowired private ClienteRepository clienteRepository;
    @Autowired private ItemController itemController;
    @Autowired private PrestamoRepository prestamoRepository;

    @PostMapping("/crearPrestamo")
    public void crearPrestamo(@RequestParam(name="dni") Integer dni, @RequestParam(name="codigo") Integer codigo) throws notCreateException {
        try{
            prestamoRepository.generarPrestamo(dni,codigo);
        }catch (notCreateException e){
            throw new notCreateException();
        }
    }

}
