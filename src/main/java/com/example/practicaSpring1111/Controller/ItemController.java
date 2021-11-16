package com.example.practicaSpring1111.Controller;

import com.example.practicaSpring1111.Entity.Cd;
import com.example.practicaSpring1111.Entity.ItemPrestamo;
import com.example.practicaSpring1111.Entity.Libro;
import com.example.practicaSpring1111.repository.ItemRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private ModelMapper modelMapper;

    /*@GetMapping
    public ArrayList<ItemPrestamo> getItemsPrestamos(){return itemRepository.getListaItemPrestamos();}*/

    @GetMapping("/verItem/{id}")
    public ResponseEntity<ItemPrestamo> buscarItems(@PathVariable("id") Integer id) throws nonexistentItemException{
        Optional<ItemPrestamo> optionalItemPrestamo = itemRepository.buscarItem(id);
        if (optionalItemPrestamo.isEmpty()){
            throw new nonexistentItemException();
        }
        return ResponseEntity.ok(optionalItemPrestamo.get());
    }

    @PostMapping("/agregarCD")
    public void crearCD (@RequestBody Cd cd)throws ItemExistentException{
        if (itemRepository.buscarItem(cd.getCodigo()).isPresent()){
            throw new ItemExistentException();
        }
        itemRepository.crearCD(cd.getCodigo(), cd.getNombre());
    }
    @PostMapping("/agregarLibro")
    public void crearLibro (@RequestBody Libro libro)throws ItemExistentException{
        if (itemRepository.buscarItem(libro.getCodigo()).isPresent()){
            throw new ItemExistentException();
        }
        itemRepository.crearLibro(libro.getCodigo(), libro.getNombre());
    }





    }

