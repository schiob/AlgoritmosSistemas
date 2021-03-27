package AlgoritmosOyB;
public class Parcial1 {


public class Pelicula{
    private String nombre;	
    private int horas;
    private int minutos;
	
	
	//Constructor
	public Pelicula(){
	nombre="";
	horas=0;
        minutos=0;
	}


	public Pelicula(String nom, int hrs, int min){
		nombre=nom;
		horas=hrs;
                minutos=min;
        }
	
	public String getnombre() {
		return nombre;
	}
        public void setnombre(String nombre) {
		 this.nombre=nombre;
	}     
        
	public int gethoras() {
		return horas;
	}

	public void sethoras(int horas) {
		this.horas = horas;
	}
        
        public int getminutos() {
		return minutos;
	}

	public void setminutos(int minutos) {
		this.minutos = minutos;
	}

	//metodo toString
	public String toString()
	{
	String datos="";
	datos+=nombre+""+horas+""+minutos+"";
	return datos;
	
	}


}
}