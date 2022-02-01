
package com.eon.Entities;

import java.math.BigDecimal;

public class Refresco {
    
    private String nombre;
    private int cantidad;
    private BigDecimal precio;

    public Refresco(String nombre, int cantidad, BigDecimal precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    
    public void entregarRefresco() throws Exception{
        if(this.cantidad > 0){
            this.cantidad = cantidad - 1;
        } else {
            throw new Exception();
        }
        
    }
    
    public void rellenarRefresco(int cantidadRefresco){
       this.cantidad = cantidad + cantidadRefresco;
    }

    @Override
    public String toString() {
        //return "Refresco{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + '}';
        return "Refresco: \n"
                + " -Nombre: " + nombre + "\n"
                + " -Cantidad: " + cantidad  + "\n"
                + " -Precio: " + precio;
    }
    
}
