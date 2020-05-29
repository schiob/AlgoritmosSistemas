#include <iostream>
#include <cstdio>

using namespace std;

int main(){

	int matriz[15][50], n,repisa, libro, pagina,posicion,b;
	
	for(int i=0; i<15; i++){
		for(int j=0; j<50; j++){
			cin>>matriz[i][j];
			char c=getchar();
		}
	}
	
	cin>>n;	
	
	for(int i=0; i<15; i++){
		for(int j=0; j<50; j++){
			if(n == matriz[i][j]){
				repisa = (i/5)+1;
				libro = (i%5)+1; 
				pagina = (j/5)+1;
				posicion = (j%5)+1;
				
				cout<<repisa<<' '<<libro<<' '<<pagina<<' '<<posicion<<'\n';
				return(0);						
			}
		}
	}
	cout<<"-1\n";
		
	return (0);
}
