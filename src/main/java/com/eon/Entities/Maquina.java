package com.eon.Entities;

import java.util.ArrayList;

public class Maquina {

    private ArrayList<Refresco> refrescos = new ArrayList<>(); 
    private ArrayList<Moneda> monedasMaquina = new ArrayList<>();
    private ArrayList<Moneda> monedasUsuario = new ArrayList<>();

    public ArrayList<Refresco> getRefrescos() {
        return refrescos;
    }

    public void setRefrescos(ArrayList<Refresco> refrescos) {
        this.refrescos = refrescos;
    }
    
    public ArrayList<Moneda> getMonedas() {
        return monedasMaquina;
    }

    public void setMonedas(ArrayList<Moneda> monedas) {
        this.monedasMaquina = monedas;
    }

    public ArrayList<Moneda> getMonedasMaquina() {
        return monedasMaquina;
    }

    public void setMonedasMaquina(ArrayList<Moneda> monedasMaquina) {
        this.monedasMaquina = monedasMaquina;
    }

    public ArrayList<Moneda> getMonedasUsuario() {
        return monedasUsuario;
    }

    public void setMonedasUsuario(ArrayList<Moneda> monedasUsuario) {
        this.monedasUsuario = monedasUsuario;
    }
    
    public void agregarMonedaMaquina(Moneda moneda){
        monedasMaquina.add(moneda);
    }
    
    public void agregarMonedaUsuario(Moneda moneda){
        monedasUsuario.add(moneda);
    }
    
    public void agregarRefresco(Refresco refresco){
        refrescos.add(refresco);
    }
    
}
