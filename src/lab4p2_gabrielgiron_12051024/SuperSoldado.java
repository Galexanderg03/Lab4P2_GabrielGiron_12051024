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
public class SuperSoldado extends Soldados{
    ArrayList<String> Armas = new ArrayList<String>();
    ArrayList<Integer> ArmaDMG = new ArrayList<Integer>();
    
    
    public SuperSoldado(String Nombre, int Edad, int TiempoServicio, String Rango, int vida, int DMG) {
        super(Nombre, Edad, TiempoServicio, Rango, vida, DMG);
        Armas.add("Arma Blanca");
        ArmaDMG.add(50);
        Armas.add("Bomba");
        ArmaDMG.add(150);
        Armas.add("Escopeta");
        ArmaDMG.add(140);
        Armas.add("Lanzallamas");
        ArmaDMG.add(110);
    }    
   
}
