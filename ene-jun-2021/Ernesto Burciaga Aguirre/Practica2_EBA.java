package parcial_1;

public class Practica2_EBA {

public static void main(String[] args) {
	
	int [] num = new int[20];
	
	System.out.println("Arreglo sin ordenar");
		for (int x=0;x<num.length;x++)
			  num[x] = (int) (Math.random()*50)+1;
		for (int i=0; i<num.length; ++i) 
	        System.out.print("[" + num[i] + "]");
		
		for (int i = 1; i < num.length; i++) {
			
			int actual = num[i];
	
			int j = i-1;
		for(; j >= 0; j--) {
			if(actual > num[j]) {
				num[j+1] = num[j];
			}else {break;}
		
		}
		num[j+1] = actual;
		}
	
	System.out.println("\n \nArreglo ordenado y en pares"); 
    for (int i=0; i<num.length; ++i) 
    	 if (num[i] % 2 == 0)
        System.out.print("[" + num[i] + "]");
	}
	
	
}