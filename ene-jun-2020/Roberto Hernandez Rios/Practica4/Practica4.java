
package algoritmos;
import java.util.Scanner;
public class Practica4 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        
        int m = entrada.nextInt();
        
        for (int i = 0; i < m; i++) {
            int n = entrada.nextInt();
            
            String cartas [] = new String[n];
            String cartasOrd[]= new String[n];
            
            for (int j = 0; j < n; j++) {        
                cartas[j] = entrada.next();
                cartasOrd[j] = cartas[j].replace('A','1').replace('T', 'L').replace('J', 'M').replace('Q', 'N').replace('K', 'O').replace('E', 'G').replace('C', 'H').replace('D', 'P');
            }
            
            String cartasOrd2 [] = MergeSort(cartasOrd);
            
            for (int j = 0; j < n; j++) {
                cartasOrd2[j] = cartasOrd2[j].replace('1','A').replace('L', 'T').replace('M', 'J').replace('N', 'Q').replace('O', 'K').replace('G', 'E').replace('H', 'C').replace('P', 'D');
                System.out.print(cartasOrd2[j]+' ');
            }
            
            System.out.println();
        }
    }
    
    
    public static String[] MergeSort(String[] a){
       if (a.length == 1) {
           return a;
       }
       int mid = a.length/2;
       String leftBefore[] = new String[mid];
       String rightBefore[] = new String[a.length-mid];
       for (int i = 0; i < mid; i++) {
           leftBefore[i]=a[i];
       }
       for (int i = 0; i < rightBefore.length; i++) {
           rightBefore[i]=a[mid+i];
       }
       String []left = MergeSort(leftBefore);
       String []right = MergeSort(rightBefore);
       return Merge(left,right);
   }
   public static String[] Merge(String[] l,String[] r){
       int size_l = l.length;
       int point_l = 0;
       int size_r = r.length;
       int point_r = 0;
    
       String res[] = new String[size_l+size_r];
       int point_res = 0;
       while(point_l < size_l && point_r < size_r){
           
           if ((int)(l[point_l].charAt(0)) < (int)(r[point_r].charAt(0))) {
               res[point_res] = l[point_l];
               point_l++;
           }
           else if((int)(l[point_l].charAt(0)) == (int)(r[point_r].charAt(0))){
               if((int)(l[point_l].charAt(1)) < (int)(r[point_r].charAt(1))){
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
       return  res;
   }
}
