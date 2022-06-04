
package p9;
import java.util.Scanner;
public class P9 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    int Num[], c;
        System.out.println("¿Cuantos lapices hay?");
        c=Integer.parseInt(s.nextLine());
        Num=new int[c];
        for (int i = 0; i < c; i++) {
            System.out.println("Numero de lapiz:");
            Num[i]=Integer.parseInt(s.nextLine());
        }
        
        int max=0;
        for (int i = 0; i < Num.length; i++) {
            if (Num[i]>max){
                max=Num[i];
            }
        }
        for (int i = 0; i < Num.length; i++) {
            System.out.print(Num[i]+" ");
        }
        System.out.println("");
        
        int maxlength=0;
        for (int i = 0; i < Num.length; i++) {
            if((Num[i]+"").length()>maxlength){
                maxlength=(Num[i]+"").length();
            }
        }
        
        int bucket[][]=new int[10][Num.length], elementos[]=new int [10];
            int cifra=1;
            for (int i = 0; i < maxlength; i++) {
                for (int j = 0; j < Num.length; j++) {
                    int valor=(Num[j]/cifra)%10;
                    bucket[valor][elementos[valor]]=Num[j];
                    elementos[valor]++;
                }
                
                int index=0;
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < elementos[j]; k++) {
                        Num[index]=bucket[j][k];
                        index++;
                    }
                    elementos[j]=0;
                }
                cifra*=10;
            }
        
        for (int i = 0; i < Num.length; i++) {
            System.out.print(Num[i]+" ");
        }
        System.out.println("");
    }
    
}
