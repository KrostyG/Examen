package com.example.practicaSpring1111.repository;

import com.example.practicaSpring1111.Entity.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component
@Getter @Setter
public class ItemRepository {

    @Autowired
    private SistemaRepository sistemaRepository;
    @Autowired
    ClienteRepository clienteRepository;

    private ArrayList<ItemPrestamo> listaItemPrestamos = new ArrayList<>();

    public void crearLibro(Integer codigo,String nombre){
        Libro libro = new Libro(codigo,nombre);
        sistemaRepository.getItemPrestamos().add(libro);
    }

    public void crearCD(Integer codigo,String nombre){
        Cd cd = new Cd(codigo,nombre);
        sistemaRepository.getItemPrestamos().add(cd);
    }

    public Optional<ItemPrestamo> buscarItem(Integer codigo){
        return sistemaRepository.getItemPrestamos().stream().filter(i -> i.getCodigo().equals(codigo)).findFirst();
    }
    public int diasDevolucion(Cliente cliente){
        List<Prestamo> prestamoList = clienteRepository.getListaPrestamos(cliente.getDni());
        int cantidadPrestamos=0;
        for (Prestamo p:prestamoList) {
            if (p.getEstado().equalsIgnoreCase("pendiente")){
                if(!elItemEsLibro(p.getItemPrestamo().getClass()+"")){
                    cantidadPrestamos+=1;
                }
            }
        }
        if(cantidadPrestamos==0 || cantidadPrestamos==1){
            return 4;
        }else if(cantidadPrestamos ==2){
            return 2;
        }else {
            return 0;
        }
    }
    public boolean elItemEsLibro(String c){
        int v=c.indexOf("Libro");
        return v==-1? false:true;
    }



}
