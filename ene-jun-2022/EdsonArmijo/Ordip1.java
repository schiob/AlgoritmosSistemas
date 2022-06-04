package Algoritmos;
import java.util.Scanner;
public class Ordip1 {
    static Scanner s = new Scanner(System.in);
    
    public static String[] quickSort(String[] x){
        if(x.length == 1 || x.length == 0){
            return x;
        }
        else{
            String colores = "Rojo, Anaranjado, Amarillo, Verde, Indigo, Violeta, Azul";
            String[] izquierdo, derecho;
            int izq = 0, der = 0;
            String nombre[] = new String[x.length];
            int dilucion[] = new int[x.length];
            
            for (int i = 0; i < x.length; i++) {
                String a[] = x[i].split("-");
                nombre[i]=a[0];
                dilucion[i]=Integer.parseInt(a[1]);
            }
            
            String pivoteNom = nombre[0];
            int pivoteDil = dilucion[0];
            for (int i = 1; i < x.length; i++) {
                if(colores.indexOf(nombre[i]) < colores.indexOf(pivoteNom)){
                    izq++;
                }
                else if(colores.indexOf(nombre[i]) == colores.indexOf(pivoteNom) && dilucion[i] < pivoteDil){
                    izq++;
                }
                else{
                    der++;
                }
            }
            
            izquierdo = new String[izq];
            derecho = new String[der];
            izq = 0;
            der = 0;
            for (int i = 1; i < x.length; i++) {
                if(colores.indexOf(nombre[i]) < colores.indexOf(pivoteNom)){
                    izquierdo[izq] = nombre[i]+"-"+dilucion[i];
                    izq++;
                }
                else if(colores.indexOf(nombre[i]) == colores.indexOf(pivoteNom) && dilucion[i] < pivoteDil){
                    izquierdo[izq] = nombre[i]+"-"+dilucion[i];
                    izq++;
                }
                else{
                    derecho[der] = nombre[i]+"-"+dilucion[i];
                    der++;
                }
            }
            
            String y[] = quickSort(izquierdo);
            String z[] = quickSort(derecho);
            int c = 0;
            for (int i = 0; i < y.length; i++) {
                x[c] = y[i];
                c++;
            }
            x[c] = pivoteNom+"-"+pivoteDil;
            c++;
            for (int i = 0; i < z.length; i++) {
                x[c] = z[i];
                c++;
            }
            return x;
        }
    }
    
    public static void main(String[] args) {
        String entrada[];
        int n = Integer.parseInt(s.nextLine());
        entrada = new String[n];
        for (int i = 0; i < n; i++) {
            entrada[i] = s.nextLine();
        }
        
        String x[] = quickSort(entrada);
        
        System.out.println();
        for (int i = 0; i < entrada.length; i++) {
            System.out.println(x[i]);
        }
    }
    
}