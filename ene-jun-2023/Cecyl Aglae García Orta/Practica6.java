package Parcial2;
import java.util.*;

/*@author Cecyl Aglae García Orta*/

public class Practica6{
    
    //Clase de estudiante para guardar datos
    static class Estudiante{
        String nom;
        int oro, plata, bronce;
        public Estudiante(String nom, int oro, int plata, int bronce){
            this.nom = nom;
            this.oro = oro;
            this.plata = plata;
            this.bronce = bronce;
        }
    }

    //Metodo para comparación de medallas
    public static boolean comparar(Estudiante a, Estudiante b){
        if (a.oro > b.oro){
            return true;
        } else if (a.oro == b.oro && a.plata > b.plata){
            return true;
        } else if (a.oro == b.oro && a.plata == b.plata && a.bronce > b.bronce){
            return true;
        } else if (a.oro == b.oro && a.plata == b.plata && a.bronce == b.bronce && a.nom.compareTo(b.nom) < 0){
            return true;
        }
        return false;
    }
    
    //Reorganiza los datos
    public static int reorga(List <Estudiante> arr, int lf, int rgt){
        Estudiante pivot = arr.get(rgt);
        int i = lf - 1;
        for (int j = lf; j < rgt; j++){
            if (comparar(arr.get(j), pivot)){
                i++;
                Collections.swap(arr, i, j);
            }
        }
        Collections.swap(arr, i + 1, rgt);
        return i + 1;
    }
    
    //Metodo de QuickSort
    public static void QuickSort(List <Estudiante> arr, int lf, int rgt){
        if (lf < rgt){
            int pivote = reorga(arr, lf, rgt);
            QuickSort(arr, lf, pivote - 1);
            QuickSort(arr, pivote + 1, rgt);
        }
    }
    
    //Main
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //Pedir datos
        System.out.println("Alumnos:");
        int n = s.nextInt();
        List<Estudiante> est = new ArrayList<>();
        for (int i = 0; i < n; i++){
            System.out.println("Nombre del alumno:");
            String nom = s.next();
            System.out.println("Medallas de Oro:");
            int oro = s.nextInt();
            System.out.println("Medallas de Plata:");
            int plata = s.nextInt();
            System.out.println("Medallas de Bronce:");
            int bronce = s.nextInt();
            //Agregarlos a la clase
            est.add(new Estudiante(nom, oro, plata, bronce));
        }
        //Usar QuickSort
        QuickSort(est, 0, n - 1);
        System.out.println(" ");
        //For para imprimir nombres de estudiantes
        for (Estudiante c : est){
            System.out.println(c.nom);
        }
    }
}