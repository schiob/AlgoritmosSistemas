package algoritmosChioS;

	import java.util.Arrays;

	import javax.swing.JOptionPane;

	import java.util.Scanner;
	public class examen_1 {
			
			public static void main(String[] args)
			{

			//declaracion
			tiempo[] obj;
			int n,e,num,i,entmay;
			String  nom="",r="";
			
			Scanner op = new Scanner(System.in);
			
			//creacion del vector
			System.out.println("numero de peliculas: ");
			n=op.nextInt();
	        obj= new tiempo[n];

		//leer los datos de n objetos y almacenar en el vector
			
			for(i=0;i<obj.length;i++)
			{
			System.out.println("Nombre de la pelicula "+(i+1)+"\n");
			nom=op.next();
			System.out.println("duracion de la pelicula "+(i+1));
			num=op.nextInt();
			obj[i]=new tiempo(nom,num);
		
			
				
			}
		
			//sort
			obj = sorting(obj);                                                                                  
			
			//Imprimir
		
			r="";
			r+="Nombre |Tiempo \n";
			for(i=0;i<obj.length;i++)
			{
			r+=obj[i].toString();
			}
			
			System.out.println(r);

		}
			public static tiempo[] sorting(tiempo[] arr) {
				int front = 0;
				int end = 1;
				
				while(end < arr.length) {
					tiempo frontValue = arr[front];
					tiempo endValue = arr[end];
					if(frontValue.getNumObj() > endValue.getNumObj()) {
						arr[front] = endValue;
						arr[end] = frontValue;
						
						front = 0;
						end = 1;
					} else {
						front++;
						end++;
					}
				}
			
				return arr;
			}
			
	}

