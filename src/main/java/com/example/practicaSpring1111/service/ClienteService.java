package com.example.practicaSpring1111.service;

import com.example.practicaSpring1111.Entity.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private List<Cliente> clienteList = new ArrayList<>();

    public void agregarCliente(Cliente cliente){clienteList.add(cliente);}

    public Cliente getCliente(String nombreCliente){
        for (Cliente c:clienteList) {
            if(nombreCliente.equalsIgnoreCase((c.getNombre()))){
                return c;
            }
        }
        return new Cliente("Cliente no encontrado");
    }
    public List<Cliente> getClienteList(){return clienteList;};
}
