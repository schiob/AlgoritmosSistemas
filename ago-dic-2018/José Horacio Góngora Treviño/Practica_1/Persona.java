
public class Persona 
{
	    private String Nombre="";
	    private int contador;
	    Persona(String n)
	    {
	        this.Nombre=n;
	        this.contador=1;
	    }

	    public String toString() 
	    {
	        return "Alumno{" + "Nombre=" + Nombre+'}';
	    }

	    public String getNombre() 
	    {
	        return Nombre;
	    }

	    public void setNombre(String Nombre) 
	    {
	        this.Nombre = Nombre;
	    }

	    public int getContador() 
	    {
	        return contador;
	    }

	    public void setContador(int contador)
	    {
	        this.contador = contador;
	    }
	
}
