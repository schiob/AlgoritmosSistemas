
package salon;
import java.util.Scanner;
public class mergeSort {

    public static void main(String[] args) {
        int n=0;
        String m="";
        Scanner s = new Scanner(System.in); 
        
        System.out.print("Cuantas palabras quiere ingresar?");
        n=s.nextInt();
        m=s.nextLine();
        
        String[] pal= new String[n];
        for(int l=0;l<n;l++){
            pal[l]=s.nextLine();}        
        
        pal=merSort(pal);
        for(int i=0; i<pal.length ; i++){
            System.out.println(pal[i]+ " ");
        }
    }
    
    public static String[] merSort(String[] desord){
        int i, j, k;
        if(desord.length>1){
            int nElementosIzq = desord.length / 2;
            int nElementosDer = desord.length - nElementosIzq;
            String arrIzq[]=new String[nElementosIzq];
            String arrDer[]=new String[nElementosDer];
            
            //Copiando elementos del primer array al arreglo izquierdo
            for( i=0; i<nElementosIzq ; i++){
                arrIzq[i] = desord[i];
                }
            
            //Copiando elementos del primer array al arreglo derecho
            for(i=nElementosIzq;i<nElementosIzq + nElementosDer;i++){
                arrDer[i - nElementosIzq] = desord[i];
            }
            
            //Recursividad para dividir los arreglos en mas pequeños
            arrIzq=merSort(arrIzq);
            arrDer=merSort(arrDer);
            
            i=0;
            j=0;
            k=0;
            
            while(arrIzq.length!=j&&arrDer.length!=k){
                if(arrIzq[j].length() < arrDer[k].length()){
                    desord[i] = arrIzq[j];
                    i++;
                    j++;
                }
                
                else{
                    desord[i] = arrDer[k];
                    i++;
                    k++;
                }
                
            }
            
            //Arreglo ordenado
        while(arrIzq.length != j){
            desord[i]=arrIzq[j];
            i++;
            j++;
        }
        
        while(arrDer.length != k){
            desord[i]=arrDer[k];
            i++;
            k++;
        }
        
        //Fin del if
        }
        
        return desord;
        
    }
}
