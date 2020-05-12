package parcial1;
import java.util.*;
public class pract4 {

	public static void main(String args[]) {
		pract4 metodo = new pract4();
		Scanner consola = new Scanner(System.in);
		
		int h=consola.nextInt();//H<300
		
		for(int i=0;i<h;i++) {		
			int n=consola.nextInt();//1<n<52
			String [] part1String = new String[n*2];		
			int [] part1Int = new int [n*2];
			String [] part2String = new String[n*2];	
			int b=0;
			
			for(int j=0;j<n;j++) {
				String mano = consola.next();
				part1String[b]=mano.substring(0,1);//(A, 2, 3, 4, 5, 6, 7, 8, 9, T, J, Q o K)					
				b++;
				part1String[b]=mano.substring(1,2);//(E, C, T o D)
				b++;
				}//for relleno
		
			//metodos
			//metodo1: Aqui pasaremos todos los primeros caracteres a valores numericos
			//teniendo en cuenta que en algunos casos el primer caracter es una letra
			//y dando su valor numerico, todo lo guardaremos en un array tipo int
			part1Int=metodo.part1Anumerico(part1String,part1Int);
			//metodo2: Los valores (E, C, T o D) les daremos valores de el 1 al 4
			//respectivamente
			part1Int=metodo.part2Anumerico(part1String,part1Int);
			
			part1Int=metodo.mergesort(part1Int,n);
			
			
			part2String=metodo.reversa1(part2String, part1Int);
			
			part2String=metodo.reversa2(part2String, part1Int);
			
			for(int p=0;p<part2String.length;p+=2) {
				
				System.out.print(part2String[p]+part2String[p+1]+" ");
				
			}
			System.out.print("\n");
			
		}//for grande	
		
		
	}//cierre_main
			
	public int[] part1Anumerico (String[]part1S,int[] part1I) {
	
		for(int k=0;k<part1S.length-1;k=k+2){
			if(part1S[k].equalsIgnoreCase("A")==true) {
				part1I[k]=1;
				
			}
			if(part1S[k].equalsIgnoreCase("T")==true) {
				part1I[k]=10;
				
			}
			if(part1S[k].equalsIgnoreCase("J")==true) {		
				part1I[k]=11;
			}
			if(part1S[k].equalsIgnoreCase("Q")==true) {
				part1I[k]=12;		
			}
			if(part1S[k].equalsIgnoreCase("K")==true) {
				part1I[k]=13;
			}
			if(part1S[k].matches("[1-9]")){
				part1I[k]=Integer.valueOf(part1S[k]);
				
			}
		}//end_for
		return part1I;
	}//cierre_metodo_part1Anumerico
	
	public int[] part2Anumerico(String[]part2S,int[]part2I){	
		
		for(int i=1;i<part2S.length;i=i+2) {			
			if(part2S[i].equalsIgnoreCase("E")==true) {
				part2I[i]=100;
			}
			if(part2S[i].equalsIgnoreCase("C")==true) {
				part2I[i]=200;
			}
			if(part2S[i].equalsIgnoreCase("T")==true) {
				part2I[i]=300;
			}
			if(part2S[i].equalsIgnoreCase("D")==true) {
				part2I[i]=400;
			}
			else {
				
			}
		}
		return part2I;
	}

	public String[] reversa1(String[]part1S,int[] part1I) {

		for(int k=0;k<part1S.length-1;k=k+2){
			
			if(part1I[k]==1) {
				part1S[k]="A";				
			}
			if(part1I[k]==10) {
				part1S[k]="T";
			}
			 if(part1I[k]==11) {				
				part1S[k]="J";
			}
			 if(part1I[k]==12) {
				part1S[k]="Q";				
			}
			 if(part1I[k]==13) {
				part1S[k]="K";				
			}
			 if (part1I[k]!=1 && part1I[k]!=10 && part1I[k]!=12 && part1I[k]!=13){
				part1S[k]=String.valueOf(part1I[k]);				
			}
		}//end_for
		return part1S;
	}
	
	public String[] reversa2(String[]part1S,int[] part1I) {
		
		for(int i=1;i<part1S.length;i+=2) {
			
			if(part1I[i]==100) {
				part1S[i]="E";
			}
			if(part1I[i]==200) {
				part1S[i]="C";
			}
			if(part1I[i]==300) {
				part1S[i]="T";
			}
			if(part1I[i]==400) {
				part1S[i]="D";
			}
		}
		return part1S;
	}

	public int []mergesort(int []dato1,int n){
		if(dato1.length>2 && n%2==0 ){
		int a=dato1.length/2;
		int q=dato1.length-a;
		int []dato1izq= new int[a]; //estos array es para los primeros chars de la carta
		int []dato1der= new int[q];
		int j=0;
		
		for(int i=0;i<a-1;i+=2) {
			dato1izq[i]=dato1[j];	
			j++;
			dato1izq[i+1]=dato1[j];
			j++;
		}
		for(int i=0;i<dato1.length-a-1;i+=2) {
			dato1der[i]=dato1[j];		
			j++;
			dato1der[i+1]=dato1[j];
			j++;
		}
		j=0;
		dato1izq=mergesort(dato1izq,a);
		dato1der=mergesort(dato1der,q);
		
			int f=0,e=0,r=0;
			while(dato1izq.length!=f && dato1der.length!=e) {
				
				if(dato1izq[f]<dato1der[e]) {
					dato1[r]=dato1izq[f];
					r++;
					f++;
					dato1[r]=dato1izq[f];
					f++;
					r++;
				}	
				else {
					if(dato1izq[f]==dato1der[e]){				
						if(dato1izq[f+1]<dato1der[e+1]) {
							dato1[r]=dato1izq[f];
							r++;
							f++;
							dato1[r]=dato1izq[f];
							f++;
							r++;
						}
						else {
							dato1[r]=dato1der[e];
							e++;
							r++;
							dato1[r]=dato1der[e];
							e++;
							r++;
						}
					}
					else if(dato1izq[f]>dato1der[e]) {
					dato1[r]=dato1der[e];
					r++;
					e++;
					dato1[r]=dato1der[e];
					e++;
					r++;				
					}
				}
			}//while
			while(dato1izq.length>f) {
				dato1[r]=dato1izq[f];
				r++;
				f++;
				dato1[r]=dato1izq[f];
				f++;
				r++;
			}
			
			while(dato1der.length>e) {
				dato1[r]=dato1der[e];
				r++;
				e++;
				dato1[r]=dato1der[e];
				e++;
				r++;	
			}
			
		}//Cierre_if	
		else if(dato1.length>2 ){
			int a=(dato1.length/2)+1;
			int q=dato1.length-a;
			int []dato1izq= new int[a]; //estos array es para los primeros chars de la carta
			int []dato1der= new int[q];
			int j=0;
			int l=a/2;
			int m=q/2;
			for(int i=0;i<a-1;i+=2) {
				dato1izq[i]=dato1[j];	
				j++;
				dato1izq[i+1]=dato1[j];
				j++;
			}
			for(int i=0;i<q-1;i+=2) {
				dato1der[i]=dato1[j];		
				j++;
				dato1der[i+1]=dato1[j];
				j++;
			}
			j=0;
			dato1izq=mergesort(dato1izq,l);
			dato1der=mergesort(dato1der,m);
			
				int f=0,e=0,r=0;
				while(dato1izq.length!=f && dato1der.length!=e) {
					
					if(dato1izq[f]<dato1der[e]) {
						dato1[r]=dato1izq[f];
						r++;
						f++;
						dato1[r]=dato1izq[f];
						f++;
						r++;
					}	
					else {
						if(dato1izq[f]==dato1der[e]){				
							if(dato1izq[f+1]<dato1der[e+1]) {
								dato1[r]=dato1izq[f];
								r++;
								f++;
								dato1[r]=dato1izq[f];
								f++;
								r++;
							}
							else {
								dato1[r]=dato1der[e];
								e++;
								r++;
								dato1[r]=dato1der[e];
								e++;
								r++;
							}
						}
						else {
						dato1[r]=dato1der[e];
						r++;
						e++;
						dato1[r]=dato1der[e];
						e++;
						r++;				
						}
					}
				}//while
				while(dato1izq.length>f) {
					dato1[r]=dato1izq[f];
					r++;
					f++;
					dato1[r]=dato1izq[f];
					f++;
					r++;
				}
				
				while(dato1der.length>e) {
					dato1[r]=dato1der[e];
					r++;
					e++;
					dato1[r]=dato1der[e];
					e++;
					r++;	
				}
				
			}//Cierre_if
		return dato1;
		}
}//cierre_clase
