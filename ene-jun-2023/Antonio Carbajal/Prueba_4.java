package Pruebas;

import java.util.*;

public class Prueba_4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Digite el numero de datos que desee: ");
		int n = s.nextInt();
		List<String[]> peliculas = new ArrayList<>();

		// Lectura de la entrada y creación de la lista de películas
		System.out.println("Ingrese los datos del arreglo porfavor: ");
		for (int i = 0; i < n; i++) {

			String nombre = s.next();
			int horas = s.nextInt();
			int minutos = s.nextInt();
			peliculas.add(new String[] { nombre, horas + ":" + minutos });
		}

		// Llamada al algoritmo Merge Sort
		List<String[]> peliculitas = mergeSort(peliculas);

		// Impresión de la lista ordenada
		System.out.println("Peliculas Ordenadas por Duracion: ");
		for (String[] pelicula : peliculitas) {
			System.out.print( "["+pelicula[0] + "]");
		}
	}

	public static List<String[]> mergeSort(List<String[]> peliculas) {
		if (peliculas.size() <= 1) {
			return peliculas;
		}

		// Dividir la lista por la mitad
		int medio = peliculas.size() / 2;
		List<String[]> ListaIzq = peliculas.subList(0, medio);
		List<String[]> ListaDer = peliculas.subList(medio, peliculas.size());

		// Llamada recursiva para ordenar las sublistas
		List<String[]> Izq = mergeSort(ListaIzq);
		List<String[]> Der = mergeSort(ListaDer);

		// Fusión de las sublistas ordenadas
		List<String[]> result = new ArrayList<>();
		int I = 0, D = 0;
		while (I < Izq.size() && D < Der.size()) {
			if (Duracion_Minutos(Izq.get(I)[1]) < Duracion_Minutos(Der.get(D)[1])) {
				result.add(Izq.get(I));
				I++;
			} else {
				result.add(Der.get(D));
				D++;
			}
		}

		// Agregar los elementos restantes de las sublistas
		result.addAll(Izq.subList(I, Izq.size()));
		result.addAll(Der.subList(D, Der.size()));

		return result;
	}

	// Método auxiliar para obtener la duración en minutos de una película
	public static int Duracion_Minutos(String duracion) {
		String[] partes = duracion.split(":");
		int horas = Integer.parseInt(partes[0]);
		int minutos = Integer.parseInt(partes[1]);
		return horas * 60 + minutos;
	}

}
