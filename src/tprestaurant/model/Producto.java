/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tprestaurant.model;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public abstract class Producto implements Comparable, Serializable{
    
    private String descripcion;
    
    public abstract float costo();
    public abstract float getPorcentajeGanancia();
    
    public float precio()
    {
        return costo()*((getPorcentajeGanancia()/100)+1);
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public boolean equals(Object o) {
        
        if(!(o instanceof Producto))
            return false;
        
        return this.descripcion.equals(((Producto)o).getDescripcion());
    }
    
    @Override
    public int compareTo(Object o){
        Producto p = (Producto)o;
        String pClassName = this.getClass().getName();
        String oClassName = p.getClass().getName();
        int compClass = pClassName.compareTo(oClassName);
        
        return compClass!=0 ? compClass : this.getDescripcion().compareTo(p.getDescripcion());
    }
}
