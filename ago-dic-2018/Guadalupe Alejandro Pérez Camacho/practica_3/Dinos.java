/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
/**
 *
 * @author Acer
 */
public class Dinos {
    String nombre;
    public Dinos(String x){
        nombre=x;
    }
    public String getNombre(){
        return nombre;
    }
    public int getTamañoNombre(){
        return nombre.length();
    }
    public void setNombre(String n){
        nombre=n;
    }
}
