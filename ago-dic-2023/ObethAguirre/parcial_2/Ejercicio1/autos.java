package parcial_2.Ejercicio1;

public class autos {
    String nombre;
    int km;
    public autos (String  nombre, int km){
        this.nombre=nombre;
        this.km=km;

    }

    public String arreglo(){
        return nombre+"\t"+km;
    }
}
