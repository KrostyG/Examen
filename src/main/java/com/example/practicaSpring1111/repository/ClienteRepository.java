package com.example.practicaSpring1111.repository;

import com.example.practicaSpring1111.Entity.Cliente;
import com.example.practicaSpring1111.Entity.Prestamo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@Getter @Setter
public class ClienteRepository {

    private ArrayList<Cliente> listaClientes= new ArrayList<>();

    public Optional<Cliente> buscarCliente(String dni){
        return listaClientes.stream().filter(cliente -> cliente.getDni().equals(dni)).findFirst();
    }
    public List<Prestamo> getListaPrestamos(String dni){
        Optional<Cliente> cliente = buscarCliente(dni);
        if (cliente.isPresent()){
            return cliente.get().getPrestamos();
        }else{
            return null;
        }
    }
    public void actualizarClientePorId(Cliente cActualizar, Cliente cActualizado){
        cActualizar.setDni(cActualizado.getDni());
        cActualizar.setDomicilio(cActualizado.getDomicilio());
        cActualizar.setNombre(cActualizado.getNombre());

    }
    public void añadirPrestamo(Cliente cliente, Prestamo prestamos) {
        cliente.getPrestamos().add(prestamos);
    }

}