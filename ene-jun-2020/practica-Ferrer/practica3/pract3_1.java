import java.util.Scanner;

public class pract3_1 {


	public static void main(String args[]) {
        Scanner consola = new Scanner(System.in);
        //bouble sort
        int n=0;    
        int aux=0;
        String aux2=" ";
        int recorridos=0;        
        //
        String palabras="";
        
        if(1>n && n<100) {
        n = consola.nextInt();
        n=n+1;
        }
        //arreglos_num/letras
        String []words = new String [n];
        int []num = new int[n];
        
        //ingresar_medicinas
        for(int i=0;i<words.length;i++) {
            
            words[i]=consola.nextLine();
            
            //numero_de_letras
            
                num[i]=words[i].length();                
        }
        ///ordenar
        for(int i=1; i<num.length;i++) {
            int j=0;
            int h=1;
            while(h!=num.length) {
                
                if(num[h]<num[j]) {
                    aux=num[h];
                        aux2=words[h];
                    num[h]=num[j];
                        words[h]=words[j];
                    num[j]=aux;
                        words[j]=aux2;
                }
                else {
                    if(num[h]==num[j]) {
                        if(words[j].compareTo(words[h])>0) {
                            aux2=words[h];
                            words[h]=words[j];
                            words[j]=aux2;
                        }
                    }
                    
                }
                    j++;
                    h++;
            }//while
                         
            }//for
                
    for(int i=1;i<n;i++) {
        System.out.println(words[i]);
    }    
    }//cierre de main
}
