package ordenMergeSort;

import java.util.Comparator;

public class nombreLibroComparador implements Comparator<nombreLibro>{
	
	

	public int compare(nombreLibro o1, nombreLibro o2) {
	       if(o1.getNombre_Libro().compareTo(o2.getNombre_Libro()) > 0){
	           return 1;
	       }else if(o1.getNombre_Libro().compareTo(o2.getNombre_Libro()) < 0){
	           return -1;
	       }else{
	           return 0;
	       }

  }
}