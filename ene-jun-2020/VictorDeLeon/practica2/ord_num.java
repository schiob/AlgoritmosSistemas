package algoritmosdord;

import java.util.Arrays;


public class ord_num {  
    
           public static void main(String[] args) {     
    int [] a  = {2,43,2,5,4,334,23,123,323,45,34,23,43,46,78};
    int menor;

    for(int i = 0; i < 10; i++){
        menor = a[i];

        if (a[i] < menor){
            menor = a[i];
        }
        else{
            if (a[i] > menor){
              menor = menor;
            }      
        }
    }
    System.out.println(Arrays.toString(a));
}
}
