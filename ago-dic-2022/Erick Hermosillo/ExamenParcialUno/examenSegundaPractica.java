package parcialUno;

import java.util.Scanner;

public class examenSegundaPractica {

    public String[] mergesort(String[] A) {//Entrada del arreglo y separacion en mitades
        if (A.length <= 1) {
            return A;
        }
        String[] izq;
        String[] der;
        der = new String[A.length / 2];
        if (A.length % 2 == 0) {
            izq = new String[A.length / 2];
        } else {
            izq = new String[(A.length / 2 + 1)];
        }
        int i;
        for (i = 0; i < izq.length; i++) {
            izq[i] = A[i];
        }
        int k = 0;
        for (int j = i; j < A.length; j++) {
            der[k] = A[j];
            k++;
        }
        //Parte recursiva
        String[] arregloOrdenado = merge(mergesort(izq), mergesort(der));

        return arregloOrdenado;
    }

    public String[] merge(String[] a, String[] b) {//recibe 2 sub array y los junta ordenadamente en uno, a y b deben estar ordenados
        int indicea = 0;
        int indiceb = 0;
        String[] arregloJunto = new String[a.length + b.length];
        for (int k = 0; k < arregloJunto.length; k++) {
            if (Integer.parseInt(a[indicea].replaceAll("[\\D]", "")) < Integer.parseInt(b[indiceb].replaceAll("[\\D]", ""))) {//Convierte las cadenas string en valores enteros, omitiendo por completo todo aquello que no sean digitos
                arregloJunto[k] = a[indicea];
                indicea++;
            } else {
                arregloJunto[k] = b[indiceb];
                indiceb++;
            }
            if (indicea == a.length) {
                k++;
                for (indiceb = indiceb; indiceb < b.length; indiceb++) {
                    arregloJunto[k] = b[indiceb];
                    k++;
                }
            } else if (indiceb == b.length) {
                k++;
                for (indicea = indicea; indicea < a.length; indicea++) {
                    arregloJunto[k] = a[indicea];
                    k++;
                }

            }
        }

        return arregloJunto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar la cantidad de libros que tiene Juan");
        int numeroDeLibros = sc.nextInt();//La entrada del numero de medicamentos
        String listaDeLibros[] = new String[numeroDeLibros];//Se crea el arreglo listaDeLibros, tiene como limite el numero de libros establecido en la linea anterior
        sc.nextLine();
        System.out.println("\nIngrese cada uno de los " + numeroDeLibros + " libros, con su titulo y numero de paginas separadas por un espacio\nEjemplo: hungerGames 290");
        for (int i = 0; i < numeroDeLibros; i++) {
            listaDeLibros[i] = sc.nextLine();
        }

        examenSegundaPractica mg = new examenSegundaPractica();
        String librosOrdenados[] = mg.mergesort(listaDeLibros);
        System.out.println("\n\nLa lista ordenada de libros es: ");
        for (String arreglordenadoXD1 : librosOrdenados) {
            System.out.printf(arreglordenadoXD1.split(" ")[0] + " "); //Separa los valores en 2 despues del espacio e imprime la primera parte (es decir, el titulo).
        }

    }
}
