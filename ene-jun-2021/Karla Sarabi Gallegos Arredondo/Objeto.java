package AlgoritmosDeOrdenamiento;

public class Objeto {
    
    private String nombre;
    private int cantidad;
    
    public Objeto(){
        nombre = " ";
        cantidad = 0;
    }
    
    public Objeto(String s, int x){
        nombre = s;
        cantidad = x;
    }
    
    public void setNombre(String s){
       nombre = s;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setCantidad(int x){
        cantidad = x;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public String toString(){
        return nombre + " ";
    }
}
