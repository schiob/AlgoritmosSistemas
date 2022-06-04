import java.util.*;
//Ejercicio 2 ordinario 
public class ordiej2 {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        String [] ss=s.nextLine().split(" ");
        int n=Integer.parseInt(ss[0]);
        String b=ss[1];
        String a [] = new String[n];
        ss=s.nextLine().split(" ");
        for (int i = 0; i < a.length; i++) {
            a [i] = ss[i];
        }
        System.out.println(busquedaBinaria(a,b,0,a.length));
    }
    public static int busquedaBinaria(String a[],String n,int Low,int High){
        if (High < Low)
            return -1; 
        else {
            int middle = (Low+High) / 2;
            if (n.compareTo(a[middle])<0&&n.length()<a[middle].length())
                return busquedaBinaria(a, n, Low, middle-1);
            else if (n.compareTo(a[middle])>0&&n.length()>a[middle].length())
                return  busquedaBinaria(a, n, middle + 1, High);
            else
                return middle+1;  
        }
    }
}
