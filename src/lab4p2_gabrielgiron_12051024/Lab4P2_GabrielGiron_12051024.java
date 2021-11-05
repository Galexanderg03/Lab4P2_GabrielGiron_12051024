/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_gabrielgiron_12051024;

import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author Galex
 */
public class Lab4P2_GabrielGiron_12051024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayList<Zonas> ListaZonas = new ArrayList();
        int opcion = -1;
        while(opcion != -0)
        {
            opcion=Integer.parseInt
            (
            JOptionPane.showInputDialog
                (
                    "0)Salir\n"+    
                    "1)Crear Zonas\n"+
                    "2)Listar Zonas\n"+
                    "3)Crear Escuadron\n"+
                    "4)Listar Escuadrones\n"+        
                    "5)Listar Escuadron\n"+
                    "6)Eliminar Escuadron\n"+
                    "7)Añadir Soldado a Escuadron\n"+
                    "8)Listar Soldados de Escuadron\n"+
                    "9)Listar Soldados de Escuadron por Tipo\n"+
                    "10)Eliminar Soldados de Escuadron\n"+
                    "11)Pelear"
                )
            );
            switch(opcion)
            {
                case 1:
                {
                    String ZonaName = JOptionPane.showInputDialog("Nombre de la Zona");
                    int ZonaTamaño = Integer.parseInt(JOptionPane.showInputDialog("Tamaño de la zona en metros"));
                    int CoordenadaX = Integer.parseInt(JOptionPane.showInputDialog("Coordenada X"));
                    int CoordenadaY = Integer.parseInt(JOptionPane.showInputDialog("Coordenada Y"));
                    ListaZonas.add(new Zonas(ZonaName, ZonaTamaño, CoordenadaX, CoordenadaY));
                    JOptionPane.showMessageDialog(null, "Zona agregada exitosamente");
                    break;
                }
                case 2:
                {
                   for(Zonas zonas: ListaZonas)
                   {
                        JOptionPane.showMessageDialog(null, zonas.toString());
                   }
                    break;
                }
                case 3:
                {
                    String EscuandronNombre = JOptionPane.showInputDialog("Nombre del Escuadron");
                    
                }
            }
        }
    }
    
}
