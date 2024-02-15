/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_progra2_p1;

import static examen_progra2_p1.TipoPesquero.CAMARON;
import static examen_progra2_p1.TipoPesquero.LANGOSTA;
import static examen_progra2_p1.TipoPesquero.PEZ;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Josue Gavidia
 */
public class Muelle {

    ArrayList<Barco> ships = new ArrayList();

    public static String nombre;

    public static void main(String[] args) {
        JFrame GUI = new GUI();
        GUI.setVisible(true);

    }

    public void AgregarBarco(String tipo, String nombre, TipoPesquero tipoPesc) {
        switch (tipo.toUpperCase()) {
            case "PESQUERO":
                switch (tipoPesc) {
                    case PEZ:
                        TipoPesquero enu = TipoPesquero.PEZ;
                        break;
                    case CAMARON:
                        TipoPesquero enu = TipoPesquero.CAMARON;
                        break;
                    case LANGOSTA:
                        TipoPesquero enu = TipoPesquero.LANGOSTA;
                        break;

                }
                ships.add(new BarcoPesquero(nombre, enu));
                break;
            case "PASAJERO":
                break;
        }
    }
}
