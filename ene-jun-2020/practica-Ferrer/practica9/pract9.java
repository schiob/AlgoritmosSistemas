import java.util.*;
public class pract9 {
				//GRafo con recorrido BFS(por anchura)
	public static void main(String args[]) {
		Scanner consola = new Scanner(System.in);
		pract9 metodo = new pract9();
		
		
		int nodos=consola.nextInt();
		int aristas=consola.nextInt();
		int juan=consola.nextInt();
		int posicion1=0,posicion2=0;
		
		int [][]matriz = new int[aristas][aristas] ;
		
		for(int i=0;i<aristas;i++) {
			posicion1=consola.nextInt();
			posicion2=consola.nextInt();
				matriz[posicion1][posicion2]=posicion2;
				//la posicion 1 seria como el indice i de una matriz y posicion 2 el indice j
				//para conocer el camino mas corto guardamos en esa coordenada el valor de la
				//posicion 2, ya que es lo que usaremos para hacer BFS
		}//i	
		
		metodo.BFS(matriz,juan,aristas);
	}//cierre main
	public void BFS(int [][]matriz,int encontrar,int aristas){	
	
			if(encontrar!=0) {
				for(int i=0;i<aristas;i++) {
					for(int j=0;j<aristas;j++) {
						
						if(matriz[i][j]==encontrar) {
							BFS(matriz,i,aristas);	
							break;
						}
					}//j
				}//i
			}//if
			if(encontrar==0){
			System.out.print(encontrar);
			}
			else{
				System.out.print(" "+encontrar);
			}
	}//BFS end
	
}//cierre clase
