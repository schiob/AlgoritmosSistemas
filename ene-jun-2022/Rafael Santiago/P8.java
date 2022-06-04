
package p8;
import java.util.Scanner;
public class P8 {

    static Scanner s = new Scanner(System.in);
    
    public static String[] quickSort(String[] x){
        if(x.length==1 || x.length==0){
            return x;
        }
        else{
            String[] izquierdo, derecho;
            int izq=0, der=0;
            String pivote=x[0];
            for (int i = 1; i < x.length; i++) {
                if(x[i].compareToIgnoreCase(pivote)<0){
                    izq++;
                }
                else{
                    der++;
                }
            }
            izquierdo = new String[izq];
            derecho = new String[der];
            izq=0;
            der=0;
            for (int i = 1; i < x.length; i++) {
                if(x[i].compareToIgnoreCase(pivote)<0){
                    izquierdo[izq]=x[i];
                    izq++;
                }
                else{
                    derecho[der]=x[i];
                    der++;
                }
            }
            
            String y[]=quickSort(izquierdo);
            String z[]=quickSort(derecho);
            int c=0;
            for (int i = 0; i < y.length; i++) {
                x[c]=y[i];
                c++;
            }
            x[c]=pivote;
            c++;
            for (int i = 0; i < z.length; i++) {
                x[c]=z[i];
            }
            return x;
        }
    }
    
    public static void main(String[] args) {
        String Medicamentos[];
        int c;
        System.out.println("¿Cuantas medicinas tiene?");
        c=Integer.parseInt(s.nextLine());
        Medicamentos=new String[c];
        for (int i = 0; i < c; i++) {
            System.out.println("Nombre del medicamento:");
            Medicamentos[i]=s.nextLine();
        }
        
        String arreglo = "[";
        for (int i = 0; i < Medicamentos.length; i++) {
            arreglo+=Medicamentos[i]+" ";
        }
        arreglo+="]";
        System.out.println("Antes de ordenar \n"+arreglo);
        
        String Ordenado[]=quickSort(Medicamentos);
        arreglo = "[";
        for (int i = 0; i < Ordenado.length; i++) {
            arreglo+=Ordenado[i]+" ";
        }
        arreglo+="]";
        System.out.println("Antes de ordenar \n"+arreglo);
    }
   }

