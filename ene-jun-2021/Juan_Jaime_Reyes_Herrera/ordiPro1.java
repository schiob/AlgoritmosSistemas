package algoritmosChioS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ordiPro1 {


			public static void main(String args[]) {
				int n;
				@SuppressWarnings("resource")
				Scanner op = new Scanner(System.in);

				System.out.println("ingrese el numero de colores:");
				n=op.nextInt();
				op.nextLine();
		        
				String[] temp = new String[n];
				for(int i = 0; i < n; i++) {
					System.out.println("ingrese el color: ");
					temp[i]=op.nextLine();
				}
					
				
				int[] result = quickSort(convertirStringsANumeros(temp), 0, temp.length - 1);
				String[] resultadoFinal = convertirNumerosAString(result);
				
				for(int i = 0; i < temp.length; i++) {
					System.out.print(resultadoFinal[i] + " ");
				}
			}
			
			public static int[] quickSort(int A[],int izq, int der){
				
				int pivote=A[izq];
				int i=izq;
				int j=der;
				int aux;
				
				while(i < j){
					while(Integer.parseInt(Integer.toString(A[i]).substring(0, 2)) <= Integer.parseInt(Integer.toString(pivote).substring(0, 2)) && i <j) i++;
					while(Integer.parseInt(Integer.toString(A[j]).substring(0, 2)) > Integer.parseInt(Integer.toString(pivote).substring(0, 2))) j--;
					if(i<j){
						aux=A[i];
						A[i]=A[j];
						A[j]=aux;
					}
				}
				A[izq]=A[j];
				A[j]=pivote;
				
				
				if(izq < j-1)
					quickSort(A,izq,j-1);
				if(j+1 < der)
					quickSort(A,j+1,der);
				
				return A;
			}
			
			public static int[] convertirStringsANumeros(String[] colores) {
				int[] nums = new int[colores.length];
				for (int i=0; i<colores.length; i++) {
					String s = colores[i].split("-")[0].toLowerCase();
					String s2 = colores[i].split("-")[1];
					switch(s) {
						case "rojo": nums[i] = Integer.valueOf(new Integer(1).toString() + s2) ; break;
						case "anaranjado": nums[i] = Integer.valueOf(new Integer(2).toString() + s2); break;
						case "amarillo" : nums[i] = Integer.valueOf(new Integer(3).toString() + s2); break;
						case "verde" : nums[i] = Integer.valueOf(new Integer(4).toString() + s2); break;
						case "indigo" : nums[i] = Integer.valueOf(new Integer(5).toString() + s2); break;
						case "violeta" : nums[i] = Integer.valueOf(new Integer(6).toString() + s2); break;
						case "azul" : nums[i] = Integer.valueOf(new Integer(7).toString() + s2); break;
					}
				}
				return nums;
			}
			
			public static String[] convertirNumerosAString(int[] nums) {
				String[] resultado = new String[nums.length];
				
				for(int i = 0; i < nums.length; i++) {
					String s = new Integer(nums[i]).toString();
					String valor1 = s.substring(0, 1);
					String valor2 = s.substring(1);
					
					switch(valor1) {
						case "1": resultado[i] = "Rojo-" + valor2; break;
						case "2": resultado[i] = "Anaranjado-" + valor2; break;
						case "3": resultado[i] = "Amarillo-" + valor2; break;
						case "4": resultado[i] = "Verde-" + valor2; break;
						case "5": resultado[i] = "Indigo-" + valor2; break;
						case "6": resultado[i] = "Violeta-" + valor2; break;
						case "7": resultado[i] = "Azul-" + valor2; break;
					}
				}
					
				return resultado;
			}
			public static int binarySearch(int[] arr, int elemento){
				int centro,izq,der,valorCentro;
				izq= 0;
				der=arr.length-1;
				while(izq<=der){
					centro=(izq+der)/2;
					valorCentro=arr[centro];
					
					if(elemento==valorCentro){
						return centro;
					}else if(elemento<valorCentro){
						der=centro-1; //con la finalidad de desplazarse hacia la izquierda
					}else{
						izq=centro+1; //con la finalidad de desplazarse hacia la derecha
					}
				}
				return -1;
				}
	            }
