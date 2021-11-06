/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_gabrielgiron_12051024;

/**
 *
 * @author Galex
 */
public class Zonas {
    private String Nombre;
    private int tamaño;
    private int coordenadaX;
    private int coordenadaY;

    
    public Zonas(String Nombre, int tamaño, int coordenadaX, int coordenadaY) {
        this.Nombre = Nombre;
        this.tamaño = tamaño;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    @Override
    public String toString() {
        return "Zonas{" + "Nombre=" + Nombre + ", tama\u00f1o=" + tamaño + " Metros, coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + '}';
    }
    
    
}
