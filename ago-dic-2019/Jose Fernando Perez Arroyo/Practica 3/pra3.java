import java.util.*;
import java.util.Arrays;
public class pra3 {
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
		String [] name = {"Parasaurolophus","Oviraptor","Minimi", "Troodon","Wannanosaurus"};
	Arrays.sort(name, new Comparator<String>( ){
		public int compare(String arg0, String arg1) {
			int largo0=arg0.length();
			int largo1=arg1.length();
			return largo0 < largo1 ? -1 :largo0 > largo1 ? 1 :0;
			}});
	System.out.println("Nombres en orden: ");
	 for (int i=0; i<name.length; i++) {
		 			System.out.print(name[i]+" ");
		}
	}
}
