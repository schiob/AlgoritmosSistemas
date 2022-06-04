
package p4;
import java.util.Scanner;
public class P4 {

    public static void main(String[] args) {
    String l, f, a[], x, arreglo;
    int c;
        Scanner s = new Scanner(System.in);
        System.out.println("Cantidad de medicamentos");
        c=Integer.parseInt(s.nextLine());
        a = new String[c];
        for (int i = 0; i < c; i++) {
            System.out.println("Introduce los medicamentos:");
            l=s.nextLine();
            a[i]=l;
        }
        for (int h = 0; h < c; h++) {
            for (int j = 1; j < c; j++) {
                if(a[j-1].length() > a[j].length()){
                    String nom=a[j-1];
                    a[j-1]=a[j];
                    a[j]=nom;
                }
            }
        }
            arreglo="";
            for (int v = 0; v < c; v++) {
            arreglo+=a[v]+" ";
        }
        System.out.println("\n"+arreglo);
    }
}
    
    
    

