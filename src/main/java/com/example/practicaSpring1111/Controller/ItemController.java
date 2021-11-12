package com.example.practicaSpring1111.Controller;

import com.example.practicaSpring1111.Entity.Cliente;
import com.example.practicaSpring1111.Entity.ItemPrestamo;
import com.example.practicaSpring1111.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {
    @Autowired
    private ItemService service;

    @PostMapping("/postItem")
    public void agregarItem (@RequestBody ItemPrestamo itemPrestamo){
        service.agregarItem(itemPrestamo);
    }



    }

