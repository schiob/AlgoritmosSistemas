package parcial1;
import java.util.Scanner;
import java.util.Arrays;
public class Parcial1 {
public static void main(String[] args) {
    final int numero_peliculas=5;
      int hrs_minutos[]=new int [numero_peliculas];
        rellenarArray(hrs_minutos);
     String nombre_peliculas[]={"Starwars","Alien","ASpaceOdyssey","Matrix","BladeRunner"};
       System.out.println("peliculas sin ordenar:");
        imprimirArray(hrs_minutos);
        burbuja(hrs_minutos);
 System.out.println("Array de peliculas ordenadas:");
        imprimirArray(hrs_minutos);
       System.out.println("Array de String sin ordenar:");
        imprimirArray(nombre_peliculas);
       burbujapeliculas (nombre_peliculas);
 System.out.println("Array de String ordenado:");
        imprimirArray(nombre_peliculas);
    }
 
    public static void imprimirArray (int hrs_minutos[]){
        for(int i=0;i<hrs_minutos.length;i++){
            System.out.println(hrs_minutos[i]);
        }
    }
 
    public static void imprimirArray (String hrs_minutos[]){
        for(int i=0;i<hrs_minutos.length;i++){
            System.out.println(hrs_minutos[i]);
        }
    }
 
    public static void rellenarArray (int hrs_minutos[]){
        for(int i=0;i<hrs_minutos.length;i++){
            hrs_minutos[i]=Proyecta();
        }
    }
 
 
    public static void burbuja (int hrs_minutos[]){
        int cuentaintercambios=0;
        
        for (boolean ordenado=false;!ordenado;){
            for (int i=0;i<hrs_minutos.length-1;i++){
                if (hrs_minutos[i]>hrs_minutos[i+1]){
                    
                    int variableauxiliar=hrs_minutos[i];
                    hrs_minutos[i]=hrs_minutos[i+1];
                    hrs_minutos[i+1]=variableauxiliar;
                    
                    compara++;
                }
            }
            
            if (compara==0){
                ordenado=true;
            }
           
            compara=0;
        }
    }
 
    public static void burbujapeliculas(String nombre_pelicula[]){
        boolean ordenado=false;
        int comparacion=0;
       
        while(!ordenado){
            for(int i=0;i<nombre_pelicula.length-1;i++){
                if (nombre_pelicula[i].compareToIgnoreCase(nombre_pelicula[i+1])>0){
                    
                    String aux=nombre_pelicula[i];
                    nombre_pelicula[i]=nombre_pelicula[i+1];
                    nombre_pelicula[i+1]=aux;
                    
                    compara++;
                }
            }
           
            if (compara==0){
                ordenado=true;
            }
            compara=0;
        }
 
    }
}
       
    
    
    
    
   
    
        

  
  
    
    
    
    
    
    
    
 
      
    