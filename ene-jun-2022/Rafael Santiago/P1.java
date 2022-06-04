package p1;
import java.util.Scanner;
public class P1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, y;
        do{
            System.out.println("Ingresa el 1er valor, tiene que ser mayor a -100");
            x=s.nextInt();
            System.out.println("Ingresa el 2do valor, tiene que ser menor a 100");
            y=s.nextInt();
            if(x>=-100 && y<=100){
                int suma=x+y;
                System.out.println("Ingresaste "+x+" y "+y);
                System.out.println("Tu valor es "+suma);
                break;
            }else{
                System.out.println("No es posible responderte");
            }
        }while(true);
    }    
}
