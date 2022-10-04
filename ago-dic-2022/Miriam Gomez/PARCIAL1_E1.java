package algoritmosp;

/*
Ejercicio 1 - El profe está enfermo

El profe Chio se enfermó de la garganta y le recetaron un montón de drogas para que se cure.
Por la fiebre no quiere andar batallando para encontrar la medicina que ocupa así que ayúdalo
haciendo un programa que le ayude a ordenar los medicamentos en orden alfabético.

Input
La entrada será recibida por STDIN

Consiste en dos lineas, la primera tiene 1 entero, n representado el número de medicinas.

Después hay 1 línea con n palabras separadas por espacios, cada palabra es el nombre de una medicina.

Output
Imprime a salida estandar STDOUT una linea con las medicinas ordenas en orden alfabético.

Ejemplos
Entrada
5
naproxeno paracetamol rimantadina azitromicina ibuprofeno
Salida
azitromicina ibuprofeno naproxeno paracetamol rimantadina
Notas
Resuelve el problema haciendo una implementación cualquier algoritmo de ordenamiento.


*/
import java.util.Scanner;
public class PARCIAL1_E1 {

  
public static void main(String[] args) {
Scanner s = new Scanner(System.in);  

int n;
System.out.println("Digite la cantidad de drogas xD que tomar el profesor");
n=Integer.parseInt(s.nextLine());

String [] medicinas= new String [n];


    for (int i = 0; i < n; i++) {
          System.out.println("Digite el nombre de la medicina ");
             medicinas[i]=s.nextLine();
    

          int x = i;
            for (int j = i; j >= 0; j--) {
                if(medicinas[j].compareTo(medicinas[x])>=0){
                    String temporal = medicinas[x];
                    medicinas[x]=medicinas[j];
                    medicinas[j]=temporal;
                    x=j;
                }   
             
        }
   
    }
    
     System.out.println("La medicina ordenada seria:");
     for (int i = 0; i < n; i++) {
         System.out.println(medicinas[i]);
    }
    }
    
}
