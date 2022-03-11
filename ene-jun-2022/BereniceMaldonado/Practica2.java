package algoritmos;
import java.util.Scanner;

public class Practica2 {

    public static void main(String[] args) {
        int n, ni, j, swap;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa cuantos problemas tienes que hacer");
        n= sc.nextInt();
        
        int array[] = new int[n];
        System.out.println("Ingresa los tiempos que te toma hacer "+n+" problemas");
        for(ni=0; ni<n; ni++){
            array[ni] = sc.nextInt();
            }
        for(ni=1; ni<=n-1; ni++){
            j=ni;
            while(j>0 && array[j]<array[j-1]){
                swap =array[j];
                array[j] = array[j-1];
                array[j-1] = swap;
                j--;
            }      
        }
        System.out.println("Problemas acomodados");
        for(ni=0; ni<n; ni++){
            System.out.println(array[ni]);
        }
        
        int []arr={1,1,2,2,2,3,3,4,5,7};
        int m, suma = 0;
        System.out.println("¿Cuantos minutos tienes para hacerlos?");
        m=sc.nextInt();
        
        if(m > 0){
            for(int i=0; i>arr.length; i++){  //Profe no me funciono el ciclo que queria hacer :(
                if(array[i]<m){
                    suma += arr[i];
                    System.out.println("Puedes resolver "+suma+" problemas");
                }else if(arr[i]>m){
                    System.out.println("No se pueden resolver los problemas");
                }                    
            }
        }    
            
        System.out.println("Resolver "+n+" problemas en "+m+" minutos");
        
    }
}