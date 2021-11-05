/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_gabrielgiron_12051024;
import java.util.ArrayList;
/**
 *
 * @author Galex
 */
public class Escuadron 
{
    private String Nombre;
    private ArrayList<Zonas> ZonasConquistadas = new ArrayList();
    private ArrayList<Soldados> Soldados = new ArrayList();

    public Escuadron(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Zonas> getZonasConquistadas() {
        return ZonasConquistadas;
    }

    public void setZonasConquistadas(ArrayList<Zonas> ZonasConquistadas) {
        this.ZonasConquistadas = ZonasConquistadas;
    }

    public ArrayList<Soldados> getSoldados() {
        return Soldados;
    }

    public void setSoldados(ArrayList<Soldados> Soldados) {
        this.Soldados = Soldados;
    }
    
    
}
