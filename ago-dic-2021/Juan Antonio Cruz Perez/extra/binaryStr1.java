
import java.util.Scanner;


public class binaryStr1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String [] datos;
     
        int n = 0;
        //numero de elementos
        datos = s.nextLine().split("\\s+");
        n = Integer.parseInt(datos[0]);
        String dataBus = datos[1];
      String datos1[] = new String[n];

      datos1 = s.nextLine().split("\\s+");
        
        System.out.println(binarySearch(datos1,0,datos1.length-1, dataBus));
    }
    
        public static int binarySearch(String[]arr,int inicio,int fin, String buscando){
    int mitad = (inicio+fin)/2;
    if(arr[mitad].equalsIgnoreCase(buscando)){
        return mitad;
    }
    if(inicio == fin){
        return -1;
    }
    if(arr[mitad].compareToIgnoreCase(buscando) < 0){
        return binarySearch(arr,mitad+1,fin,buscando);
    }else{
        return binarySearch(arr,inicio,mitad-1,buscando);
    }
}
}
