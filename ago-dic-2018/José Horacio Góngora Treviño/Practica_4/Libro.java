
public class Libro 
{
	private String nombre;
	private int pag;
	
	public Libro(String nombre, int pag)
	{
		super();
		this.nombre=nombre;
		this.pag=pag;		
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	
	public int getPag()
	{
		return pag;
	}
	
	public void setPag(int pag)
	{
		this.pag=pag;
	}
	
	public String toString()
	{
		return nombre + "," + pag;
	}
}
