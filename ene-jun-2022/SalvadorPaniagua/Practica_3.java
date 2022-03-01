import java.util.Scanner;
public class Practica_3 {

public static void main(String[] args) {

	//int [] num = new int[20];

	//System.out.println("Ingresar arreglo");
        
		//for (int x=0;x<num.length;x++)
		//	  num[x] = (int) (Math.random()*50)+1;
		//for (int i=0; i<num.length; ++i) 
	        //System.out.print("[" + num[i] + "]");

	//	for (int i = 1; i < num.length; i++) {

	//int actual = num[i];

	//		int a = i-1;
	//	for(; a >= 0; a--) {
	//		if(actual > num[a]) {
	//			num[a+1] = num[a];
	//		}else {break;}

	//	}
	//	num[a+1] = actual;
		//}

	//System.out.println("\n \nArreglo completo y con pares"); 
    //for (int i=0; i<num.length; ++i) 
    //	 if (num[i] % 2 == 0)
       // System.out.print("[" + num[i] + "]");
//	}


//} 


  Scanner leer=new Scanner(System.in);
   int [] arr={3,43,2,5,4,6,5,4,334,45,23,123,323,45,34,23,43,5,46,78};
          int i=0;
        for(;i<arr.length;i++){
        	for (int a=i+1;a<arr.length;a++){
        		if (arr[i]%2==0)
        		if(arr[i]<arr[a]){
        			 int temp=arr[i];
        			 arr[i]=arr[a];
                        }
        	}
        }

System.out.println("\n \nArreglo completo y con pares"); 
             for(i=0;i<arr.length;i++){
        	     if (arr[i]%2==0) {
        	    	 System.out.print(arr[i]+" ");
        	     }
             }
   }
} 