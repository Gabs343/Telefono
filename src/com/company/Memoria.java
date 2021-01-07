package com.company;
import java.util.ArrayList;

public class Memoria implements Item{
    private int almacenamiento;
    ArrayList<App> apps = new ArrayList<App>();

    public Memoria(int almacenamiento){
        this.almacenamiento = almacenamiento;
    }

    public void Almacenar(App app){
        apps.add(app);
        almacenamiento -= app.getPeso();
    }

    public void Borrar(App app){
        apps.remove(app);
        almacenamiento += app.getPeso();
    }
}
