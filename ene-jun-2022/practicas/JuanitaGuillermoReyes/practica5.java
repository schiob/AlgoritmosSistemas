
import java.util.Scanner;
public class practica5 {
    public static void main (String args []) {
        Scanner s =new Scanner(System.in);
        int numManos = s.nextInt();

        for(int i=0; i< numManos; i++){
            int numCartas = s.nextInt();
            String mano[]= new String[numCartas];
             
            for (int j = 0;j< numCartas;j++){
                
                mano[j]= s.next();

           
         }
         String manoOrdenada[]= MergeSort(mano);

         for(int j=0; j<manoOrdenada.length;j++){
             System.out.printf("%s", manoOrdenada[j]);
         }
         System.out.println();
        }
    }
     public static String[] MergeSort(String [] arr){
         if(arr.length== 1){
          return arr;
         }
         int mid = arr.length / 2;
         String leftBefore[]= new String[mid];
         String rightBefore[]=new String[arr.length-mid];

         for(int i=0;i<mid;i++){
             leftBefore[i] = arr[i];
         }
         for(int i=0;i<rightBefore.length; i++){
            rightBefore[i] = arr[mid+1];
     }
        String left[]=MergeSort(leftBefore);
        String right[]=MergeSort(rightBefore);

        return Merge(left,right);
     }
     public static String [] Merge(String [] l, String[] r){
        int size_l = l.length;
        int point_l =0;
        int size_r = r.length;
        int point_r=0;
        String res[]= new String [size_l*size_r];
        int point_res =0;

        char valores[ ]= {'A','2','3','4','5','6','7','8','9','T','J','Q','K'};
        char palos[] = {'E','C','T','D'};

        while(point_l <size_l && point_r <size_r) {
            
            int idxvalorizq =0;
            int idxpaloizq= 0;
            int idxvalorder =0;
            int idxpaloder=0;
            for(int i =0 ; i< valores.length;i++){
                if(valores[i]==l[point_l].charAt(0)){
                    idxvalorizq =i;
                }
                if (valores[i]== r[point_r].charAt(0)){
                    idxvalorder=i;
                }
            }
            for(int i =0;i<palos.length;i++){
                if(palos[i] == l[point_l].charAt(1)){
                    idxpaloizq=i;
                }
                if(palos[i]==r[point_r].charAt(1)){

                }
            }
            if(idxvalorizq < idxvalorder){
                res[point_res]=l[point_l];
                point_l++;
           
         }
          else if (idxvalorizq == idxvalorder){
              if(idxpaloizq < idxpaloder){
                  res[point_res]=l[point_l];
                  point_l++;

              }
              else{
                  res[point_res]=r[point_r];
                  point_r++;
              }
          }
          else{
              res[point_res]=r[point_r];
              point_r++;
          }
          point_res++;
        }
        while (point_l <size_l){
            res[point_res]=l[point_l];
            point_l++;
            point_res++;
        }
        while (point_r <size_r){
            res[point_res]=r[point_r];
            point_r++;
            point_res++;
    }
return res;
}
}


    
