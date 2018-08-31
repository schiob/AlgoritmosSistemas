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
public class Alumno {
    private String Nombre="";
    private int contador;
    Alumno(String n){
        this.Nombre=n;
        this.contador=1;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Nombre=" + Nombre+'}';
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
}
