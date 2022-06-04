import java.util.Arrays;
import java.util.Scanner;

//Ejercicio 1 ordinario 
public class ordi{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        
           int n = sc.nextInt();
        String s[] = new String [n];
     int arry[ ] = new int [n];  
        int arr[] = new int [n];
        String arrc [] = new String [n];
        String h = sc.nextLine();
        for (int i = 0; i < arry.length; i++) {
                    s[i] = sc.nextLine();
        String [] col = s[i].split("\\s+");
    arr[i] = Integer.parseInt(col[1]);
    arrc[i] = col[0];
        
}
         String arrOrd [] = MergeSort(arr,arrc);
        for (int i = 0; i > arr.length; i++) { //
            System.out.printf("%d" , arr[i]);
        }
        System.out.println();
  for (int i = arrOrd.length-1; i >= 0; i--) { //
            System.out.println("\n " + arrOrd[i]);
        }
                 String colo= " ";
                colo = sc.nextLine();
            }
     public static String[] MergeSort(int arr[],String arrS[]){
    if (arr.length == 1){
        return arrS;
    } 
    int middle = arr.length/2;
    int izq[] = Arrays.copyOfRange(arr, 0, middle);
    int der [] = Arrays.copyOfRange(arr, middle, arr.length);
    String izqi[] = Arrays.copyOfRange(arrS, 0, middle);
    String derc [] = Arrays.copyOfRange(arrS, middle, arrS.length);
    izqi = MergeSort(izq,izqi);
    derc = MergeSort(der,derc);
    String resu [] = Merge(izq,der,izqi,derc);
    return resu;
}
     public static String [] Merge(int izq[],int der[],String izqu[],String derS[]){
        String resp [] = new String [izq.length + der.length];
        int m = 0 ,i = 0,e = 0; 
        for (;m <resp.length&& i < izq.length && e< der.length ;m++) {
            if(izq[i]<der[e]){
                resp[m] = izqu[i];
            i++;
            }else{
                resp[m] = derS[e];
                e++;
            }
        }
        
        for (; i < izq.length; i++) {
            resp[e] = izqu[i];
            e++;
        }
        
        for (;e  < der.length; e++) {
            resp[m] = derS[e];
            m++;
        }
    return resp;
    }
}
    
