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
public class Sargento extends Soldados{
    private String Arma = "Escopeta";
    private int ArmaDMG = 140;

    public Sargento(String Nombre, int Edad, int TiempoServicio, String Rango, int vida, int DMG) {
        super(Nombre, Edad, TiempoServicio, Rango, vida, DMG);
        DMG = ArmaDMG;
    }

    public String getArma() {
        return Arma;
    }

    public int getArmaDMG() {
        return ArmaDMG;
    }
    
}
