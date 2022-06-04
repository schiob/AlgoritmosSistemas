
package ordinario;
import java.util.Scanner;

public class Ordinario {
    static Scanner s = new Scanner(System.in);
    
    public static int binarySearch(String[] x, int[] y, String nombre, int difuminación, int min, int max, int anterior){
        int mid = (int)((max+min)/2);
        boolean temp = false;
        String colores = "Rojo, Anaranjado, Amarillo, Verde, Indigo, Violeta, Azul";
        if(mid==anterior){
            mid++;
            temp=true;
        }
        if (colores.indexOf(x[mid]) == colores.indexOf(nombre) && y[mid] == difuminación){
            return mid;
        }
        else if((max - min == 1 && temp) || (max - min == 0)){
            return -1;
        }
        else{
            if(colores.indexOf(x[mid]) < colores.indexOf(nombre)){
                return binarySearch(x, y, nombre, difuminación, mid, max, mid);
            }
            else if (colores.indexOf(x[mid]) == colores.indexOf(nombre) && difuminación < y[mid]){
                return binarySearch(x, y, nombre, difuminación, mid, max, mid);
            }
            else{
                return binarySearch(x, y, nombre, difuminación, min, mid, mid);
            }
        }
    }
    
    public static String[] quickSort(String[] x){
       
        if(x.length==1 || x.length==0){
            return x;
        }
        else{
            String valor="Rojo Anaranjado Amarillo Verde Indigo Violeta Azul";
            String[] izquierdo, derecho;
            int izq=0, der=0;
            String n[]=new String[x.length];
            int d[]=new int[x.length];
            
            
                for (int i = 0; i < x.length; i++) {
                    String a[] = x[i].split("-");
                    n[i]=a[0];
                    d[i]=Integer.parseInt(a[1]);
                }
            String pivoteNom = n[0];
            int pivoteDil = d[0];
            for (int i = 1; i < x.length; i++) {
                if(valor.indexOf(n[i]) < valor.indexOf(pivoteNom)){
                    izq++;
                }
                else if(valor.indexOf(n[i]) == valor.indexOf(pivoteNom) && d[i] < pivoteDil){
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
                if(valor.indexOf(n[i]) < valor.indexOf(pivoteNom)){
                    izquierdo[izq] = n[i]+"-"+d[i];
                    izq++;
                }
                else if(valor.indexOf(n[i]) == valor.indexOf(pivoteNom) && d[i] < pivoteDil){
                    izquierdo[izq] = n[i]+"-"+d[i];
                    izq++;
                }
                else{
                    derecho[der] = n[i]+"-"+d[i];
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

        int c,cp,cd;
        String color,cdif[];
        System.out.println("¿Cuántos colores serán? Deben ser menos de 500.");
        cp=Integer.parseInt(s.nextLine());
        if(cp<500){
            cdif=new String[cp];
            for (int i = 0; i < cp; i++) {
                System.out.println("¿Qué color agregarás?\nRojo, Anaranjado, Amarillo, Verde, Indigo, Violeta, Azul");
                color=s.nextLine();
                System.out.println("¿Cuán difuminado está?");
                cd=Integer.parseInt(s.nextLine());
                cdif[i]=color+"-"+cd;
            }
            
        
        String arreglo = "";
        for (int i = 0; i < cdif.length; i++) {
            arreglo+=cdif[i]+"\n";
        }
        arreglo+="";
        System.out.println("Antes de ordenar:\n"+arreglo);
        
        cdif=quickSort(cdif);
        
        arreglo = "";
        for (int i = 0; i < cdif.length; i++) {
            arreglo+=cdif[i]+"\n";
        }
        arreglo+="";
        System.out.println("Después de ordenar:\n"+arreglo);
        
        System.out.println("¿Qué color buscas?");
        String cb=s.nextLine();
        System.out.println("¿Qué difuminación buscas?");
        int db=Integer.parseInt(s.nextLine());
        String col[]= new String [cdif.length];
        int di[]= new int[cdif.length];
            for (int i = 0; i < cdif.length; i++) {
                col[i]=cdif[i].split("-")[0];
                di[i]=Integer.parseInt(cdif[i].split("-")[1]);
            }
        System.out.println(binarySearch(col, di, cb, db, 0, col.length-1, 0));
        
        }else{
            System.out.println("No es posible imprimirlo ya que el número no corresponde.");
        }
        
    }

}
