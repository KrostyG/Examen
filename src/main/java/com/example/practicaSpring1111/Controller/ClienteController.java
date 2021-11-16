package com.example.practicaSpring1111.Controller;

import com.example.practicaSpring1111.Entity.Cliente;
import com.example.practicaSpring1111.repository.ClienteRepository;
import com.example.practicaSpring1111.service.ClienteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ArrayList<Cliente> getClientes(){
        return clienteRepository.getListaClientes();
    }

    @GetMapping("buscarCliente/{dni}")
    public ResponseEntity<Cliente> getClientes(@PathVariable String dni) throws nonexistentClientException {
        Optional<Cliente> optionalCliente= clienteRepository.buscarCliente(dni);
        if(optionalCliente.isEmpty()){
            throw new nonexistentClientException();
        }
        return ResponseEntity.ok(optionalCliente.get());
    }

    @PostMapping("/agregarCliente")
    public void agregarCliente (@RequestBody Cliente cliente){
        clienteRepository.buscarCliente(cliente.getDni());
        clienteRepository.getListaClientes().add(cliente);

    }

    @DeleteMapping("borrarCliente/{dni}")
    public ResponseEntity <Cliente> borrarClienteException(@PathVariable String dni) throws nonexistentClientException {
        Optional<Cliente> optionalCliente = clienteRepository.buscarCliente(dni);
        if(optionalCliente.isEmpty()){
            throw new nonexistentClientException();
        }
        eliminarCliente(dni);
        return ResponseEntity.ok(optionalCliente.get());
    }

    public void eliminarCliente (String dni) {
        Optional<Cliente> optionalCliente = clienteRepository.buscarCliente(dni);
        optionalCliente.ifPresent(value -> clienteRepository.getListaClientes().remove(value));
    }
     @PutMapping("/actualizarCliente")
        public void modificaCliente (@RequestBody Cliente cliente){
         eliminarCliente(cliente.getDni());
         clienteRepository.getListaClientes().add(cliente);
        }
    }

