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
public class Soldados {
    private String Nombre;
    private int Edad;
    private int TiempoServicio;
    private String Rango;
    private int vida;
    private int DMG;

    public Soldados(String Nombre, int Edad, int TiempoServicio, String Rango, int vida, int DMG) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.TiempoServicio = TiempoServicio;
        this.Rango = Rango;
        this.DMG = DMG;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getTiempoServicio() {
        return TiempoServicio;
    }

    public void setTiempoServicio(int TiempoServicio) {
        this.TiempoServicio = TiempoServicio;
    }

    public String getRango() {
        return Rango;
    }

    public void setRango(String Rango) {
        this.Rango = Rango;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDMG() {
        return DMG;
    }

    public void setDMG(int DMG) {
        this.DMG = DMG;
    }


    @Override
    public String toString() {
        return "Soldados{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", TiempoServicio=" + TiempoServicio + ", Rango=" + Rango + ", vida=" + vida + ", Clase=" + '}';
    }


    
    
}
