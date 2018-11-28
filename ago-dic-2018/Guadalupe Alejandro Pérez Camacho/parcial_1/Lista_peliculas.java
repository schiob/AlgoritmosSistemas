package javaapplication5;
import java.util.*;
public class Lista_peliculas {
    public static void main (String[]args){
        String entrada;
        int numero_pelis;
        Scanner s=new Scanner(System.in);
        System.out.println("Número de películas a utilizar");
        numero_pelis = s.nextInt();
        s.nextLine();
        Pelicula [] p = new Pelicula[numero_pelis];
        for (int i = 0; i < numero_pelis; i++) {
            System.out.println("Escriba el titulo ya duracion en horas y minutos, separandolos por un espacio");
            entrada=s.nextLine();
            String [] temp=entrada.split(" ");
            String t;
            int temp1=0,temp2=0;
            for (int j = 0; j < temp.length; j++) {
                if (j==0) {
                    t=temp[0];
                }
                if (j==1) {
                    temp1=Integer.parseInt(temp[1]);
                }
                if (j==2) {
                    temp2=Integer.parseInt(temp[2]);
                }
            }
            p[i]=new Pelicula(temp[0],temp1,temp2);
        }
        
        for (int i = 0; i < p.length; i++) {
            for (int k = 1; k < p.length; k++) {
                if (p[k-1].getHoras()>p[k].getHoras()) {
                    String t=p[k-1].getNombre();
                    int t1=p[k-1].getHoras();
                    int t2=p[k-1].getMinutos();
                    p[k-1].setNombre(p[k].getNombre());
                    p[k-1].setHoras(p[k].getHoras());
                    p[k-1].setMinutos(p[k].getMinutos());
                    p[k].setNombre(t);
                    p[k].setHoras(t1);
                    p[k].setMinutos(t2);
                }
                if (p[k-1].getHoras()==p[k].getHoras()&&p[k-1].getMinutos()>p[k].getMinutos()) {
                    String t=p[k-1].getNombre();
                    int t1=p[k-1].getHoras();
                    int t2=p[k-1].getMinutos();
                    p[k-1].setNombre(p[k].getNombre());
                    p[k-1].setHoras(p[k].getHoras());
                    p[k-1].setMinutos(p[k].getMinutos());
                    p[k].setNombre(t);
                    p[k].setHoras(t1);
                    p[k].setMinutos(t2);
                }
            }
        }
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].getNombre());
        }
    }
}
