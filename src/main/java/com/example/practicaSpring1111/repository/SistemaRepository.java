package com.example.practicaSpring1111.repository;

import com.example.practicaSpring1111.Entity.Cliente;
import com.example.practicaSpring1111.Entity.ItemPrestamo;
import com.example.practicaSpring1111.Entity.Prestamo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter @Setter
public class SistemaRepository {
    private List<Prestamo> listPrestamos = new ArrayList<>();
    private List<Cliente> listClientes= new ArrayList<>();
    private List<ItemPrestamo>itemPrestamos = new ArrayList<>();
}
