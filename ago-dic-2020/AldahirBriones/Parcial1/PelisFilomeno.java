import java.util.*;
public class PelisFilomeno
{
    public static void main (String [] args)
    {
        Scanner f =  new Scanner (System.in);
        
        String [] Array = new String[5];
        Array[0]="Starwars";
        Array[1]="Alien";
        Array[2]="ASpaceOdissey";
        Array[3]="Matrix";
        Array[4]="BladeRunner";
        
        int [] hora = new int [5];
        hora[0]=2;
        hora[1]=1;
        hora[2]=2;
        hora[3]=2;
        hora[4]=1;
        
        int [] Min = new int [5];
        Min [0]= 1;
        Min [1]= 57;
        Min [2]= 41;
        Min [3]= 30;
        Min [4]= 57;
        
        int [] TTal = new int [5];
        TTal [0] = ((hora[0] * 60) + Min[0]);
        TTal [1] = ((hora[1] * 60) + Min[1]);
        TTal [2] = ((hora[2] * 60) + Min[2]);
        TTal [3] = ((hora[3] * 60) + Min[3]);
        TTal [4] = ((hora[4] * 60) + Min[4]);
      
        MergeSort mergeSort = new MergeSort();
        int arr [] = TTal;
        int n = arr.length;

        System.out.println("Array original:");
        for (int value : arr) 
        {
            System.out.print(value + " ");
        }

        System.out.println();

        System.out.println("Array ordenado:");
        mergeSort.sort(arr,0,n-1);
        mergeSort.printArray(arr);
        
    }  
}
