import java.util.*;
public class parcial1 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.print("ingrese las medicinas de chio");
		n=sc.nextInt();
		String [] arr=new String[n];
		
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		
		  for(int i=0;i< arr.length;i++) {
			  
			  String medi = arr[i];
			  int val=medi.length();
			  int a=i-1;
			  while(a>=0 && val<arr[a].length()) {  
				  arr[a+1]=arr[a];
				  a--;
			  }
			  
			  
			  
			  arr[a+1]=medi;
			 
			
		  }
		  
		  for(int i=0;i< arr.length;i++) {
			  System.out.println(arr[i]);
		  }
	}	
}