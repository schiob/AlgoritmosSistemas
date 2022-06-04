package p3;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class P3 {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
   
        int n, np[]=new int[20];
                        for (int i = 0; i < 20; i++) {
                            System.out.println("Captura el número pedido.");
                            np[i]=s.nextInt();
                        }       
                    String arreglo="[";
        for (int i = 0; i < 20; i++) {
        arreglo+=np[i]+" ";
        }
                        arreglo+="]";
            System.out.println("Antes de ordenar\n"+arreglo);
                    arreglo="";
    for (int i = 0; i < 20; i++) {
        for (int j = 0; j < 19; j++) {
            if(np[j+1]>np[j]){
                int temp=np[j+1];
                np[j+1]=np[j];
                np[j]=temp;
            }
        }
    }
        int m;
        arreglo+="[";
        for (int i = 0; i < 20; i++) {  
                if((np[i]%2)==0){
        arreglo+=np[i]+" ";
                }
        }
        arreglo+="]";
            System.out.println("Después de ordenar\n"+arreglo);
        
            }
    }   
    
        