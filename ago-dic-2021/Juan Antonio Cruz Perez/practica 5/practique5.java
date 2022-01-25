import java.util.Arrays;
import java.util.Scanner;


public class practique5 {
    public static void main(String[] args) {
        Scanner l = new  Scanner(System.in);
        
        //cuantos libros son
        int n = l.nextInt();
        String s[] = new String [n];
int arr [ ] = new int [n];  
        int arrI[] = new int [n];
        String arrS [] = new String [n];
        String h = l.nextLine();
        for (int i = 0; i < arr.length; i++) {
                    s[i] = l.nextLine();
        String [] librosc = s[i].split("\\s+");
    arrI[i] = Integer.parseInt(librosc[1]);
    arrS[i] = librosc[0];
        }


        String arrOrd [] = MergeSort(arrI,arrS);
        for (int i = 0; i < arrI.length; i++) {
            System.out.printf("%d" , arrI[i]);
        }
        System.out.println();
        for (int i = 0; i < arrOrd.length; i++) {
            System.out.printf("\n " + arrOrd[i]);         
        }
    }
    
    
    
    public static String[] MergeSort(int arr[],String arrS[]){
    if (arr.length == 1){
        return arrS;
    } 
    int middle = arr.length/2;
    int izq[] = Arrays.copyOfRange(arr, 0, middle);
    int der [] = Arrays.copyOfRange(arr, middle, arr.length);
    String izqS[] = Arrays.copyOfRange(arrS, 0, middle);
    String derS [] = Arrays.copyOfRange(arrS, middle, arrS.length);
    
    izqS = MergeSort(izq,izqS);
    derS = MergeSort(der,derS);
    
    String res [] = Merge(izq,der,izqS,derS);
    
    return res;
    
    
    
    }
    
    public static String [] Merge(int izq[],int der[],String izqS[],String derS[]){
        String res [] = new String [izq.length + der.length];
        
       int r = 0 ,i = 0,d = 0; 
        for (;r <res.length&& i < izq.length && d< der.length ;r++) {
            if(izq[i]<der[d]){
                res[r] = izqS[i];
            i++;
            }else{
                res[r] = derS[d];
                d++;
            }
        }
        
        for (; i < izq.length; i++) {
            res[r] = izqS[i];
            r++;
        }
        
        for (;d  < der.length; d++) {
            res[r] = derS[d];
            r++;
        }
    return res;
    }
    
    
    
}
