package algoritmos;

import java.util.Scanner;
import java.util.*;

public class elbetsy {
  

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        
        System.out.println("Nodos,Aristas,Betsy");
        int N=sc.nextInt();
        int A=sc.nextInt();
        int B=sc.nextInt();
        
        int matriz [][]=new int[N][N];
        
        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]=0;                
            }
        }
            
        for (int k = 0; k < matriz.length; k++) {
            System.out.println("\n");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("["+ matriz[k][j]+"]"+ "\t");   
            }    
        }
            System.out.println("\n");
            System.out.println("Agregar aristas");
            for (int h = 0; h < A; h++) {
                System.out.println("Primer numero");
                int v1=sc.nextInt();
                System.out.println("Segundo numero");
                int v2=sc.nextInt();
                int r=0,l=0;
              if(matriz[v1-1][r]==0){
                  matriz[v1-1][r]=v2;
              }else{
                  r++;
                  matriz[v1-1][r]=v2;
              }
               if(matriz[v1][l]==0){
                  matriz[v1][l]=v1;
              }else{
                  l++;
                  matriz[v1][l]=v2;
              } 
            }
         for (int k = 0; k < matriz.length; k++) {
            System.out.println("\n");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("["+ matriz[k][j]+"]"+ "\t");   
            }    
        }
        int visit[]=new int[N];
        for (int i = 0; i < visit.length; i++) {
            visit[i]=0;
        }
        int desde[]=new int[N];
        for (int i = 1; i < desde.length; i++) {
            desde[i]=-1;
        }
         
        
        Stack<Integer> next=new Stack<>();
     
        for (int i = 1; i < N; i++) {
            desde[i]=-1;
        }       
        System.out.println(Arrays.deepToString(matriz).replaceAll("],", "]," + System.getProperty("line.separator")));
      
        next.push(0);
        while (!next.isEmpty()&&B<visit.length) {
            int x=next.pop();
            int z=0;
            if (visit[x]==0) {
                visit[x]=1;
                while(matriz[x][z]!=0) {
                    next.push(matriz[x][z]);
                    
                    if(desde[matriz[x][z]]==-1){
                        desde[matriz[x][z]]=x;
                    }
                    
                    z++;
                }
                z=0;     
    } 
}
  System.out.println("visit"+Arrays.toString(visit));
        System.out.println("desde"+Arrays.toString(desde));
        int c=B;
        String st=""+B;
        while (desde[c]!=-1&&c!=0) {
            c=desde[c];
            st+=" "+c;
        }
        System.out.println(st);
}
}
