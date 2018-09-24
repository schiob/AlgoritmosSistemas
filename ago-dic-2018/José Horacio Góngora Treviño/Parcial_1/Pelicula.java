
public class Pelicula
{
	private String nombre;
	private int hrs;
	private int min;
	
	public Pelicula(String nombre, int hrs, int min)
	{
		super();
		this.nombre=nombre;
		this.hrs=hrs;
		this.min=min;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	
	public int getHrs()
	{
		return hrs;
	}
	
	public void setHrs(int hrs)
	{
		this.hrs=hrs;
	}
	
	public int getMin()
	{
		return min;
	}
	
	public void setMin(int min)
	{
		this.min=min;
	}
	
	public String toString()
	{
		return nombre + "," + hrs+":"+min;
	}
}
