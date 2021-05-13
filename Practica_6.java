public class Practica_6 {
public static void QuickSort(String medicinas[],int inferior,int superior){
        int izquierda,derecha;
        String mitad,x;
        izquierda = inferior;
        derecha = superior;
        mitad = medicinas[(izquierda+derecha)/2];
        do{
            while(medicinas[izquierda].compareTo(mitad)<0 && izquierda<superior){
                izquierda++;
            }
            while(mitad.compareTo(medicinas[derecha])<0 && derecha>inferior){
                derecha--;
            }
            if (izquierda <= derecha) {
                x = medicinas[izquierda];
                medicinas[izquierda] = medicinas[derecha];
                medicinas[derecha] = x;
                izquierda++;
                derecha--;
            }
        }while(izquierda<=derecha);
        if (inferior < derecha) {
            QuickSort(medicinas,inferior,derecha);
        }
        if (izquierda < superior) {
            QuickSort(medicinas,izquierda,superior);
        }
    }
	public static void main (String []args)
  {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantos medicamentos son?");
        int n = entrada.nextInt();
        System.out.println("Ingrese el nombre de los medicamentos: ");
        String medicinas [] = new String[n];
        for (int i = 0; i < n; i++) {
            medicinas[i] = entrada.next();
        }
        int izq = 0,der;
        der = medicinas.length-1;
        QuickSort(medicinas,0,n-1);
        System.out.println("Medicamentos ordenados:");
        for (int i = 0; i < n; i++) {
            System.out.print(medicinas[i]+" ");
     }
  }  
}
