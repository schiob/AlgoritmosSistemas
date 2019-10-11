package titulo;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class VectorTitulo {
    Scanner sc=new Scanner(System.in);
    Titulo[]v;
    public VectorTitulo(int n){
        v=new Titulo[n];
    }
    public String toString() {
        return Arrays.toString(v);
    }
    public void generar(Scanner sc){
        Random r =new Random();
        for (int i = 0; i <v.length; i++) {
            System.out.println("Titulo"+(i+1)+"\t");
            System.out.println("nombre_libro");
            String nom_lib=sc.next();
            int paginas=r.nextInt(5);
            v[i]=new Titulo(nom_lib,paginas);
            
        }
    }
public void mergeSortPorpaginas(int menor,int mayor){
    int j;
    int i;
    if (mayor>1) {
        i=mayor/2;
        j=mayor-i;
        mergeSortPorpaginas(menor,i);
        mergeSortPorpaginas(menor+i,j);
        merge(menor,i,j);
    }
}
private void merge(int primero,int i,int j){
    Titulo aux[]=new Titulo[i+j];
    int temp=0;
    int temp1=0;
    int temp2=0;
    while (temp1<1 && temp2<j){
        if (v[temp1].getPaginas()<v[primero+i+temp2].getPaginas()) {
           aux[temp++]=v[primero+(temp2++)]; 
        }else{
           aux[temp++]=v[primero+(temp2++)];  
        }
        
    }
    while (temp1<i){
        aux[temp++]=v[primero+(temp1++)];
    }
    while (temp2<j){
        aux[temp++]=v[primero+(temp2++)];
    }
    for (int k = 0; k < 10; k++) {
        v[primero+k]=aux[k];
    }
}
}


