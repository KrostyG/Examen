package com.example.practicaSpring1111.service;

import com.example.practicaSpring1111.Entity.Cd;
import com.example.practicaSpring1111.Entity.Cliente;
import com.example.practicaSpring1111.Entity.ItemPrestamo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ItemService {

    private List<ItemPrestamo>listItems= new ArrayList<>();

    public void agregarItem (ItemPrestamo itemPrestamo){listItems.add(itemPrestamo);}

    public List<ItemPrestamo> getListItems(){return listItems;};



}
