package com.company;

public class Telefono {

    private int bateria;
    private boolean encendido;
    private boolean conexionUsb;
    //Interfaz interfaz;
    private Memoria[] memorias = new Memoria[2];

    public Telefono(int bateria, Memoria memoria){
            this.bateria = bateria;
            memorias[0] = memoria;
    }

    public void Encender(){
        encendido = true;
    }

    public void Apagar(){
        encendido = false;
    }

    public void AñadirMemoriaExterna(Memoria memoria){
        memorias[1] = memoria;
    }

    public void ExtraerMemoriaExterna(Inventario inventario){
       inventario.Añadir(getMemoriaExterna());
    }

    public void Conectar(){
        for(int i = 0; bateria < 100; i++){
            bateria += 5;
            System.out.print(bateria + "-");
        }
    }

    public void ConectarADispositivo(){}

    public void Desconectar(){}

    private void Cargar(){}

    private void Descargar(){}

    public int getBateria() {
        return bateria;
    }

    private Memoria getMemoriaExterna(){
        return memorias[1];
    }

    public boolean isConexionUsb() {
        return conexionUsb;
    }

    public boolean isEncendido() {
        return encendido;
    }
}
