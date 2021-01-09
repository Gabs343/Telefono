package com.company;

import java.util.ArrayList;

public class Tienda extends App{

    ArrayList<App> apps = new ArrayList<App>();

    public Tienda(int peso, String nombre) {
        super(peso, nombre);
    }

    @Override
    public void Ejecutar() {

    }

    @Override
    public void Cerrar() {

    }

    private void DescargarApp(Memoria memoria, App app){
        memoria.Almacenar(app);
    }


}
