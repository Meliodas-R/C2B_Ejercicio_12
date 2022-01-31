package com.eon.Entities;

import java.util.ArrayList;

public class Maquina {

    private ArrayList<Refresco> refrescos = new ArrayList<Refresco>(); 

    public ArrayList<Refresco> getRefrescos() {
        return refrescos;
    }

    public void setRefrescos(ArrayList<Refresco> refrescos) {
        this.refrescos = refrescos;
    }
    
    public void agregarRefresco(Refresco refresco){
        refrescos.add(refresco);
    }
    
    public void eliminarRefresco(int posicion){
        refrescos.remove(posicion);
    }
    
}
