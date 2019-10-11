package parcial_1;
import java.util.*;
public class par1 {
    public static void main (String[]args){
    
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
    public static void ordenacionMergeSort(int vec[]){
        if(vec.length<=1) return;
        int mitad= vec.length/2;
        int izq[]=Arrays.copyOfRange(vec, 0, mitad);
        int der[]=Arrays.copyOfRange(vec, mitad, vec.length);
        ordenacionMergeSort(izq);
        ordenacionMergeSort(der);       
        combinarVector(vec, izq, der);
}

public static void combinarVector(int v[], int izq[],int der[]){
        int i=0;
        int j=0;
        for(int k=0;k<v.length;k++){
                if(i>=izq.length){
                        v[k]=der[j];
                        j++;
                        continue;
                }
                if(j>=der.length){
                        v[k]=izq[i];
                        i++;
                        continue;
                }
                if(izq[i]<der[j]){
                        v[k]=izq[i];
                        i++;
                }else{
                        v[k]=der[j];
                        j++;
                }
        }
}
}
