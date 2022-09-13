import java.util.Scanner;
public class Practica2 {

    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        
       int ndetareas, nminutos,suma=0;
        System.out.println("Por favor digita primero el numero de tareas y despues el numero de minutos ");
        ndetareas=s.nextInt();
        nminutos=s.nextInt();
        
        int[] tareas = new int[ndetareas];
        
        System.out.println("Por favor digite los minutos que se tarda cada tarea");
        
        for (int i = 0; i < ndetareas; i++) {
          
           tareas[i]=s.nextInt(); //solo para leer los datos
                     //ORDENAR
                                 
                    int x = i;
            for (int j = i; j >= 0; j--) {
                
                if(tareas[j]>tareas[x]){
                    int temporal = tareas[x];
                    tareas[x]=tareas[j];
                    tareas[j]=temporal;
                    x=j;
                }   
                    
            }
        }
        
        for (int i = 0; i < ndetareas; i++) {
            System.out.println(i+" "+suma);
            if ((suma+ tareas[i]) > nminutos) {
                System.out.println("El numero de tareas que hizo es de: "+ i);
                return;
            }
            
            suma+=tareas[i];
        }
        
        
        
        
        
    }
    
}
