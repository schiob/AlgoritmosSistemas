#include<iostream>
#include<conio.h>
#include<stdlib.h>
#include<time.h>
using namespace std;

int main()
{
	srand(time(NULL));
int num;
    cout<<"Tamaño del arreglo: "; 
	cin>>num;
 int arr[num];
 //se crean los numeros aleatorios
 for(int i=0;i<num;i++)
 {
 	arr[i]= 1 + rand() % (100);
 }
 
 //imprime los numeros
 for(int i=0;i<num;i++)
 {
 	cout<<"("<<arr[i]<<")";
 }    
 cout<<endl<<"Numero Ordenados"<< endl;
 
 //se ordenan los numeros
 //utilizando insertion sort
 for(int i=1;i<num;i++)
 {
 	int aux=arr[i];
 	for(int j=i-1;j>=0;j--)
    {
    	if(aux<arr[j])
        {
        	arr[j+1]=arr[j];
        	arr[j]=aux;
		}
    	
	}//cierre del segundo for
 	
 }//cierre del primer for 
 
 //imprime los numeros
 for(int i=0;i<num;i++)
 {
 	cout<<"("<<arr[i]<<")";
 }    




return 0;	
}
