package ordenMergeSort;

import java.util.Comparator;

public class nombreLibro2 implements Comparator<nombreLibro>{
		 
	    @Override
	    public int compare(nombreLibro o1, nombreLibro o2) {
	        if(o1.getNombre_Libro2().compareTo(o2.getNombre_Libro2()) > 0){
	            return 1;
	        }else if(o1.getNombre_Libro2().compareTo(o2.getNombre_Libro2()) < 0){
	            return -1;
	        }else{
	            return 0;
	        }
	 
	    }
	 

}
