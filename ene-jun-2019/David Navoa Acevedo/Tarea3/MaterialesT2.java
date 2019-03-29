/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas;

/**
 *
 * @author DEVORA
 */
public class MaterialesT2 {
    String nombreMaterial;
    int cantidad;
    
    public MaterialesT2(String nombreMaterial,int cantidad){
        this.nombreMaterial=nombreMaterial;
        this.cantidad=cantidad;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public String toString(){
        return nombreMaterial+" "+cantidad;
    }
    
}
