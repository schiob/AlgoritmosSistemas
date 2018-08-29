
package algoritmos;


public class Algoritmos {

    public static void main(String[] args) {

        String[]nombres={"Juan","Juan","Pepe","Ana"};
int n=0;
String Nombrepopular="";
         
            for (int i = 0; i <nombres.length; i++) {
            int contador=0;
            
             
            for (int j = 0; j < nombres.length; j++) {
                 if (nombres[i]==nombres[j]){
                     contador++;
                 }
                 if(contador>n){
                     Nombrepopular=nombres[i];
                 }
                 n=contador;
             }
        }
         System.out.println("El Nombre mas Popular es:"+Nombrepopular + "\t"+ "Numero de Veces:"+ n );

        
    }
}
