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
 static ArrayList<Zonas> ListaZonas = new ArrayList();
 static ArrayList<Escuadron> ListaEscuadrones = new ArrayList();
 static ArrayList<Soldados> ListaSoldados = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
//        ArrayList<Zonas> ListaZonas = new ArrayList();
//        ArrayList<Escuadron> ListaEscuadrones = new ArrayList();
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
                    "3)Crear Soldado\n"+ 
                    "4)Crear Escuadron\n"+    
                    "5)Listar Escuadrones\n"+        
                    "6)Listar Escuadron\n"+
                    "7)Eliminar Escuadron\n"+
                    "8)Añadir Soldado a Escuadron\n"+
                    "9)Listar Soldados de Escuadron\n"+
                    "10)Listar Soldados de Escuadron por Tipo\n"+
                    "11)Eliminar Soldados de Escuadron\n"+
                    "12)Pelear"
                )
            );
            switch(opcion)
            {
                case 1:
                {
                    CrearZona();
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
                    CrearSoldado();
                    break;
                }
                case 4:
                {
                    String EscuadronNombre = JOptionPane.showInputDialog("Nombre del Escuadron");
                    ListaEscuadrones.add(new Escuadron(EscuadronNombre));
                    JOptionPane.showMessageDialog(null, "Escuadron Creado exitosamente");
                    break;
                }
                case 5:
                {
                    for(Escuadron escuadrones: ListaEscuadrones)
                   {
                        JOptionPane.showMessageDialog(null, escuadrones.toString());
                        break;
                   }
                }
                case 6:
                {
                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Indique la posicion del Escuadron en la lista"));;
                    JOptionPane.showMessageDialog(null,ListaEscuadrones.get(pos));
                    ListaEscuadrones.get(pos).getSoldados();
                    break;
                }
                case 7:
                {
                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Indique la posicion del Escuadron en la lista"));;
                    ListaEscuadrones.remove(pos);
                    JOptionPane.showMessageDialog(null,"Escuadron Eliminado Exitosamente");
                    break;
                }
                case 8:
                {
                    int pos1 = Integer.parseInt(JOptionPane.showInputDialog("Indique la posicion del Escuadron en la lista"));
                    int pos2 = Integer.parseInt(JOptionPane.showInputDialog("Indique la posicion del Soldado en la lista"));
                    ListaEscuadrones.get(pos1).getSoldados().add(ListaSoldados.get(pos2));
                    JOptionPane.showMessageDialog(null,"Soldado Agregado al Escuadron Exitosamente");
                    break;
                }

                case 9:
                {
                    int pos1 = Integer.parseInt(JOptionPane.showInputDialog("Indique la posicion del Escuadron en la lista"));
                    ListaEscuadrones.get(pos1).getListaSoldados();
                    break;
                }
                case 10:
                {
                    String s = "";
                    int pos1 = Integer.parseInt(JOptionPane.showInputDialog("Indique la posicion del Escuadron en la lista"));
                    String tipo = JOptionPane.showInputDialog("Ingrese el tipo de soldado\n"+"Infanteria Ligera\n"+"Infanteria Pesada\n"+"Sargento\n"+"Capitan\n"+"SuperSoldado");
                    ListaEscuadrones.get(pos1).getListaSoldados();
                    for(Object o: ListaEscuadrones)
                    {
                        
                    }
                    break;
                }
                case 12:
                {
                    
                }
            }
        }
        
    }
    
    public static void CrearZona()
    {
        String ZonaName = JOptionPane.showInputDialog("Nombre de la Zona");
                    int ZonaTamaño = Integer.parseInt(JOptionPane.showInputDialog("Tamaño de la zona en metros"));
                    int CoordenadaX = Integer.parseInt(JOptionPane.showInputDialog("Coordenada X"));
                    int CoordenadaY = Integer.parseInt(JOptionPane.showInputDialog("Coordenada Y"));
                    ListaZonas.add(new Zonas(ZonaName, ZonaTamaño, CoordenadaX, CoordenadaY));
                    JOptionPane.showMessageDialog(null, "Zona agregada exitosamente");
    }
    
    public static void CrearSoldado()
    {
        String Nombre = JOptionPane.showInputDialog("Nombre del Soldado");
        int Edad = Integer.parseInt(JOptionPane.showInputDialog("Edad del Soldado"));
        int TiempoServicio = Integer.parseInt(JOptionPane.showInputDialog("Tiempo del Servicio del soldado en dias"));
        int Rango = Integer.parseInt(JOptionPane.showInputDialog("Elija el Rango del Soldado\n 1)Infanteria Ligera \n" + "2)Infanteria Pesada\n"+"3)Sargento\n"+"4)Capitan\n"+"5)Super Soldado"));
        switch(Rango)
        {
            case 1:
            {
                String rango = "Infanteria Ligera";
                int DMG = 50;
                int Hp = Integer.parseInt(JOptionPane.showInputDialog("Puntos de Vida del Soldado")); 
                ListaSoldados.add(new InfanteriaLigera(Nombre, Edad, TiempoServicio, rango, Hp, DMG));
                break;
            }
            case 2:
            {
                String rango = "Infanteria Pesada";
                int DMG = 150;
                int Hp = Integer.parseInt(JOptionPane.showInputDialog("Puntos de Vida del Soldado\n (100-400)")); 
                ListaSoldados.add(new InfanteriaPesada(Nombre, Edad, TiempoServicio, rango, Hp, DMG));
                break;
            }
            case 3:
            {
                String rango = "Sargento";
                int DMG = 140;
                int Hp = Integer.parseInt(JOptionPane.showInputDialog("Puntos de Vida del Soldado\n (100-400)")); 
                ListaSoldados.add(new Sargento(Nombre, Edad, TiempoServicio, rango, Hp, DMG));
                break;
            }
            case 4:
            {
                String rango = "Sargento";
                int DMG = 110;
                int Hp = Integer.parseInt(JOptionPane.showInputDialog("Puntos de Vida del Soldado\n (100-400)")); 
                ListaSoldados.add(new Capitan(Nombre, Edad, TiempoServicio, rango, Hp, 110));
                break;
            }
            case 5:
            {
                String rango = "Sargento";
                int DMG = 150;
                int Hp = Integer.parseInt(JOptionPane.showInputDialog("Puntos de Vida del Soldado\n (100-400)")); 
                ListaSoldados.add(new SuperSoldado(Nombre, Edad, TiempoServicio, rango, Hp, DMG));
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Soldado Agregado Exitosamente");
    }
    
    public static void Pelea()
    {
        int Squad1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del Escuadron 1 en la lista"));
        int Squad2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del Escuadron 2 en la lista"));
        ListaEscuadrones.get(Squad1).getSoldados().size();
        
        while(ListaEscuadrones.get(Squad1).getSoldados().size() > 0 || ListaEscuadrones.get(Squad1).getSoldados().size() > 0)
        {
            ArrayList<Soldados> Squad1Soldiers = new ArrayList();
            ArrayList<Soldados> Squad2Soldiers = new ArrayList();
            Squad1Soldiers = ListaEscuadrones.get(Squad1).getSoldados();
            Squad2Soldiers = ListaEscuadrones.get(Squad2).getSoldados();
            String S1 = "";
            String S2 = "";
            for(int i = 0; i<Squad1Soldiers.size(); i++)
            {
                S1 = S1 + "\n" + Squad1Soldiers.get(i).toString();
            }
            for(int i = 0; i<Squad1Soldiers.size(); i++)
            {
                S2 = S2 + "\n" + Squad2Soldiers.get(i).toString();
            }
            int SoldadoSquad1 = Integer.parseInt(JOptionPane.showInputDialog(S1 + "Elija el Soldado"));
            Soldados Soldier1 = Squad1Soldiers.get(SoldadoSquad1);
            int SoldadoSquad2 = Integer.parseInt(JOptionPane.showInputDialog(S2 + "Elija el Soldado"));
            Soldados Soldier2 = Squad2Soldiers.get(SoldadoSquad2);
            int Soldier1DMG = Soldier1.getDMG();
            int Soldier2DMG = Soldier2.getDMG();
            int Soldier1Hp = Soldier1.getVida();
            int Soldier2Hp = Soldier2.getVida();
            while(Soldier1Hp > 0 ||Soldier2Hp > 0)
            {
               Soldier2Hp = Soldier2Hp - Soldier1DMG;
               JOptionPane.showMessageDialog(null, "El Soldado del Escuadron 1 le quito"+Soldier1DMG+" de vida al Soldado\n Vida Actual del Soldado 2:"+Soldier2Hp);
               
               Soldier1Hp = Soldier1Hp - Soldier2DMG;
               JOptionPane.showMessageDialog(null, "El Soldado del Escuadron 2 le quito"+Soldier2DMG+" de vida al Soldado\n Vida Actual del Soldado 1:"+Soldier1Hp);
            }
            
        }
    }
}
