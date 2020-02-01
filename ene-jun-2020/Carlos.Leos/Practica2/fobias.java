
package salon;
import java.util.Scanner;
public class fobias {

   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int [] a= new int [20],b = new int[20];
      int i, n, j, t;
      double par;
      String[] num;
      String cad;
      cad=s.nextLine();
         num=cad.split("\\s+", 20);
         
      for(i=0;i<a.length;i++){//Separar numeros pares de impares
         a[i]=Integer.valueOf(num[i]);
         n=a[i];
         par=n%2;
         if(par==0)
            b[i]=a[i];
      }
      
      for(i=1;i<b.length;i++){//Ordenar de mayor a menor
         t=b[i];
         j=i;
         while(j>=0&&b[j-1]>t){
            b[j]=b[j-1];
            j=j-1;         
         }
         b[j]=t;
      }
      
      for(i=a.length-1;i>=0;i--){//Imprimir los numeros en orden inverso
         if(b[i]>0)
            System.out.print(b[i]+" ");
      }
   }
}
   

