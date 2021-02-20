package algoritmosChioS;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practica_3 {

	public static void main(String args[]) {
		String s[] = {"Velociraptor", "Triceratops", "TRex","paquicefalosaurio","estegosaurio"};
		
		Map<Integer, String> map = new HashMap<>();
		int temp[] = new int[s.length];
		for(int i = 0; i < s.length; i++) {
			temp[i] = s[i].length();
			map.put(s[i].length(), s[i]);
		}
	
		Arrays.sort(temp);
		
		for(int i = 0; i < temp.length; i++) {
			System.out.println(map.get(temp[i]));
		}
		
	}
}
