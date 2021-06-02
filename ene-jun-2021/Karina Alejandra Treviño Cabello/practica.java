package AlgoritmosOyB;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Pelicula {

    
    public static void main(String[] args) {
           Scanner entrada =new Scanner(System.in);
		
		Pelicula[] arr;
		int num,i,n;
		String  nombre,r="";
		 
                System.out.println("Cantidad de OBjetos");
            n=entrada.nextInt();
                 arr = new Pelicula[n];

	
		
		for(i=0;i<arr.length;i++)
		{
                 nombre=JOptionPane.showInputDialog(JOptionPane.showInputDialog(null,"nombre peli "));
		num=Integer.parseInt(JOptionPane.showInputDialog(null,"duracion "));
		
                    
			arr[i]=new Pelicula(num,nombre);	
		}
	
		//sort
		arr = mergesort(arr);                                                                                  
		
		//Imprimir
	
		r="";
		r+="Nombre |Cantidad \n";
		for(i=0;i<arr.length;i++)
		{
		r+=arr[i].toString();
		}
		
		JOptionPane.showMessageDialog(null,r);

	}
		public static Pelicula[] mergesort(Pelicula[] arr) {
			int front = 0;
			int end = 1;
			
			while(end < arr.length) {
				Pelicula frontValue = arr[front];
				Pelicula endValue = arr[end];
				if(frontValue.gethoras < endValue.getminutos()) {
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
