
import java.util.Scanner;


public class panchitoYsusRegalosCorre {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String [] datos,datos1;
        int n = 0,ando = 0;
        //numero de elementos
        datos1 = s.nextLine().split("\\s+");
        n = Integer.parseInt(datos1[0]);
        String dataBus = datos1[1];
        //depuro la s

        //defino mi arreglo de objetos
        Regalo ob [] = new Regalo[n];
        for (int i = 0; i < ob.length; i++) {
            //le meto sus respectivos datos con un split
            datos = s.nextLine().split("\\s+");
            //respectivos parametros a mi objeto nombre en 0 entero en 1
        ob[i] = new Regalo(datos[0],Integer.parseInt(datos[1]));
        if(ob[i].getRegalo().equals(dataBus)){
            ando = ob[i].getNumero();
        }else continue;
        }
        System.out.println(binarySearch(ob,0,ob.length-1, ando));
    }
    
    public static int binarySearch(Regalo[]arr,int inicio,int fin, int buscando){
    int mitad = (inicio+fin)/2;
    if(arr[mitad].getNumero() == buscando){
        return mitad;
    }
    if(inicio == fin){
        return -1;
    }
    if(arr[mitad].getNumero() < buscando){
        return binarySearch(arr,mitad+1,fin,buscando);
    }else{
        return binarySearch(arr,inicio,mitad-1,buscando);
    }
}
}
