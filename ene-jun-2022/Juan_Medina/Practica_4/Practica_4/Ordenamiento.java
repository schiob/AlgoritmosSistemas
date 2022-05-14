public class Ordenamiento {

    public static void main(String args[]) {

        String arreglo[]={"hola","perro","sol"};

        for (int i=0; i < arreglo.length-1; i++ ) {
    for (int j=i+1; j<arreglo.length; j++) {
    if (arreglo[i].length() > arreglo[j].length()) {
    String temp = arreglo[i];
    arreglo[i] = arreglo[j];
    arreglo[j] = temp;
    }
    }
    }
    for ( i=0; i < arreglo.length; i++ ) {
    System.out.println(arreglo[i]);
    System.out.println();
    }

    }
    
}
