

public class Practica3 {

    public static void main(String[] args) {
       //Bubble Short
    String arreglo[]={"Parasaurolophus","Oviraptor","Minmi","Troodon","Wannanosaurus"};
            for (int i=0; i < arreglo.length-1; i++ ) {
for (int j=i+1; j<arreglo.length; j++) {
if (arreglo[i].length() > arreglo[j].length()) {
String temp = arreglo[i];
arreglo[i] = arreglo[j];
arreglo[j] = temp;
}
}
}
 for (int i=0; i < arreglo.length; i++ ) {
     System.out.print(arreglo[i]+" ");
   
 }
 
    }}
      
  

   

 
 
 
    



