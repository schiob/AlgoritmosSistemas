package Extra;
import java.util.Scanner;
public class Extra1 {
static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
      System.out.println("numero de libros: ");
        int n=Integer.parseInt(s.nextLine());
        String nombre[]=new String[n];
        int paginas[]=new int[n];
        
     for (int i = 0; i < n; i++) {
      System.out.println("Nombre del libro: ");
       nombre[i]=s.nextLine();
      System.out.println("Número de paginas: ");
       paginas[i]=Integer.parseInt(s.nextLine());
       
     }
        
     for (int i = 0; i < n; i++) {
       for (int j = 1; j < n; j++) {
        if(paginas[j]<paginas[j-1]){
         int pagTemp=paginas[j];
          paginas[j]=paginas[j-1];
          paginas[j-1]=pagTemp;
          String nomTemp=nombre[j];
          nombre[j]=nombre[j-1];
          nombre[j-1]=nomTemp;
         }
       }
    }
        
      System.out.println(" ");
       for (int i = 0; i < n; i++) {
       System.out.println(nombre[i]);
       }
      }
     } 



