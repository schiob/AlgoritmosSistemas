public class practica3 {
    
        public static void main (String[]args) {
       //Tom, mi primo al que le encantan los numeritos, tiene una lista de 20 enteros.
       //  Pero tiene un problema donde después de las 9 p.m. le asustan los números impares.
       //Ayúdale removiendo esos números e imprime la lista ordenada de mayor a menor.
           
           int[] arreglo={3, 43, 2, 5, 4, 6, 5, 4, 334, 45, 23, 123, 323, 45, 34, 23, 43, 5, 46, 78};//Arreglo
            
            System.out.println("Esto se va a ordenar:");
              
            for(int numeros:arreglo){
               System.out.print(numeros+" ");
               
               }
    
            
            for(int i = 0; i < arreglo.length - 1; i++) {
                  int f = i;
                for(int j = f + 1; j < arreglo.length; j++){
                    if(arreglo[j] > arreglo[f]){
                        f = j; 
                    }
                }
    
                 if(i!= f){  
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[f];
                    arreglo[f] = temp;
                }
            }
            System.out.println();
            System.out.println("se ordeno quitando impares y de mayor a menor:");
           
    
                for(int numeros:arreglo){
                if(numeros%2==0) {
                    System.out.print(numeros+" ");
                }
             
              }
            }
    
        } 

