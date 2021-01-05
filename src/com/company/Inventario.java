package com.company;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Item> inventario = new ArrayList<Item>();

    public void Añadir(Item item){
        inventario.add(item);
    }

}
