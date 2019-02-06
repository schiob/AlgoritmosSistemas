//PROFE LA VERDAD ME COSTO MUCHO ESTE PROGRAMA :c
//ESPERO QUEDARA BIEN :c
//SALUDOS Y MAS IDEAS COMO LAS DE MINECRAFT ASI SI ME DAN GANAS DE HACER TAREA XD
//PARA LA OTRA RECUERDE QUE UN STACK DE ITEMS TIENE 64 JAJA XD
//SALUD2
package tareamaikra;

import java.util.Scanner;

public class TAREAMAIKRA {

  
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

        int ObjetosChidos;
        boolean apoyo = true;

        System.out.println("HOLA SUSY :3, ¿DIME CUANTOS ITEMS TIENES?");
        ObjetosChidos = s.nextInt();
        if (ObjetosChidos < 1 || ObjetosChidos >50) {
                System.out.println("NO PUEDES TENER MAS DE 50 ITEMS SUSY :C");
                System.exit(0);
            }
           
            String NombreDeItem[] = new String[ObjetosChidos];
            int NumDeObjetos[] = new int[ObjetosChidos];
            int CUENTA = 1;
            for (int i = 0; i < NombreDeItem.length && i < NumDeObjetos.length; i++){
            
            System.out.println("DIME EL NOMBRE DEL ITEM #" + CUENTA + ": ");
            NombreDeItem[i] = s.next();
            
            System.out.print("SUSANITA... ¿CUANTO TIENES DE " + NombreDeItem[i] +":? ");
            NumDeObjetos[i] = s.nextInt();
                
            if (NumDeObjetos[i] < 1 || NumDeObjetos[i] > 100) {
                System.out.println("SUSY LA CANTIDAD DE ITEMS DEBE SER ENTRE 1 Y 100");
                System.exit(0);
            }
            CUENTA++;
        }
  
        System.out.println();
        int Temporal;
        String Temporal2 = "";
        
      //AQUI ORDENAMOS LO QUE TENEMOS QUE ORDENAR DE UNA MANERA ORDENADA :v (ES BROMI) XD
        
        for (int i = 1; i < NumDeObjetos.length; i++)
        {
            Temporal = NumDeObjetos[i];
            Temporal2 = NombreDeItem[i];
            int j = 0;
            
            for ( j = i-1; j > -1 && NumDeObjetos[j] < Temporal  ; j--) 
            {
                NumDeObjetos[j+1] = NumDeObjetos[j];
                NombreDeItem[j+1] = NombreDeItem[j];
            }
            
            NumDeObjetos[j+1] = Temporal;
            NombreDeItem[j+1] = Temporal2;
        }
        
         for (int i = 0; i <NombreDeItem.length; i++) {
           
             System.out.print(NombreDeItem[i] + ", ");          
    }
    
    }
}