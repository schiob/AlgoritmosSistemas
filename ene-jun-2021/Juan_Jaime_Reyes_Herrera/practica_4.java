package algoritmosChioS;

import java.util.Arrays;

import javax.swing.JOptionPane;

import javax.swing.JOptionPane;
public class practica_4 {
		
		public static void main(String[] args)
		{

		//declaracion
		inventario[] obj;
		int n,num,i,entmay;
		String  nom,r="";
		
		
		//creacion del vector
		n=Integer.parseInt(JOptionPane.showInputDialog(null,"Tamaño del vector"));
		obj = new inventario[n];

	//leer los datos de n objetos y almacenar en el vector
		
		for(i=0;i<obj.length;i++)
		{
	    num=Integer.parseInt(JOptionPane.showInputDialog(null,"cantidad de objetos "));
		nom=JOptionPane.showInputDialog(null,"Nombre del objeto "+(i+1));
		
		obj[i]=new inventario(num,nom);
	
		
			
		}
	
		//sort
		obj = sorting(obj);                                                                                  
		
		//Imprimir
	
		r="";
		r+="Nombre |Cantidad \n";
		for(i=0;i<obj.length;i++)
		{
		r+=obj[i].toString();
		}
		
		JOptionPane.showMessageDialog(null,r);

	}
		public static inventario[] sorting(inventario[] arr) {
			int front = 0;
			int end = 1;
			
			while(end < arr.length) {
				inventario frontValue = arr[front];
				inventario endValue = arr[end];
				if(frontValue.getNumObj() < endValue.getNumObj()) {
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
