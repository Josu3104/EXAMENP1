/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package examen_progra2_p1;

import static examen_progra2_p1.TipoPesquero.CAMARON;
import static examen_progra2_p1.TipoPesquero.LANGOSTA;
import static examen_progra2_p1.TipoPesquero.PEZ;

/**
 *
 * @author Josue Gavidia
 */
public final class BarcoPesquero extends Barco {

    protected int pecesCapturados;
    protected TipoPesquero tipo;

    public BarcoPesquero(String nombre, TipoPesquero tipo) {
        super(nombre);
        pecesCapturados = 0;
        this.tipo = tipo;

    }

    @Override
    public void agregarElemento() {
        this.pecesCapturados++;
    }

    @Override
    public double vaciarCobrar() {
    
    if(this.pecesCapturados>0){
        double monto=this.pecesCapturados*this.precioElemento();
        this.pecesCapturados=0;
       return monto;
       
    }
    return 0;
    
    }
       
    

    @Override
    public double precioElemento() {
       double precio = 0;
             switch (tipo) {
            case PEZ:
                precio=PEZ.price;
                break;
            case CAMARON:
                precio=CAMARON.price;
                break;
            case LANGOSTA:
                 precio=LANGOSTA.price;
                break;
             
        }
             return precio;
    }

    @Override
    public String toString() {
        return super.toString()+"BarcoPesquero{" + "pecesCapturados=" + pecesCapturados + ", tipo=" + tipo + '}';
    }
    
    



}
