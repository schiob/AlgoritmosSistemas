package Parcial1;

public class Pelicula {
    
    private String nombre;
    private int horas;
    private int minutos;
    
    public Pelicula(){
        nombre = " ";
        horas = 0;
        minutos = 0;
    }
    
    public Pelicula(String nom, int hrs, int min){
        nombre = nom;
        horas = hrs;
        minutos = min;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nom){
        nombre = nom;
    }
    
     public int getHoras(){
        return horas;
    }
    
    public void setHoras(int hrs){
        horas = hrs;
    }
    
     public int getMinutos(){
        return minutos;
    }
    
    public void setMinutos(int min){
        minutos = min;
    }
    
    public String toString(){
        return nombre + " ";
    }
}
