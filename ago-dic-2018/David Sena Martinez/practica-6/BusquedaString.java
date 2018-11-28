
package algoritmos;
import java.util.Arrays;
import javax.swing.JOptionPane;
;
public class BusquedaString {

public static void main(String[] args) {

        String array[] ={"EWRSFSFSFSB","BB","AA","SDFSFJ","WRTG","FF","ERF","FED","TGH"};
        String buscar = "BB";

        Arrays.sort(array);

        int buscaposicion= Encuentra(array,buscar);

        System.out.println(buscaposicion != -1 ? array[buscaposicion]+ " Posicion "+buscaposicion : "No Encontrada");
    }

    public static int Encuentra (String[] a, String dato) {
        int inicio= 0;
        int fin = a.length - 1;
        int mitad;

        while (inicio <= fin) {
            mitad= (inicio+fin) / 2;

            if (a[mitad].compareTo(dato) < 0) {
                inicio = fin + 1;
            } else if (a[mitad].compareTo(dato) > 0) {
                fin = mitad - 1;
            } else {
                return mitad;
            }
        }
    return -1;
    }
    
}


