package practicas;


public class practica5 {
	String nombre;
	int oro, plata, bronce;
	
	public practica5(String nombre, int oro, int plata, int bronce) {
		this.nombre=nombre;
		this.oro=oro;
		this.plata=plata;
		this.bronce=bronce;
	}
	public String toString() {
		return getNombre()+" "+getOro()+" "+getPlata()+" "+getBronce();
	}
	//nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    //oro
	public int getOro() {
		return oro;
	}
	public void setOro(int oro) {
		this.oro = oro;
	}
    //plata
	public int getPlata() {
		return plata;
	}
	public void setPlata(int plata) {
		this.plata = plata;
	}
    //bronce
	public int getBronce() {
		return bronce;
	}
	public void setBronce(int bronce) {
		this.bronce = bronce;
	}

	public void mostrarResultados() {
		System.out.println("\nnombre: "+nombre);
		System.out.println("oro: "+oro);
		System.out.println("plata: "+plata); 
		System.out.println("bronce: "+bronce);
	}

	public static void main(String[]args) {
		
		practica5 participante1 = new practica5("Jose", 10, 4, 9);
		practica5 participante2 = new practica5("Mario", 10, 7, 2);
		practica5 participante3 = new practica5("Saul", 12, 0, 4);
		practica5 participante4 = new practica5("Francisco", 10, 7, 0);
		practica5 participante5 = new practica5("Luis",12, 0, 4);
		practica5 participante6 = new practica5("Karla", 15, 5, 0);
		
		practica5 [] participantes = {participante1, participante2, participante3, participante4, participante5,
			participante6};
		practica5[]ordenado=new practica5[participantes.length];
		
		for(int i=0; i<participantes.length; i++) {
			System.out.println(participantes[i]);
		}
		
		sortTitles(participantes, 0, participantes.length-1);
		
		System.out.println("\nSorted array: \n");
	}
	
	public static void sortTitles(practica5[] participante1, int low, int high) {
		if(low==high)
			return;
		
		int mid = (low+high)/2;
		sortTitles(participante1, low, mid);
		sortTitles(participante1, mid+1, high);
		
		mergeTitle(participante1, low, mid, high);
	}
	public static void mergeTitle(practica5[] participante1, int low, int mid, int high) {
		practica5 [] temp = new practica5[high - low+1];
		
		int i = low, j=mid+1,n=0;
		while(i<=mid || j<=high) {
			int result=participante1[i].getNombre().compareTo(participante1[j].getNombre());
			int result2=participante1[j].getNombre().compareTo(participante1[i].getNombre());
			if(i>mid) {
				temp[n]=participante1[j];
				j++;
			}
			else if(result<result2) {
				temp[n]=participante1[i];
				i++;
			}
			else if (result<result2) {
				temp[n]=participante1[i];
				i++;
			}
			else {
				temp[n]=participante1[j];
				j++;
			}
			n++;
			}
		for(int k=low; k<=high;k++) {
			participante1[k]=temp[k-low];
		}
		
		
		
		
	}
	public static void sortOro(practica5[] participante1, int low, int mid, int high) {
		practica5[] temp = new practica5[high - low + 1];
		int i=low, j = mid+1, n=0;
		
		while(i<=mid || j<=high) {
			if(i>mid) {
				temp[n]=participante1[j];
				j++;
			}
			else if(j>high) {
				temp[n]=participante1[i];
				i++;
			}
			else if (participante1[i].getOro()<participante1[j].getOro()) {
				temp[n]=participante1[i];
				i++;
			}
			else {
				temp[n]=participante1[j];
				j++;
			}
			n++;
		}
		
		
		
		
	}
	
		
		
		
		
		/*String nombres []= {participante1.getNombre(),participante2.getNombre(),participante3.getNombre(),
		 //participante4.getNombre(),participante5.getNombre(),participante6.getNombre()};
		
		int oro[]= {participante1.getOro(),participante2.getOro(),participante3.getOro(),
				 participante4.getOro(),participante5.getOro(),participante6.getOro()};
		
		int plata[]= {participante1.getPlata(),participante2.getPlata(),participante3.getPlata(),
				 participante4.getPlata(),participante5.getPlata(),participante6.getPlata()};
		
		int bronce[]= {participante1.getBronce(),participante2.getBronce(),participante3.getBronce(),
				 participante4.getBronce(),participante5.getBronce(),participante6.getBronce()};
		
		
		
		
		
		
		
		
		for(int i=0; i<nombres.length; i++) {
			System.out.println(nombres[i]+" "+oro[i]+" "+plata[i]+" "+bronce[i]);
		}
		
		
		
		
		
		
		/*
		participante1.mostrarResultados();
		participante2.mostrarResultados();
		participante3.mostrarResultados();
		participante4.mostrarResultados();
		participante5.mostrarResultados();
		participante6.mostrarResultados();
*/
		
		


		
		
		
		
	

}
