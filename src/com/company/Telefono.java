package com.company;

import java.util.ArrayList;

public class Telefono {

    private int bateria;
    private boolean encendido;
    private boolean conexionUsb;
    //Interfaz interfaz;
    private ArrayList<Memoria> memorias = new ArrayList<>();

    public Telefono(int bateria, Memoria memoria){
            this.bateria = bateria;
            memorias.add(memoria);
    }

    public void Encender(){
        encendido = true;
    }

    public void Apagar(){
        encendido = false;
    }

    public void AñadirMemoriaExterna(Memoria memoria){

        if(memorias.size() < 2){
            memorias.add(memoria);
        }else{
            System.out.println("El Telefono ya tiene una memoria");
        }

    }

    public void ExtraerMemoriaExterna(Inventario inventario){
        try{
            inventario.Añadir(getMemoriaExterna());
            memorias.remove(1);
            System.out.println("Se ha extraido la memoria del telefono");
        }catch (IndexOutOfBoundsException e){
            System.out.println("No hay memoria en el telefono");
        }

    }

    public void Conectar(){
        System.out.println("Se ha conectado el telefono");
        Cargar();
    }

    public void ConectarADispositivo(){
        conexionUsb = true;
        Conectar();

    }

    public void DesconectarDeDispositivo(){
        conexionUsb = false;
        Descanectar();
    }

    public void Descanectar(){
        System.out.println("Se ha desconectado el telefono");
    }

    private void Cargar(){
        for(int i = 0; bateria < 100; i++){
            bateria += 5;
            System.out.print(bateria + "-");
        }
    }

    private void Descargar(){
        for(int i = 0; bateria > 0; i++){
            bateria -= 2;
            System.out.print(bateria + "-");
        }
        System.out.println("El telefono se ha quedado sin bateria");
    }

    public int getBateria() {
        return bateria;
    }

    private Memoria getMemoriaExterna() throws IndexOutOfBoundsException{

        return memorias.get(1);
    }

    public boolean isConexionUsb() {
        return conexionUsb;
    }

    public boolean isEncendido() {
        return encendido;
    }
}
