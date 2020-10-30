import java.util.*;
public class LaVacaLoca {
    public static void main(String[]args){
        long inicio = System.currentTimeMillis();
        //creo la lista de adyacencia con una mtrís de tipo Integer para que sus casillas se inicialicen con null
        Integer adj[][];
        Scanner s=new Scanner(System.in);
        System.out.println("Corrales, caminos, Betsy");
        String st=s.nextLine();
        //divido el string para usar cada numero individualmente
        String temp []=st.split(" ");
        //declaro arrays de visit y desde y las variables para corral caminos y donde está betsy
        int visit[],n=Integer.parseInt(temp[0]),e=Integer.parseInt(temp[1]),B=Integer.parseInt(temp[2]),desde[];
        //le doy las dimenciones a la lista de adyacencia(matriz) y a los arrays
        adj=new Integer[n][n];
        visit=new int[n];
        desde=new int[n];
        //creo la cola para recorrer el grafo
        Stack<Integer> next=new Stack<>();
        //inicializo desde en -1 ecepto la casilla 0
        for (int i = 1; i < n; i++) {
            desde[i]=-1;
        }
        //se llena la lista de adyacencia(matriz)
        for (int i = 0; i < e; i++) {
            st=s.nextLine();
            temp=st.split(" ");
            int j=0,a=Integer.parseInt(temp[0]),b=Integer.parseInt(temp[1]);
            while (adj[a][j]!=null) {
                j++;
            }
            adj[a][j]=b; j=0;
            while (adj[b][j]!=null) {
                j++;
            }
            adj[b][j]=a; j=0;
        }
        System.out.println(Arrays.deepToString(adj).replaceAll("],", "]," + System.getProperty("line.separator")));
        //el recorrido del grafo es desde el nodo 0
        next.push(0);
        while (!next.isEmpty()&&B<visit.length) {
            int x=next.pop();
            int z=0;
            if (visit[x]==0) {
                visit[x]=1;
                while(adj[x][z]!=null) {
                    next.push(adj[x][z]);
                    //si el valor de la casilla desde es igual a -1 se actualiza
                    if(desde[adj[x][z]]==-1){
                        desde[adj[x][z]]=x;
                    }
                    
                    z++;
                }
                z=0;
            }
        }
        System.out.println("visit"+Arrays.toString(visit));
        System.out.println("desde"+Arrays.toString(desde));
        int c=B;
        st=""+B;
        while (desde[c]!=-1&&c!=0) {
            c=desde[c];
            st+=" "+c;
        }
        System.out.println(st);
        long fin = System.currentTimeMillis();
         
        long tiempo =((fin - inicio));
         
        System.out.println(tiempo);
    }
}
