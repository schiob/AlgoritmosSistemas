
public class Regalo {

    public String Regalo;
    public int numero;

    public Regalo() {

    }

    public Regalo(String nombre, int numero) {
        this.Regalo = nombre;
        this.numero = numero;
    }

    public String getRegalo() {
        return Regalo;
    }

    public void setRegalo(String Regalo) {
        this.Regalo = Regalo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String toString() {
        return  "\n" + Regalo;
    }

}
