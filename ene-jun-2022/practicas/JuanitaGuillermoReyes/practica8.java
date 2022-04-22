public class practica8 {
  //el profe esta enfermo 
  //ayúdalo haciendo un programa que le ayude a ordenar los medicamentos en orden alfabético
 
	public static void main(String[] args) {
		String[] nombre = { "naproxeno" ,"paracetamol ","rimantadina"," azitromicina"," ibuprofeno "};
 
		for (int i = 0; i < nombre.length - 1; i++) {
			for (int x = 0; x < nombre.length - 1; x++) {
				if ((nombre[x].compareTo(nombre[x + 1])) < 0) {
					String aux = nombre[x];
					nombre[x] = nombre[x + 1];
					nombre[x + 1] = aux;
				}
			}
		}
 
		for (int i = 0; i < nombre.length; i++) {
			System.out.println(nombre[i]);
		}
 
	  
}
}
