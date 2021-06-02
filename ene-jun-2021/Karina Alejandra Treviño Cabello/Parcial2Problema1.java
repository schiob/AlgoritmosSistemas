public class Parcial2Problema1 {  
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
      java.util.Scanner entrada=new java.util.Scanner (System.in);  
   
   String arr[];
         int n;
        int i;
         System.out.println("Numero de libros");
        n=entrada.nextInt();
         arr=new String [n];
       for( i=0; i<n; i++){
           System.out.println("Nombre del libro "+(i+1)+(":"));           
            arr[i]=entrada.next();
       }       
        
      System.out.print("Las libros son:\n");
 
         for(i = 0; i <arr.length; i++)
         System.out.print(arr[i]+"  ");
      System.out.println();  
   
         for(i= 0; i <1; i++){
              System.out.println("Buscar el libro "+(i+1)+(":"));      
    String buscar=entrada.next();   
     
    int resultado= busquedaBinaria(arr,0,arr.length-1,buscar);       
       if(resultado==-1)
           System.out.println("No se encuentra el libro");
       else
            System.out.println("el libro que busca: "+buscar+" se encuentra en la pocision: "+resultado);
         
    }
    }
}
