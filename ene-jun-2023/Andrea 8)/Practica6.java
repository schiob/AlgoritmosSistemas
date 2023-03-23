package algoritmos;
import java.util.*;
/**
 * Fecha: 20 de marzo de 2023
 * @author Luz Andrea
 */
public class Practica6 {
    static class alumno{
        String nombre;
        int oro, plata, bronce;
        public alumno(String n, int o, int p, int b){
            this.nombre = n;
            this.oro = o;
            this.plata = p;
            this.bronce = b;
        }
    }

    public static boolean comparar(alumno a,alumno b){
        if (a.oro > b.oro){
            return true;
        } else if (a.oro == b.oro && a.plata > b.plata){
            return true;
        } else if (a.oro == b.oro && a.plata == b.plata && a.bronce > b.bronce){
            return true;
        } else if (a.oro == b.oro && a.plata == b.plata && a.bronce == b.bronce && a.nombre.compareTo(b.nombre) < 0){
            return true;
        }
        return false;
    }
    
    public static int reorg(List <alumno> arr, int lf, int r){
        alumno pivot = arr.get(r);
        int i = lf - 1;
        for (int j = lf; j < r; j++){
            if (comparar(arr.get(j), pivot)){
                i++;
                Collections.swap(arr, i, j);
            }
        }
        Collections.swap(arr, i + 1, r);
        return i + 1;
    }
    
    public static void QuickSort(List <alumno> arr, int lf, int r){
        if (lf < r){
            int pivote = reorg(arr, lf, r);
            QuickSort(arr, lf, pivote - 1);
            QuickSort(arr, pivote + 1, r);
        }
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in); //Objeto para enteros
        Scanner r= new Scanner(System.in); //Objeto para cadenas
        System.out.println("Numero de concursantes: ");
        int n = s.nextInt();
        List<alumno> est = new ArrayList<>();
        for (int i = 0; i < n; i++){
            System.out.println("Nombre del alumno:");
            String nom = r.next();
            System.out.println("Medallas de Oro:");
            int oro = s.nextInt();
            System.out.println("Medallas de Plata:");
            int plata = s.nextInt();
            System.out.println("Medallas de Bronce:");
            int bronce = s.nextInt();
            
            est.add(new alumno(nom, oro, plata, bronce));
        }
        QuickSort(est, 0, n - 1);
        System.out.println(" ");
        for (alumno c : est){
            System.out.println(c.nombre);
        }
    }
}
