package com.example.practicaSpring1111.Controller;

import com.example.practicaSpring1111.Entity.Cliente;
import com.example.practicaSpring1111.repository.ClienteRepository;
import com.example.practicaSpring1111.service.ClienteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ClienteController {
    @Autowired
    private ClienteService service;
    private ClienteRepository clienteRepository;
    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    public void agregarCliente (@RequestBody Cliente cliente){
        service.agregarCliente(cliente);
    }

    @GetMapping("/{n}")
    public Cliente getClienteBynombre(@PathVariable("n")String nombre){
        return service.getCliente(nombre);
    }

    @DeleteMapping("/{dni}")
    public void eliminarCliente (@PathVariable ("dni") String dni) {
        Optional<Cliente> optionalCliente = clienteRepository.buscarCliente(dni);
        optionalCliente.ifPresent(value -> clienteRepository.getListaClientes().remove(value));
    }
     @PutMapping
        public void modificaCliente (Cliente cliente){
         eliminarCliente(cliente.getNombre());
         clienteRepository.getListaClientes().add(cliente);
        }
    }

