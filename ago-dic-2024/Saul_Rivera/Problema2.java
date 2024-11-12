package Examen2Parcial;
import java.util.*;    

public class Problema2 {
 
  public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);

    int n = sc.nextInt();
    int [] arr = new int [n];

    for (int i= 0; i < n; i++){
        arr[i] = sc.nextInt();
    }

    int max = Arrays.stream(arr).max().getAsInt();

    int[] freq = new int [max + 1];
    
    for (int i = 0; i < n; i ++){
    freq[arr[i]]++;
    }

    for (int i = 0; i <= max; i++) {
        for (int j = 0; j < freq[i]; j++) {
            System.out.print(i + " ");
        }
    }
    }
  }

//https://asimov.cloud/blog/programacion-5/que-es-el-algoritmo-de-counting-sort-274