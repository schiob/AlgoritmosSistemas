package javaapplication5;
import javax.swing.*;

public class JavaApplication5 {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog(null,"N° de registros a ingresar"));
        Alumno a[]=new Alumno[n];
        int q=n;
        String s="";
        String ss="";
        String Mayor_nombre="";
        int Mayor_contador=0;
        for (int i = 0; i < n; i++) {
            boolean flag=false;
            int c=0;
            s=JOptionPane.showInputDialog("Quedan "+q+" registros por ingresar ", "Nombre");
            while (a[c]!=null&&!a[c].getNombre().equalsIgnoreCase(s)) {
                c++;
            }
            if (a[c]!=null&&a[c].getNombre().equalsIgnoreCase(s)) {
                a[c].setContador(a[c].getContador()+1);
                flag=true;
            }
            if (flag==false) {
                a[c]=new Alumno(s);
            }
            q--;
        }
        int c=0;
        int b=0;
        Mayor_nombre=a[c].getNombre();
        Mayor_contador=a[c].getContador();
        c++;
        while (a[c]!=null) {
            if (a[c].getContador()>Mayor_contador) {
                Mayor_nombre=a[c].getNombre();
                Mayor_contador=a[c].getContador();
            }
            if (a[c].getContador()==Mayor_contador&&!a[c].getNombre().equalsIgnoreCase(Mayor_nombre)) {
                ss+=a[c].getNombre()+"\n";
            }
            c++;
        }
        System.out.println("Nombre más repetido: "+Mayor_nombre+"\nContador: "+Mayor_contador+"\n"+"Nombres igualmente repetidos: \n"+ss);
        
    }
    
}
