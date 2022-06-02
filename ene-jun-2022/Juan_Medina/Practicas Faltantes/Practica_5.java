import java.io.PrintStream;
import java.util.Scanner;
public class Practica_5 {
    private static PrintStream printf;

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
          int numManos = sc.nextInt();
        
        for(int i=0; i<numManos; i++){
         int numCartas = sc.nextInt();
         String mano[] = new String[numCartas];
            
        for(int j=0; j<numCartas; j++){
         mano[j] = sc.next();
         
       }
        
        String mano_Ordenada[] = MergeSort(mano);
            
           for(int j=0; j<manoOrdenada.length; j++){
            printf = System.out.printf("%s ", mano_Ordenada[i]);
           }
            System.out.println();
        }
    }
    
    public static String[] MergeSort(String[] arr){
     if(arr.length ==1){
      return arr;
     }
        int mid = arr.length/2;
        
        String leftBefore[] = new String[mid];
        String rightBefore[] = new String[arr.length-mid];
        
        for(int i=0; i<mid; i++){
            leftBefore[i] = arr[i];
        }
        for(int i=0; i<rightBefore.length; i++){
            rightBefore[i] = arr[mid+1];
        }
        
        String left[] = MergeSort(leftBefore);
        String right[] = MergeSort(rightBefore);
        
        return Merge(left, right);
    }
    
    public static String[] Merge(String[] l, String[] r){
        int size_l = l.length;
        int point_l = 0;
        int size_r = r.length;
        int point_r = 0;
        String res[] = new String [size_l+size_r];
        int point_res = 0;
        
        char valores[] = {'A','2','3','4','5','6','7','8','9','T','J','Q','K'};
        char palos[] = {'E','C','T','D'};        
        
        while(point_l <size_l && point_r <size_r){
            
            int idxValorIzq=0;
            int idxPaloIzq=0;
            int idxValorDer=0;
            int idxPaloDer=0;
            for(int i=0; i<valores.length; i++){
                if(valores[i] == l[point_l].charAt(0)){
                    idxValorIzq = i;
                }
                if(valores[i] == r[point_r].charAt(0)){
                    idxValorDer = i;
                }
            }
            for(int i=0; i<palos.length; i++){
                if(palos[i] == l[point_l].charAt(1)){
                    idxPaloIzq = 1;
                }
                if(palos[i] == r[point_r].charAt(1)){
                    idxPaloDer = i;
                }
            }
            
            if(idxValorIzq < idxValorDer){
                res[point_res] = l[point_l];
                point_l++;
            }
            else if(idxValorIzq == idxValorDer){
                if(idxPaloIzq < idxPaloDer){
                    res[point_res] = l[point_l];
                    point_l++;
                }
                else{
                    res[point_res] = r[point_r];
                    point_r++;
                }
            }
            else{
                res[point_res] = r[point_r];
                point_r++;
            }
            
            point_res++;
        }
        
        
        while(point_l < size_l){
            res[point_res] = l[point_l];
            point_l++;
            point_res++;
        }
        
        
        while(point_r < size_r){
            res[point_res] = r[point_r];
            point_r++;
            point_res++;
        }
        
        return res;
    }
}