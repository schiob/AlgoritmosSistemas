
public class Comida {
	
	//Atributos
	
	private String nombre;
	private int calificacion;
	
	
	public Comida(String nombre, int calificacion) {
		this.nombre = nombre;
		this.calificacion = calificacion;
	}
	
	public int getCalificacion() {
		return calificacion;
	}
	
	public String getNombre() {
		return nombre;
	}

}
