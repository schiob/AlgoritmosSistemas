
public class counting {
    public static void main(String args[]) {
        int []arr = {3,5,6,7,4,5,7,3,4,6,7,4,6,7,4,5,7,1};
        for(int elem: arr){
            System.out.print(elem + " ");
        }
		System.out.println();

        arr = countingSort(arr);

        for(int elem: arr){
            System.out.print(elem + " ");
        }
    }

    public static int[] countingSort(int[] arr){
		// Extraer elemento más grande del arreglo de entrada
		int elemMasGrande = 0;
		for(int elem : arr){
			if(elem > elemMasGrande){
				elemMasGrande = elem;
			}
		}
		
		// Crear arreglo de conteo de 0..elemMasGrande
		int []arrConteo = new int[elemMasGrande+1];
		
		// Recorrer arreglo de entrada para contar cuántos elementos hay.
		for(int elem : arr){
			// Llevar la cuenta en el arreglo de conteo
			arrConteo[elem] += 1;
		}
		
		// Recorrer arreglo de conteo para hacer suma acumulativa.
		for(int i = 1; i < arrConteo.length; i++){
			arrConteo[i] = arrConteo[i]+arrConteo[i-1];
		}
		
		// Recorrer el arreglo principal de atrás para delante y acomodar los elementos.
		int []res = new int[arr.length];
		for(int i = arr.length-1; i >= 0; i--){
			int elemActual = arr[i];
			int posFinal = arrConteo[elemActual] - 1;
			res[posFinal] = elemActual;

			arrConteo[elemActual] = arrConteo[elemActual] - 1;
		}

		return res;
    }
}