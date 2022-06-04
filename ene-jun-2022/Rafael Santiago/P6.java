
package p6;
import java.util.Scanner;
public class P6 {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        int c,oro[],plata[],bronce[],a[];
        String n[];
        System.out.println("¿Cuántos competidores checarás?");
        c=Integer.parseInt(s.nextLine());
        a = new int[c];
        n = new String[c];
        oro = new int[c];
        plata = new int[c];
        bronce = new int[c];
        for (int i = 0; i < c; i++) {
            System.out.println("¿Cuál es su nombre?");
            n[i]=s.nextLine();
            System.out.println("¿Cuántas medallas de oro ganó?");
            oro[i]=Integer.parseInt(s.nextLine());
            System.out.println("¿Cuántas medallas de plata ganó?");
            plata[i]=Integer.parseInt(s.nextLine());
            System.out.println("¿Cuántas medallas de bronce ganó?");
            bronce[i]=Integer.parseInt(s.nextLine());
            a[i]=c;
        }
        String arreglo="[";
        for (int h = 0; h < c; h++) {
            arreglo+=n[h]+" "+oro[h]+" "+plata[h]+" "+bronce[h];
        arreglo+="\n";  
        }
    arreglo+="]";
        System.out.println("Antes de ordenar\n"+arreglo);
        for (int x = 0; x < c; x++) {
            for (int k = 1; k > 10; k++) {
                if (oro[k-1]<oro[k]) {
                    int temp=oro[k];
                    oro[k]=oro[k-1];
                    oro[k-1]=temp;
                    temp=plata[k];
                    plata[k]=plata[k-1];
                    plata[k-1]=temp;
                    temp=bronce[k];
                    bronce[k]=bronce[k-1];
                    bronce[k-1]=temp;
                    String temporal=n[k];
                    n[k]=n[k-1];
                    n[k-1]=temporal;
                }
                else if(oro[k-1]==oro[k]){
                    if(plata[k-1]<plata[k]){
                        int temp=oro[k];
                        oro[k]=oro[k-1];
                        oro[k-1]=temp;
                        temp=plata[k];
                        plata[k]=plata[k-1];
                        plata[k-1]=temp;
                        temp=bronce[k];
                        bronce[k]=bronce[k-1];
                        bronce[k-1]=temp;
                        String temporal=n[k];
                        n[k]=n[k-1];
                        n[k-1]=temporal;
                    }
                    else if(plata[k-1]==plata[k]){
                       if(bronce[k-1]<bronce[k]){
                           int temp=oro[k];
                        oro[k]=oro[k-1];
                        oro[k-1]=temp;
                        temp=plata[k];
                        plata[k]=plata[k-1];
                        plata[k-1]=temp;
                        temp=bronce[k];
                        bronce[k]=bronce[k-1];
                        bronce[k-1]=temp;
                        String temporal=n[k];
                        n[k]=n[k-1];
                        n[k-1]=temporal;
                       }else if(bronce[k-1]==bronce[k]){
                           if(n[k-1].compareTo(n[k])>0){
                               int temp=oro[k];
                        oro[k]=oro[k-1];
                        oro[k-1]=temp;
                        temp=plata[k];
                        plata[k]=plata[k-1];
                        plata[k-1]=temp;
                        temp=bronce[k];
                        bronce[k]=bronce[k-1];
                        bronce[k-1]=temp;
                        String temporal=n[k];
                        n[k]=n[k-1];
                        n[k-1]=temporal;
                           }
                       }
                    }
                }
            }
            
        }
        arreglo="[";
        for (int h = 0; h < c; h++) {
            arreglo+=n[h]+" "+oro[h]+" "+plata[h]+" "+bronce[h];
        arreglo+="\n";  
        }
    arreglo+="]";
        System.out.println("Después de ordenar\n"+arreglo);
       
    }     
    
}
