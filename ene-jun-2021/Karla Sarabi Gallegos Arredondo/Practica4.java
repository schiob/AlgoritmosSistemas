package AlgoritmosDeOrdenamiento;
import java.util.Scanner;
public class Practica4 {
    
    static Scanner s = new Scanner(System.in);
    static Scanner s2 = new Scanner(System.in);

    public static void main(String[] args) {
        Objeto[] almacen;
        int n = s.nextInt();
        
        almacen = new Objeto[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Datos del objeto: ");
            String nom = s2.next();
            int x = s.nextInt();
            
            almacen[i] = new Objeto(nom, x);
        }
        
        for (int i = 0; i < almacen.length; i++) {
            for (int j = i+1; j < almacen.length; j++) {
                Objeto actual = almacen[i];
                if(almacen[i].getCantidad() < almacen[j].getCantidad()){
                    almacen[i]=almacen[j];
                    almacen[j]=actual;
                }
            }
        }
        
        for (int i = 0; i < almacen.length; i++) {
            System.out.print(almacen[i].toString());
        }
    }
}
