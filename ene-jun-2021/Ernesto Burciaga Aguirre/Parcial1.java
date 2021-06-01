package parcial_1;
import java.util.*;

//Ernesto Burciaga Aguirre 17528944

public class Parcial1 
{

	void merge(int arr[],String arrS[], int l, int m, int r)
	{
		
		int n1 = m - l + 1;
		int n2 = r - m;

		int[] intL = new int[n1];
		String[] stringL = new String[n1];
		
		int[] intR = new int[n2];
		String[] stringR = new String[n2];

		for (int i = 0; i < n1; ++i) {
			intL[i] = arr[l + i];
			stringL[i] = arrS[l + i];
			}
		
		for (int j = 0; j < n2; ++j) {
			intR[j] = arr[m + 1 + j];
			stringR[j] = arrS[m + 1 + j];
			}
		
		int i = 0, j = 0;
		int k = l;
		
		while (i < n1 && j < n2) {
			if (intL[i] <= intR[j]) {
				arr[k] = intL[i];
				arrS[k] = stringL[i];
				i++;
			}
			else {
				arr[k] = intR[j];
				arrS[k] = stringR[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = intL[i];
			arrS[k] = stringL[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = intR[j];
			arrS[k] = stringR[j];
			j++;
			k++;
		}
	}

	void sort(int arr[], String arrS[], int l, int r)
	{
		if (l < r) {
			int m =l+ (r-l)/2;

			sort(arr, arrS, l, m);
			sort(arr, arrS, m + 1, r);
			merge(arr, arrS, l, m, r);
		}
	}

	public static void main(String args[])
	{
		
		Scanner n = new Scanner(System.in);
		Scanner n1 = new Scanner(System.in);
		
		System.out.print("Numero de Peliculas: ");
		int size = n.nextInt();
		int min;
		int hor;
		String nomPel[] = new String[size];
		int durPel[] = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.print("\nNombre de la pelicula: ");
			nomPel[i] = n1.next();
			
			System.out.print("Horas de la pelicula: ");
			hor = n.nextInt();
			
			System.out.print("Minutos de la pelicula: ");
			min = n.nextInt();
			
			min += (hor*60);
			durPel[i] = min;
		}	

		Parcial1 sortArr = new Parcial1();
		sortArr.sort(durPel, nomPel, 0, durPel.length - 1);
		
		System.out.println("Peliculas ordenadas por su duración: ");
		for(int k = 0; k < size; k++) {
			System.out.println(nomPel[k] + ":  " + durPel[k]);
		}
	}
}


