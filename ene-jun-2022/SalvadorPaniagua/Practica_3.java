
public class Practica_3 {

public static void main(String[] args) {

	int [] num = new int[20];

	System.out.println("Ingresar arreglo");
		for (int x=0;x<num.length;x++)
			  num[x] = (int) (Math.random()*50)+1;
		for (int i=0; i<num.length; ++i) 
	        System.out.print("[" + num[i] + "]");

		for (int i = 1; i < num.length; i++) {

	int actual = num[i];

			int a = i-1;
		for(; a >= 0; a--) {
			if(actual > num[a]) {
				num[a+1] = num[a];
			}else {break;}

		}
		num[a+1] = actual;
		}

	System.out.println("\n \nArreglo completo y con pares"); 
    for (int i=0; i<num.length; ++i) 
    	 if (num[i] % 2 == 0)
        System.out.print("[" + num[i] + "]");
	}


} 