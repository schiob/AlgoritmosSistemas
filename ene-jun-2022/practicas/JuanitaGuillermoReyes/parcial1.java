import java.util.Scanner;

public class parcial1 {
    
        public static void main (String[]args) {
            Scanner sc = new Scanner(System.in);
           
           
            String arreglo[]={"Parasaurolophus"," Oviraptor"," Minmi" ,"Troodon ","Wannanosaurus"};//entrada
               
            String  n;  
            System.out.println("ingresa el numero de dinosaurios para continuar");
             n =sc.nextLine();
           
           
              
                for (int i =0;i<=arreglo.length;i++){ 
                  arreglo[0]=sc.nextLine();            
                  System.out.print("Escriba el dinosaurio"+(i+1)+":");
   
               }
           

                for (int j=0; j < arreglo.length-1; j++ ) {
                for (int f=j+1; f<arreglo.length; f++) {
                if (arreglo[j].length() < arreglo[f].length()) {
                String temp = arreglo[j];
              arreglo[j] = arreglo[f];
                arreglo[f] = temp;
        }
      }
     }
           
              System.out.println("se ordenaron los dinosaurios");
                      
                    for (int j=0; j <arreglo.length; j++ ) {
                        System.out.print(arreglo[j]);
                       System.out.println();   //salen los nombres ordenados de los mas cortos a los mas largos
                    
          }
          
       }
    }