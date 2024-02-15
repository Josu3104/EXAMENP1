/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package examen_progra2_p1;

/**
 *
 * @author Josue Gavidia
 */
public enum TipoPesquero {
    PEZ(20),CAMARON(50),LANGOSTA(200);
    
    public final double price;
    
    TipoPesquero(double precio){
        this.price=precio;
    }
}
