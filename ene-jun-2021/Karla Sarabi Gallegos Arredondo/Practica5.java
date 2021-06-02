package AlgoritmosDeOrdenamiento;
import java.util.Scanner;
import java.util.Arrays;
public class Practica5 {
    
    static Scanner s = new Scanner(System.in);
    static Scanner s2 = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = s.nextInt();
        
        String lista[] = new String [n];
        
        for (int i = 0; i < n; i++) {
            lista[i] = s2.next();
        }
        
        lista = mergeSort(lista);
        
        for(String elem : lista){
            System.out.print(elem + " ");
        }
        
    }
    
    public static String[] mergeSort(String[] lista){
        if(lista.length == 1){
            return lista;
        }
        
        int middle = lista.length/2;
        String left[] = Arrays.copyOfRange(lista, 0, middle);
        String right[] = Arrays.copyOfRange(lista, middle, lista.length);
        
        left = mergeSort(left);
        right = mergeSort(right);
        
        String[]newLista = merge(left, right);
        return newLista;
        
    }
    
    public static String[] merge(String[] left, String[] right){
        String resultado[] = new String[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < left.length && j < right.length){
            if(left[i].compareToIgnoreCase(right[j])<0){
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
