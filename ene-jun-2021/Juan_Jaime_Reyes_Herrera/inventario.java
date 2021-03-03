package algoritmosChioS;



import javax.swing.JOptionPane;

public class inventario {
	private int numObj;
	private String nomObj;



	//Constructor
	public inventario(){
	numObj=0;
	nomObj="";
	}

	public inventario(int num,String nom){
		numObj=num;
		nomObj=nom;
				}
	
	
	
	public int getNumObj() {
		return numObj;
	}

	public void setNumObj(int numObj) {
		this.numObj = numObj;
	}

	//metodo toString
	public String toString()
	{
	String datos="";
	datos+=nomObj+"         "+numObj+"\n";
	return datos;
	}
	}

