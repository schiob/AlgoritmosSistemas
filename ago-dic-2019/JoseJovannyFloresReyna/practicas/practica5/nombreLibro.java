package ordenMergeSort;

public class nombreLibro{
	
    private String nombre_libro;
    private String nombre_libro2;
    private int numero_paginas;
    
    public nombreLibro(String nombre_libro, String nombre_libro2, int numero_paginas){
    	this.nombre_libro = nombre_libro;
    	this.nombre_libro2 = nombre_libro2;
    	this.numero_paginas = numero_paginas;
    	
    }
    public String getNombre_Libro(){
    	return nombre_libro;
    }
    public void setNombre_Libro(String nombre_libro){
    	this.nombre_libro = nombre_libro;
    }
    
    public String getNombre_Libro2(){
    	return nombre_libro2;
    }
    public void setNombre_Libro2(String nombre_libro2){
    	this.nombre_libro2 = nombre_libro2;
    }

    public int getNumero_Paginas() {
        return numero_paginas;
    }
    public void setNumero_Paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }
 
    public String toString(){
        return "Numero de paginas: "+getNumero_Paginas()+", nombre del libro:"+getNombre_Libro()+getNombre_Libro2();
    }
 
    public int compareTo(nombreLibro o) {
    	nombreLibro e = (nombreLibro)o;
        if(this.numero_paginas > e.getNumero_Paginas())
            return 1;
        if(this.numero_paginas < e.getNumero_Paginas())
            return -1;
        if(this.numero_paginas == e.getNumero_Paginas())
            return 0;
        return 0;
    }
}