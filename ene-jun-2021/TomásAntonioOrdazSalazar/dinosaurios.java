package algoritmos;

public class dinosaurios {
	public static void main(String args[]) {
		String a [ ]= {"Parasaurolophus" ,"Oviraptor" ,"Minmi" ,"Troodon", "Wannanosaurus"};
		String actual;
		for(int i=0;i<a.length;i++) {
			actual=a[i];
			int j=i;
			while(j>0 && (a[j-1]).length()>actual.length()) {
				a[j]=a[j-1];
				j--;
			}
			a[j]=actual;
		}
		for(String i:a) {
			System.out.println(i);
		}
	}
}
