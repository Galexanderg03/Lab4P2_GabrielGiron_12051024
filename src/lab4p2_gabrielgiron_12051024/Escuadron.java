/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_gabrielgiron_12051024;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static lab4p2_gabrielgiron_12051024.Lab4P2_GabrielGiron_12051024.ListaEscuadrones;
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

    public void getZonasConquistadas() {
     for(Zonas zonas: ZonasConquistadas)
       {
            JOptionPane.showMessageDialog(null, zonas.toString());
       }
    }

    public void getListaSoldados() {
        for(Soldados soldados: Soldados)
        {
            JOptionPane.showMessageDialog(null, soldados.toString());
        }
    }

    public ArrayList<Soldados> getSoldados() {
        return Soldados;
    }
   }
