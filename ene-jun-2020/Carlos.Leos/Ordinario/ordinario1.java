
package Clase;
import java.util.Scanner;
public class ordinario1 {
    public static void quicksort(int A[], int izq, int der) {

  int pivote=A[izq]; 
  int i=izq; 
  int j=der; 
  int aux;
 
  while(i<j){            
     while(A[i]<=pivote && i<j) i++; 
     while(A[j]>pivote) j--;         
     if (i<j) {                                           
         aux= A[i];                  
         A[i]=A[j];
         A[j]=aux;
     }
   }
   A[izq]=A[j]; 
   A[j]=pivote; 
   if(izq<j-1)
      quicksort(A,izq,j-1); 
   if(j+1 <der)
      quicksort(A,j+1,der); 
}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numcaj= 0, i = 0, j = 0;
        String r = "";
        System.out.println("Cuantas cajas tienes?: ");
        numcaj = s.nextInt();
        boolean x = true;

        String[] caja = new String[numcaj];
            r = s.nextLine();  
        System.out.println("Ingresa los dulces: ");
        for(i = 0; i < numcaj; i++){
            caja[i] = s.nextLine();
        }
        
        for(i = 0; i < numcaj;i++){
            String[] n = caja[i].split(" ", 0), dos = new String[2];
            String[][] ord = new String[numcaj][n.length];
            int[] num = new int[n.length]/*, num2 = new int[numcaj], sum = new int[numcaj]*/;
            int B = 0;
            
            for(j = 0; j < n.length; j++){
                dos = n[j].split("-");
                num[j] = Integer.valueOf(dos[0]);
                if(dos[1].equals("B")){
                    B = Integer.valueOf(dos[0]);
                }
            }
            
            quicksort(num, 0, n.length-1);
            
            for(j = 0; j < n.length; j++){
                if(num[j] == B){
                    System.out.print(num[j]+ "-B ");}
                
                else{
                    System.out.print(num[j]+ "-X ");}
                }
            System.out.println("");
            
            
        }
         for(i = 0; i < numcaj;i++){
            String[] n = caja[i].split(" ", 0), dos = new String[2];
            int[] num = new int[n.length]/*, num2 = new int[numcaj], sum = new int[numcaj]*/;
            int B = 0, sum = 0, z;
            
            for(j = 0; j < n.length; j++){
                dos = n[j].split("-");
                num[j] = Integer.valueOf(dos[0]);
                if(dos[1].equals("B")){
                    sum += num[j];
                    x =false;
                    break;   
                }
                else{
                    sum+= num[j];
                }
                
                z = sum;
            if(x=false)
                break;
            }
             System.out.println(sum);
         }
    }
}