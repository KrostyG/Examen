package com.example.practicaSpring1111.repository;

import com.example.practicaSpring1111.Entity.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public class PrestamoRepository {
    @Autowired SistemaRepository sistemaRepository;
    @Autowired ClienteRepository clienteRepository;
    @Autowired ItemRepository itemRepository;
    @Autowired ModelMapper modelMapper;
    Date fecha = new Date();

    public boolean elItemEsLibro(String c){
        int v=c.indexOf("Libro");
        return v==-1? false:true;
    }
    public void añadirPrestamo(Prestamo prestamo) {

        sistemaRepository.getListPrestamos().add(prestamo);
    }

    public void generarPrestamo(Integer dni, Integer codigo)throws notCreateException{
        Optional<ItemPrestamo> itemPrestamoOptional=itemRepository.buscarItem(codigo);
        Optional<Cliente> optionalCliente = clienteRepository.buscarCliente(dni+"");

        if (itemPrestamoOptional.isPresent() && optionalCliente.isPresent()){
            ItemPrestamo itemPrestamo = itemPrestamoOptional.get();

            if(elItemEsLibro(itemPrestamo.getClass()+"")){
                Libro libro = new Libro(itemPrestamo.getCodigo(),itemPrestamo.getNombre());
                Prestamo newPrestamo = new Prestamo("hoy",libro,"pendiente","en 7 dias");
                clienteRepository.añadirPrestamo(optionalCliente.get(),newPrestamo);
                añadirPrestamo(newPrestamo);
            }
            else {
                Cd cd = new Cd(itemPrestamoOptional.get().getCodigo(),itemPrestamoOptional.get().getNombre());
                Prestamo newPrestamo= new Prestamo("hoy",cd,"pendiente","porprogramar");
                clienteRepository.añadirPrestamo(optionalCliente.get(),newPrestamo);
                añadirPrestamo(newPrestamo);
            }
        }
        throw new notCreateException();

    }
}
