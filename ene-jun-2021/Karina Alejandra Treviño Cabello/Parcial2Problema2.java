import java.util.Scanner;
public class Parcial2Problema2{
public static void quicksort(String Arr[], int izq, int der) {
 String pivote=Arr[izq]; 
  int i=izq;    
  int j=der;     
  String aux;    
 
  while(i < j){ 
             
     while(Arr[i].compareTo(pivote)<=0 && i < j) i++; 
     while(Arr[j].compareTo (pivote)>0) j--;  

     if (i < j) {                 
         aux= Arr[i];  
         Arr[i]=Arr[j];
         Arr[j]=aux;
     }
   }
   
   Arr[izq]=Arr[j];               
   Arr[j]=pivote;   
   
   if(izq < j-1)  
      quicksort(Arr,izq,j-1);          
   if(j+1 < der)
      quicksort(Arr,j+1,der);       
   
}
public static int busquedaBinaria(String arr[], int inicio, int fin, String buscar){
 
  if(fin>=inicio){
   int mitad=(inicio+fin)/2;
    
        if(arr[mitad].equals(buscar)){
            return mitad;
    
    } 
        if(arr[mitad].compareTo(buscar)>0){
            return busquedaBinaria(arr, inicio,mitad-1,buscar);
   }
        else{
          return  busquedaBinaria(arr,mitad+1,fin,buscar);
        }
  }
   return -1;
   }
    public static void main(String[] args) {
          Scanner entrada=new Scanner(System.in);
        String arr[];
         int n;
        int i;
         System.out.println("Número de Canciones");
        n=entrada.nextInt();
         arr=new String [n];
       for( i=0; i<n; i++){
           System.out.println("Nombre de la canción "+(i+1)+(":"));           
            arr[i]=entrada.next();
       }       
           quicksort(arr,0,arr.length-1);
      System.out.print("Las Canciones ordenadas son:\n");
 
         for(i = 0; i <arr.length; i++)
         System.out.print(arr[i]+"  ");
      System.out.println();  
   
         for(i= 0; i <5; i++){
              System.out.println("Buscar la canción "+(i+1)+(":"));      
    String buscar=entrada.next();   
     
    int resultado= busquedaBinaria(arr,0,arr.length-1,buscar);       
       if(resultado==-1)
           System.out.println("No se encuentra la canción");
       else
            System.out.println("la canción que busca: "+buscar+" se encuentra en la pocision: "+resultado);
         
    }
    }
}
