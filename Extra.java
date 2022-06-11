
package extra;
import java.util.Scanner;
public class Extra {
    Scanner s = new Scanner(System.in);
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
                    String a[] = x[i].split(" ");
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
                    izquierdo[izq] = n[i]+" "+d[i];
                    izq++;
                }
                else if(valor.indexOf(n[i]) == valor.indexOf(pivoteNom) && d[i] < pivoteDil){
                    izquierdo[izq] = n[i]+" "+d[i];
                    izq++;
                }
                else{
                    derecho[der] = n[i]+" "+d[i];
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
            x[c] = pivoteNom+" "+pivoteDil;
            c++;
            for (int i = 0; i < z.length; i++) {
                x[c] = z[i];
                c++;
            }
            return x;
        }
    
}

    public void main(String[] args) {
        int c,cp,pagina;
        String nombre,cdif[];
        System.out.println("¿Cuántos colores serán? Deben ser menos de 500.");
        cp=Integer.parseInt(s.nextLine());
        if(cp<500){
            cdif=new String[cp];
            for (int i = 0; i < cp; i++) {
                System.out.println("¿Como se llama?");
                nombre=s.nextLine();
                System.out.println("¿Cuántas paginas tiene?");
                pagina=Integer.parseInt(s.nextLine());
                cdif[i]=nombre+" "+pagina;
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
        
    }
    }    
}
