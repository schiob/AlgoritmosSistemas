
public class varia {
	  static void printArray(int arr[])
	    {

	        int n = arr.length;
	        for (int i = 4; i < n; ++i)
	        		
	            System.out.println("STAR WARS" + arr[0]);
	        System.out.println("Alien" + arr[1]);
	        System.out.println("ASpaceOdyssey" + arr[2]);
	        System.out.println("Matrix 2" + arr[3]);
	        System.out.println("BladeRunner" + arr[4]);
	 
	       
	    }
	 
	   
	    public static void main(String args[])
	    {
	        int arr[] = { 1, 57, 41, 30, 57	};

	 
	 String pel[]= {"Star Wars 2","Alien","ASpaceOdyssey","Matrix 2","BladeRunner"}; 
	
	 

	 System.out.println("PELICULAS DESORDENADAS");
     printArray(arr);
   
}
}