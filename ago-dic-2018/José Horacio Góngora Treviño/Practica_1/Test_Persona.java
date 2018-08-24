import javax.swing.*;
public class Test_Persona
{
	public static void main(String[]args)
	{
		 int n=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos nombres deseas ingresar: "));
	     Persona p[]=new Persona[n];
	     int q=n;
	     String r="";
	     String rr="";
	     String Mayor_nombre="";
	     int Mayor_contador=0;
	     for (int i = 0; i < n; i++)
	     {
	    	 boolean repetido=false;
	         int c=0;
	         r=JOptionPane.showInputDialog("Quedan "+q+" nombres por ingresar ", "Nombre");
	         while (p[c]!=null&&!p[c].getNombre().equalsIgnoreCase(r)) 
	         {
	        	 c++;
	         }
	            if (p[c]!=null&&p[c].getNombre().equalsIgnoreCase(r)) 
	            {
	                p[c].setContador(p[c].getContador()+1);
	                repetido=true;
	            }
	            if (repetido==false) 
	            {
	                p[c]=new Persona(r);
	            }
	            q--;
	        }
	        int c=0;
	        int b=0;
	        Mayor_nombre=p[c].getNombre();
	        Mayor_contador=p[c].getContador();
	        c++;
	        while (p[c]!=null) 
	        {
	            if (p[c].getContador()>Mayor_contador) 
	            {
	                Mayor_nombre=p[c].getNombre();
	                Mayor_contador=p[c].getContador();
	            }
	            if (p[c].getContador()==Mayor_contador&&!p[c].getNombre().equalsIgnoreCase(Mayor_nombre)) 
	            {
	                rr+=p[c].getNombre()+"\n";
	            }
	            c++;
	        }
	        System.out.println("Nombre más repetido: "+Mayor_nombre+"\nContador: "+Mayor_contador+"\n"+"Nombres repetidos: \n"+rr);
	}
}
