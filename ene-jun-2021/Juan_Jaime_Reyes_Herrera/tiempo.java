package algoritmosChioS;

import javax.swing.JOptionPane;

public class tiempo {
	private int numObj;
	private String nomObj;



	//Constructor
	public tiempo(){
	numObj=0;
	nomObj="";
	}

	public tiempo(String nom,int num){
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


