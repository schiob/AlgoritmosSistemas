import java.util.Scanner;

public class practica4 {
    
        public static void main (String[]args) {
            Scanner sc = new Scanner(System.in);
            //Chuy está estudiando para ser doctor y batalla mucho con los nombres
            // tan extraños que tienen las medicinas, algunos de esos nombres pueden ser muy largos,
            // como CANDESARTAN HIDROCLOROTIAZIDA ALTER, Chuy tiene una lista con nombres de medicamentos
            // y quiere ordenarla de los nombres más cortos a los más largos para así estudiarla mejor.
            //Ayuda a Chuy haciendo un programa que haga eso.
           
            String arreglo[]={"CANDESARTAN HIDROCLOROTIAZIDA ALTER","CARBAMAZEPINA NORMON","MATRIF",
                    "ACICLOVIR SANDOZ","MELOXICAM","FENDIVIA","SEBUMSELEN"};
               
               
                   String  n;  
               System.out.println("ingresa el numero de medicinas para continuar");
                n =sc.nextLine();
              
                for (int i =0;i<=arreglo.length;i++){
                  arreglo[0]=sc.nextLine();            
                  System.out.print("Escriba la medicina"+(i+1)+":");
   
               }
           

                for (int j=0; j < arreglo.length-1; j++ ) {
                for (int f=j+1; f<arreglo.length; f++) {
                if (arreglo[j].length() > arreglo[f].length()) {
                String temp = arreglo[j];
              arreglo[j] = arreglo[f];
                arreglo[f] = temp;
        }
      }
     }
           
              System.out.println("se ordenaron las medicinas");
                      
                    for (int j=0; j < arreglo.length; j++ ) {
                        System.out.print(arreglo[j]);
                       System.out.println();
                    
          }
          
       }
    }



