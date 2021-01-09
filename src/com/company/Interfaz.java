package com.company;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Interfaz {
    Frame frame = new Frame();
    public Interfaz(int frameW, int frameH){

        frame.setSize(frameW, frameH);

    }

    public void mostrar(boolean visible){
       frame.setVisible(visible);
    }

    public void mostrarApps(){}

    public void appInfo(App app){}
}
