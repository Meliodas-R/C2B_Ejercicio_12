
package com.eon.Entities;

import java.math.BigDecimal;

public class Moneda {
    
    private BigDecimal valor;
    private int cantidad;

    public Moneda(BigDecimal valor, int cantidad) {
        this.valor = valor;
        this.cantidad = cantidad;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Moneda{" + "valor=" + valor + ", cantidad=" + cantidad + '}';
    }
    
}
