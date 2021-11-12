package com.example.practicaSpring1111.repository;

import com.example.practicaSpring1111.Entity.Cliente;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;

@Component
@Getter @Setter
public class ClienteRepository {

    private ArrayList<Cliente> listaClientes= new ArrayList<>();

    public Optional<Cliente> buscarCliente(String nombre){
        return listaClientes.stream().filter(d -> d.getNombre().equals(nombre)).findFirst();
    }

}