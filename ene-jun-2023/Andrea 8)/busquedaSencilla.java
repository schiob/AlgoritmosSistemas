package algoritmos;
import java.util.*;
/**
 * Fecha: 08 de mayo de 2023
 * @author Luz Andrea
 */
public class busquedaSencilla {
    
    public static void main(String[] args) {
        Scanner e= new Scanner (System.in);//Objeto de enteros
        Scanner s=new Scanner(System.in);//Objeto de string
        int n,pos=0;
        String x;
        boolean encontrada;
        System.out.print("¿Cuantos libros hay?: ");
        n=e.nextInt();
        
        System.out.println("¿Cual deseas buscar?");
        x=s.nextLine();
        
        System.out.println("Libros en la cuerda");
        String array[]=new String[n];
        for (int i = 0; i <array.length; i++) {
            array[i]=s.nextLine();
        }
        
        for (int i=0; i<array.length; i++) {
            if(x.equals(array[i])){
                pos=i;
                encontrada = true;
            }else
                encontrada=false;
        }
        
        if(encontrada=true){
                System.out.println("["+pos+"]");
        }
        else
            System.out.println("-1");
            
    }
    
}
