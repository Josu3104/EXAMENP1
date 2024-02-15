/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_progra2_p1;

import java.util.Calendar;

/**
 *
 * @author Josue Gavidia
 */
public abstract class Barco {
    protected String nombre;
    protected Calendar fechaCirc;

    public Barco(String nombre) {
        this.nombre = nombre;
        this.fechaCirc = Calendar.getInstance();
    }
    
    public abstract void agregarElemento();
    public abstract double vaciarCobrar();
    public abstract double precioElemento();
    
    
    
    
    
    
    
    

    public final String getNombre() {
        return nombre;
    }

    public final Calendar getFechaCirc() {
        return fechaCirc;
    }

    @Override
    public String toString() {
        return "Barco{" + "nombre=" + nombre + '}';
    }
    
    
     
    
    
    
    
}
