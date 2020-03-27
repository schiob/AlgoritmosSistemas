import java.util.*;
//shell sort
public class pract7{
    
    public static void main(String args[]){
    pract7 metodo = new pract7();
    Scanner consola = new Scanner(System.in);
    
            int n=0;        
            do {  //introducir numero de colores verificando si 2<=n<=1000
            	n=consola.nextInt();
            }while(n<=2 && n>=1000);
            
            
            int []i= new int[n];
            for(int j=0;j<i.length;j++){  //introducir colores verificando si 0<=i<=500
            	do { 	
            		i[j]=consola.nextInt();
            	}while(i[j]<=0 && i[j]>=500);
            }

            i=metodo.shellSort(i,n);

            for(int j=0;j<i.length;j++){
                System.out.print(i[j]+ " ");
            }
            
    }//cierre de main 

    public int []shellSort(int []array,int comp){
        if(array.length>1){
        int sell=comp;
        int aux=0,retro=0;
    while(sell>0){
        sell/=2;

            for(int i=0;i<array.length-sell;i++){
            	
             if(array[sell+i]<array[i]){
                aux=array[i];
                array[i]=array[sell+i];
                array[sell+i]=aux;
                
                     if(i-sell > -1){
                    	 
                        while(array[i-retro]<array[(i-sell)-retro]){
                  
                        aux=array[(i-sell)-retro];
                        array[(i-sell)-retro]=array[i-retro];
                        array[i-retro]=aux;
                        retro++;
                        
                        }
                        
                        retro=0;
                }
             }
             else {
            	 
             }
            }//end for
        

        }
    }//end if
        return array;
    }//end metodo


}//cierre de clase
