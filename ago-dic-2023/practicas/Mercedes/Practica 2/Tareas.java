import java.util.Scanner;

public class Tareas{

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        //n para leer numero de problemas de tarea y m minutos de tiempo
        int n=s.nextInt();
        int m=s.nextInt();


            //almacena los minutos en un arreglo
            int[] tiempo=new int[n];
            for (int i=0; i<n; i++){
                tiempo[i]=s.nextInt();
            }

            //ciclo for y while para ordenar la lista de prob usando Insertion Sort
            for(int i=1; i<n; i++){
                int j=i;
                while (j>0 && tiempo[j-1] > tiempo[j]) {
                    int temporal=tiempo[j];
                    tiempo[j]=tiempo[j-1];
                    tiempo[j-1]=temporal;
                    j--;
                }
            }

            int prealizados=0;
            int tiemporestante=m;

            //Calcula cuantos problemas se pueden hacer con el tiempo
            //disponible
            for (int i = 0; i <n; i++) {
                if (tiempo[i] <= tiemporestante) {
                    prealizados++;
                    tiemporestante-=tiempo[i];
                }
                else {
                    break; 
                }//cuando se acba el tiempo
            }
            System.out.println(prealizados);
            s.close();
    }

}