package com.company;

public abstract class App {

    private int peso;
    private String nombre;

    public App(int peso, String nombre) {
        this.peso = peso;
        this.nombre = nombre;

    }

    public int getPeso(){
        return peso;
    }

    public abstract void Ejecutar();

    public abstract void Cerrar();
}
