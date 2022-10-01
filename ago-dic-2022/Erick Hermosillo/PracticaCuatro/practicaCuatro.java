
package parcialUno;

import java.util.Scanner;


public class practicaCuatro {
    
     public String [] mergesort(String[] A){//Entrada del arreglo y separacion en mitades
        if (A.length <= 1) {
            return A;
        }
        String[]izq;
        String[]der;
        der = new String [A.length/2];
        if (A.length % 2 == 0){
            izq = new String [A.length/2];
        }else{
            izq = new String [(A.length/2 + 1)];
        }
        int i;
        for(i = 0; i < izq.length; i++){
            izq[i] = A[i];
        }
        int k = 0;
        for (int j = i; j < A.length; j++) {
            der[k] = A[j];
            k++;
        }
        //Parte recursiva
      String[] arregloOrdenado = merge(mergesort(izq), mergesort(der));
        
        
        return arregloOrdenado;
    }
    public String [] merge(String [] a, String[] b){//recibe 2 sub array y los junta ordenadamente en uno, a y b deben estar ordenados
        int indicea = 0;
        int indiceb = 0;
       String [] arregloJunto = new String [a.length+ b.length];
        for (int k = 0; k < arregloJunto.length; k++) {
            if (a[indicea].compareTo(b[indiceb]) < 0) {
                arregloJunto[k]=a[indicea];
                indicea++;
            }else{
                arregloJunto[k]=b[indiceb];
                indiceb++;
            }
            if (indicea == a.length) {
                k++;
                for (indiceb = indiceb; indiceb < b.length; indiceb++) {
                    arregloJunto[k] = b[indiceb];
                    k++;
                }
            }else if(indiceb == b.length){
                k++;
                for (indicea = indicea; indicea < a.length; indicea++) {
                    arregloJunto[k] = a[indicea];
                    k++;
                }
                
            }
        }
        
        return arregloJunto;
}
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresar la cantidad palabras en la lista de Ricardo");
        int numeroDePalabrasInt  = sc.nextInt();//La entrada del numero de palabras
        String listaDePalabras[] = new String [numeroDePalabrasInt];//Se crea el arreglo listaDePalabras, tiene como limite el numero de palabras
        
        System.out.println("\nIngrese cada una de las " + numeroDePalabrasInt+ " palabras de la lista, separadas por un espacio\nEjemplo: hola mundo Owo ");
        sc.nextLine();
        String palabrasEntrada = sc.nextLine();//La entrada de cada uno de las palabras
         listaDePalabras = palabrasEntrada.split(" ");//La creacion de un arreglo donde separa los valores agregados por la entrada anterior, cada vez que hay un espacio se crea un indice
        

           practicaCuatro mg = new practicaCuatro();
          String arreglordenadoXD[] =  mg.mergesort(listaDePalabras);        
         for (String arreglordenadoXD1 : arreglordenadoXD) {
             System.out.println(arreglordenadoXD1);
         }
                 
                }
}
