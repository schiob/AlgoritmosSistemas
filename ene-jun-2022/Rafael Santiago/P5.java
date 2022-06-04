
package p5;
import java.util.Scanner;
public class P5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cm, cc;
    String m1[][],m,c,c2,c1,r;
        System.out.println("¿Cuantas manos seran?");
        cm=Integer.parseInt(s.nextLine());
        m1=new String [cm][];
        for (int i = 0; i < cm; i++) {
            System.out.println("¿Cuantas cartas seran?");
            cc=Integer.parseInt(s.nextLine());
            m1[i] = new String[cc];
            for (int j = 0; j < cc; j++) {
                System.out.println("Introduce la carta");
                c1=s.nextLine();
                m1[i][j]=c1;
            }
        }
        
        String valor1="A 2 3 4 5 6 7 8 9 T J Q K";
        String valor2="E C T D";
        
        for (int h = 0; h < cm; h++) {
            for (int j = 0; j < m1[h].length; j++) {
                for (int i = 1; i < m1[h].length; i++) {
                    if(valor1.indexOf(m1[h][i-1].charAt(0)) > valor1.indexOf(m1[h][i].charAt(0))){
                        String nom=m1[h][i-1];
                        m1[h][i-1]=m1[h][i];
                        m1[h][i]=nom;
                    }
                    else if(valor1.indexOf(m1[h][i-1].charAt(0)) == valor1.indexOf(m1[h][i].charAt(0))){
                        if(valor2.indexOf(m1[h][i-1].charAt(1)) > valor2.indexOf(m1[h][i].charAt(1))){
                            String nom=m1[h][i-1];
                            m1[h][i-1]=m1[h][i];
                            m1[h][i]=nom;
                        }
                    }
                }
            }
            
        }
        r="";
        for (int v = 0; v < cm; v++) {
            for (int i = 0; i < m1[v].length; i++) {
                r+=m1[v][i]+" ";   
            }
            r+="\n";
        }
        System.out.println(""+r+"\n");
    }
}
    
    

