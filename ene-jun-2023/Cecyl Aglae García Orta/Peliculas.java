package algoritmos;
import java.util.*;

/*@author cecyl*/
//p=pelicula, ps=peliculas, h=horas, m=minutos, t=tiempo, ini=inicio, arrayu=ArregloDeAyuda

class Pelicula {
    String nombreP;
    int t;
    public Pelicula(String nombreP, int h, int m) {
        //Constructores
        this.nombreP = nombreP;
        this.t = h * 60 + m;
    }
}

public class Peliculas {
    //Algoritmo
    public static void merge(List<Pelicula> ps, int ini, int medio, int fin) {
        List<Pelicula> arrayu = new ArrayList<>();
        int i = ini;
        int j = medio + 1;
        while (i <= medio && j <= fin) {
            if (ps.get(i).t <= ps.get(j).t) {
                arrayu.add(ps.get(i));
                i++;
            } else {
                arrayu.add(ps.get(j));
                j++;
            }
        }
        while (i <= medio) {
            arrayu.add(ps.get(i));
            i++;
        }
        while (j <= fin) {
            arrayu.add(ps.get(j));
            j++;
        }
        for (int k = 0; k < arrayu.size(); k++) {
            ps.set(ini + k, arrayu.get(k));
        }
    }
    //Algoritmo MergeSort
    public static void mergeSort(List<Pelicula> ps, int ini, int fin) {
        if (ini < fin) {
            int medio = (ini + fin) / 2;
            mergeSort(ps, ini, medio);
            mergeSort(ps, medio + 1, fin);
            merge(ps, ini, medio, fin);
        }
    }
    
    public static void main(String[] args) {
        //Pedir los datos
        Scanner s = new Scanner(System.in);
        System.out.println("Numero de peliculas, Nombre de peliculas, Tiempo de duración");
        int n = s.nextInt();
        List<Pelicula> ps = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String nombreP = s.next();
            int h = s.nextInt();
            int m = s.nextInt();
            ps.add(new Pelicula(nombreP, h, m));
        }
        //Usar el algoritmo
        mergeSort(ps, 0, ps.size() - 1);
        //Imprimir las peliculas
        System.out.println("Peliculas de la más larga a la más corta: ");
        for (Pelicula p : ps) {
            System.out.println(p.nombreP + " ");
        }
    }
}
