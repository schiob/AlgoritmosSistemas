import java.util.Scanner;
public class problema2{
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
           Scanner entrada1=new Scanner(System.in);
        String arr[];
         int n;
        int i;
        int j;
         System.out.println("Número de plumones");
        n=entrada.nextInt();
         arr=new String [n];
       for( i=0; i<n; i++){
           System.out.println("Nombre del plumon y dilución"+(":"));           
            arr[i]=entrada1.next();
              
       }
        System.out.println(" ");
       for(i = 0; i <arr.length; i++){
        System.out.print(arr[i]+"  ");
     System.out.println();  }
         
  
          System.out.println("Buscar el plumon "); 
        
      String buscar=entrada.next();            
    int resultado= busquedaBinaria(arr,0,arr.length-1,buscar);       
       if(resultado==-1)
           System.out.println("No se encuentra el plumon");
       else
            System.out.println("el plumon que busca: "+buscar+" se encuentra en la pocision: "+resultado);
         
    }

}
