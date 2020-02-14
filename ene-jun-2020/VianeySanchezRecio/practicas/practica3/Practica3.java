package practica3;
public class Practica3 {
 public static void main(String[] args) {
     final int tamaño=7;
      int lista[]=new int [tamaño];
        rellenarArray(lista);
    String lista_String[]={"CANDESARTAN HIDROCLOROTIAZIDA ALTER",
"CARBAMAZEPINA NORMON","MATRIF","ACICLOVIR SANDOZ","MELOXICAM","FENDIVIA", "SEBUMSELEN"};
  System.out.println("Array de números sin ordenar:");
        imprimirArray(lista);
        burbuja(lista);
 System.out.println("Array de números ordenado:");
        imprimirArray(lista);
       System.out.println("Array de String sin ordenar:");
        imprimirArray(lista_String);
       burbujaPalabras (lista_String);
 System.out.println("Array de String ordenado:");
        imprimirArray(lista_String);
    }
 
    public static void imprimirArray (int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
    }
 
    public static void imprimirArray (String lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
    }
 
    public static void rellenarArray (int lista[]){
        for(int i=0;i<lista.length;i++){
            lista[i]=numeroAleatorio();
        }
    }
 
    private static int numeroAleatorio (){
        return ((int)Math.floor(Math.random()*100));
    }
 
    public static void burbuja (int lista[]){
        int cuentaintercambios=0;
        
        for (boolean ordenado=false;!ordenado;){
            for (int i=0;i<lista.length-1;i++){
                if (lista[i]>lista[i+1]){
                    
                    int variableauxiliar=lista[i];
                    lista[i]=lista[i+1];
                    lista[i+1]=variableauxiliar;
                    
                    cuentaintercambios++;
                }
            }
            
            if (cuentaintercambios==0){
                ordenado=true;
            }
           
            cuentaintercambios=0;
        }
    }
 
    public static void burbujaPalabras (String lista_palabras[]){
        boolean ordenado=false;
        int cuentaIntercambios=0;
       
        while(!ordenado){
            for(int i=0;i<lista_palabras.length-1;i++){
                if (lista_palabras[i].compareToIgnoreCase(lista_palabras[i+1])>0){
                    
                    String aux=lista_palabras[i];
                    lista_palabras[i]=lista_palabras[i+1];
                    lista_palabras[i+1]=aux;
                    
                    cuentaIntercambios++;
                }
            }
           
            if (cuentaIntercambios==0){
                ordenado=true;
            }
            cuentaIntercambios=0;
        }
 
    }
}
       
    
    

