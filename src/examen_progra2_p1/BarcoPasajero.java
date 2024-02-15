/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_progra2_p1;

/**
 *
 * @author Josue Gavidia
 */
public final class BarcoPasajero extends Barco {

    protected String[] nombresPasajeros;
    protected double precioBoleto;
    protected int pasajerosAdded;

    public BarcoPasajero(String nombre, int cantidad, double precioBoleto) {
        super(nombre);
        nombresPasajeros = new String[cantidad];
        this.precioBoleto = precioBoleto;
        this.pasajerosAdded = 0;
    }

    @Override
    public void agregarElemento() {

        for (int i = 0; i < this.nombresPasajeros.length; i++) {
            if (this.nombresPasajeros[i] == null) {
                this.nombresPasajeros[i] = Muelle.nombre;
                this.pasajerosAdded++;
            }
        }

    }

    @Override
    public double vaciarCobrar() {
        if (this.pasajerosAdded > 0) {
            double monto = this.pasajerosAdded * this.precioBoleto;
            this.pasajerosAdded = 0;
            return monto;
        }
        return 0;
    }

    @Override
    public double precioElemento() {
        return this.precioBoleto;
    }

    @Override
    public String toString() {
        return super.toString() + "Cantidad de Pasajeros que compraron boleto: " + this.pasajerosAdded;
    }

    public String listarPasajeros() {
        return listarPasajeros(0, "");
    }

    private String listarPasajeros(int pos, String passengers) {
        String pasajeroOld = passengers;
        
        if (pos >= 0) {
            String pasajeroNuevo = pasajeroOld + ", "+this.nombresPasajeros[pos];
            return this.listarPasajeros(pos++, pasajeroNuevo);
        }
        return "";
    }

}
