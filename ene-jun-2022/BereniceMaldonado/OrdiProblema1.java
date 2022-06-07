package algoritmos;
import java.util.Scanner;

public class OrdiProblema1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.println("Ingresa el numero de tareas que tienes que hacer: ");
        int tar;
        int e = sc.nextInt();
        String nom[] = new String[e];
        String n;
        System.out.println("¿Cuáles son las tareas que tienes que hacer?");
        int tarea[] = new int[e];
        
        for (int i = 0; i < e; i++) {
            nom[i]=sc.next();
            tarea[i] = sc.nextInt();
        }
        
        for(int c=0; c < (e-1); c++){
            for(int i=0; i< (e-1); i++){
                if(tarea[i] < tarea[i+1]){
                    n = nom[i];
                    tar = tarea[i];
                    nom[i] = nom[i+1];
                    nom[i+1] = n;
                    tarea[i] = tarea[i+1];
                    tarea[i+1] = tar;
                }                    
                
                else if (tarea[i] == tarea[i+1]) {
                    if((int)nom[i].charAt(0) > (int)nom[i+1].charAt(0)){                            
                                n = nom[i];
                                nom[i] = nom[i+1];
                                nom[i+1] = n;
                    }
                }
            }       
        }
        System.out.println();
        for(int i=0; i<e; i++){
            System.out.println(nom[i]);
        }
    }
    
    private static int particion(int arreglo[], int izquierda, int derecha) {
        int pivote = arreglo[izquierda];
        while (true) {
            while (arreglo[izquierda] < pivote) {
                izquierda++;
            }
            while (arreglo[derecha] > pivote) {
                derecha--;
            }
        if (izquierda >= derecha) {
                return derecha;
            }
        else {
            int temporal = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = temporal;
                izquierda++;
                derecha--;
            }
        }
    }
    
    private static void quicksort(int arreglo[], int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = particion(arreglo, izquierda, derecha);
            quicksort(arreglo, izquierda, indiceParticion);
            quicksort(arreglo, indiceParticion + 1, derecha);
        }
    }


    private static int particion(String arreglo[], int izquierda, int derecha) {
        String pivote = arreglo[izquierda];
        while (true) {
            while (arreglo[izquierda].compareTo(pivote) < 0) {
                izquierda++;
            }
            while (arreglo[derecha].compareTo(pivote) > 0) {
                derecha--;
            }
            if (izquierda >= derecha) {
                return derecha;
            } else {
                String temporal = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = temporal;
                izquierda++;
                derecha--;
            }
        }
    }

    private static void quicksort(String arreglo[], int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = particion(arreglo, izquierda, derecha);
            quicksort(arreglo, izquierda, indiceParticion);
            quicksort(arreglo, indiceParticion + 1, derecha);
        }
    }
}