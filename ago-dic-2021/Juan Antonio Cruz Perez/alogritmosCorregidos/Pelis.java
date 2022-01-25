
public class Pelis {

    public String nombre;
    public int hrs;
    public int min;
    public int dura;

    public Pelis() {

    }

    public Pelis(String nombre, int hrs,int min) {
        this.nombre = nombre;
        this.hrs = hrs;
        this.min = min;
        this.dura = (hrs * 60) + min;
    }
    


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHrs() {
        return hrs;
    }

    public void setHrs(int hrs) {
        this.hrs = hrs;
    }
    
        public int getDura() {
        return dura;
    }

    public void setDura(int dura) {
        this.dura = dura;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public String toString() {
        return "\n" + nombre;
    }
    
    

}
