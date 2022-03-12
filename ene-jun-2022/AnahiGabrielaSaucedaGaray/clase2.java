import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class clase2 {
public static void main(String args[]){
	Scanner lee=new Scanner(System.in);
	
	 String arrayList[];
	String pelicula;
	int hora;
	double minutos;
	 
	  ArrayList<Parcial1E2> arraylist = new ArrayList<Parcial1E2>();
	   arraylist.add(new Parcial1E2("StarWars",2,1));
	   arraylist.add(new Parcial1E2( "Alien", 1,57));
	   arraylist.add(new Parcial1E2( "ASpaceOdyssey", 2,41));
	   arraylist.add(new Parcial1E2( "Matrix", 2,30));
	   arraylist.add(new Parcial1E2("BladeRunner",1,57));
	   
	   
	   ArrayList=mergeSort(ArrayList);
		for (int elem:ArrayList){
			System.out.print(elem+" ");
}
public static int[] mergeSort(int [] ArrayList){
	if (ArrayList.length==1){
		return ArrayList;
	}
	

int middle=ArrayList.length/2;

int [] left=Arrays.copyOfRange(ArrayList,0,middle);
int [] rigth=Arrays.copyOfRange(ArrayList,middle,ArrayList.length);

left=mergeSort(left);
rigth=mergeSort(rigth);

int [] newArrayList=merge(left,rigth);
return newArrayList;

}
public static int [] merge (int[] left,int[] right){
	int []resultado=new int[left.length + right.length];
	

	   for(int i=1;i<ArrayList.length;i++){
		   String actual=ArrayList[i];
		     int j=i-1;
		         for(;j>=0;j--){  //los i y los j son los indices
			        if(ArrayList[j].length()>actual.length()){
				      
			        	break;
			        }
			ArrayList[j+1]=ArrayList[j];
		        }
		   Arraylist[j+1]=actual;
	   }
	return resultado;
	
}

}