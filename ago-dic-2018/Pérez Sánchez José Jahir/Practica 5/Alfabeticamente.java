package algoritmos;
import java.util.Scanner;
public class Alfabeticamente {
    private String v[];
    public Alfabeticamente(String A[]){
     this.v=v;
 }
 public void ordenar(){
     for (int i = 0; i < v.length; i++) {
         for (int j = 0; j < v.length && i !=j; j++) {
             if(v[i].compareToIgnoreCase(v[j]) < 0){
                 String a= v[i];
                 v[i]=v[j];
                 v[j]=a;
             }
         }
     }
 }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n=Integer.parseInt(sc.nextLine());
         String[] A=new String[n];
         for (int i = 0; i < n; i++) {
            String cadena;
            String [] line=sc.nextLine().split(" ");
            cadena=line[0];
            A[i]=new String(cadena);
         } 
         for (int i = 0; i < A.length; i++) {
             System.out.print(A[i]+"\t");
        }
    }
    
}
