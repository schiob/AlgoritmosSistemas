package Parcial1;
import java.util.Scanner;
import java.util.Arrays;
public class Parcial1 {
    
    static Scanner s = new Scanner(System.in);
    static Scanner s2 = new Scanner(System.in);

    public static void main(String[] args) {
        Pelicula[] lista;
        int n = s.nextInt();
        
        lista = new Pelicula[n];
        
        for (int i = 0; i < n; i++) {
           System.out.print("Datos de la Pelicula: "); 
           String nom = s2.nextLine(); 
           int hrs = s2.nextInt(); 
           int min = s2.nextInt();
           
           lista[i] = new Pelicula(nom, hrs, min);
        }
        
        lista = mergeSort(lista);
        
        for(Pelicula elem : lista){
            System.out.print(elem.getNombre() + " ");
        }
    }
    
    public static Pelicula[] mergeSort(Pelicula[] lista){
        if(lista.length == 1){
            return lista;
        }
        
        int middle = lista.length/2;
        Pelicula left[] = Arrays.copyOfRange(lista, 0, middle);
        Pelicula right[] = Arrays.copyOfRange(lista, middle, lista.length);
        
        left = mergeSort(left);
        right = mergeSort(right);
        
        Pelicula[]newLista = merge(left, right);
        return newLista;
        
    }
    
    public static Pelicula[] merge(Pelicula[] left, Pelicula[] right){
        Pelicula resultado[] = new Pelicula[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < left.length && j < right.length){
            if(left[i].getHoras()<right[j].getHoras()){
                resultado[k] = left[i];
                i++;
            }
            
            else if(left[i].getHoras() == right[j].getHoras() && left[i].getMinutos()<=right[j].getMinutos()){
                resultado[k] = left[i];
                i++;
            }
                 
            else{
                resultado[k] = right[j];
                j++;
            }
            
            k++;
        }
        
        while(i < left.length){
            resultado[k] = left[i];
            k++;
            i++;
        }
        
        while(j < right.length){
            resultado[k] = right[j];
            k++;
            j++;
        }
        
        return resultado;
    }
}
