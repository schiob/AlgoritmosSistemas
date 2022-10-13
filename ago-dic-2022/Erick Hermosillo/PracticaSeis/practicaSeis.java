package parcialDos;

import java.util.Scanner;

public class practicaSeis {

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
            if (Integer.parseInt(a[indicea].split(" ")[1]) > Integer.parseInt(b[indiceb].split(" ")[1])) { //Separa el arreglo en subarreglos por sus espacios, compara los indices 1, es decir medallas de oro
                arregloJunto[k] = a[indicea];
                indicea++;
            } else if (Integer.parseInt(a[indicea].split(" ")[1]) == Integer.parseInt(b[indiceb].split(" ")[1]) && Integer.parseInt(a[indicea].split(" ")[2]) > Integer.parseInt(b[indiceb].split(" ")[2])) {//En el caso de que las medallas de oro sean iguales, compara en los indices 2, es decir medallas de plata
                arregloJunto[k] = a[indicea];
                indicea++;
            } else if (Integer.parseInt(a[indicea].split(" ")[1]) == Integer.parseInt(b[indiceb].split(" ")[1]) && Integer.parseInt(a[indicea].split(" ")[2]) == Integer.parseInt(b[indiceb].split(" ")[2]) && Integer.parseInt(a[indicea].split(" ")[3]) > Integer.parseInt(b[indiceb].split(" ")[3])) {//En caso de que los indices 1 y 2 sean iguales, se compara en el indice 3, medallas de bronce
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

        System.out.println("Ingresar la cantidad de concursantes en las olimpiadas");
        int numeroDeParticipantes = sc.nextInt();//La entrada del numero de medicamentos
        String listaDeParticipantes[] = new String[numeroDeParticipantes];//Se crea el arreglo listaDeLibros, tiene como limite el numero de libros establecido en la linea anterior
        sc.nextLine();
        System.out.println("\nIngrese cada uno de los " + numeroDeParticipantes + " participantes, con su nombre, cantidad de medallas de oro, plata y bronce separadas por un espacio\nEjemplo: Monica 10 4 12\n");
        for (int i = 0; i < numeroDeParticipantes; i++) {
            listaDeParticipantes[i] = sc.nextLine();
        }

        practicaSeis ms = new practicaSeis();
        String participantesOrdenados[] = ms.mergesort(listaDeParticipantes);
        System.out.println("\n\nLa lista ordenada de participantes es: ");
        for (String arreglordenadoXD1 : participantesOrdenados) {
            System.out.printf(arreglordenadoXD1.split(" ")[0] + " "); //Separa los valores en 2 despues del espacio e imprime la primera parte (es decir, el titulo).
        }

    }
}
