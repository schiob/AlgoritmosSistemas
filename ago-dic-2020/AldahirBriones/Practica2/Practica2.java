import java.util.Scanner;
public class Practica2
{
    public static void main (String[]args)
    {
        Scanner f = new Scanner (System.in);
        int n, m;
        
        System.out.println("Cuantos problemas puede hacer y cuanto tiempo tiene?");
        n = f.nextInt();
        m = f.nextInt();
        
        System.out.println("Cuanto tiempo le toma por cada problema?");
        int [] Arre = new int [n];
        for (int i = 0;i < Arre.length;i++)
        {
            Arre [i] = f.nextInt();
        }
        
        for (int i = 1;i < Arre.length;i++)
        {
            int Act = Arre[i];
            int J = i-1;
            while (J >=0 && Arre [J] > Act)
            {
                Arre [J+1] = Arre [J--];
            }
            Arre [J+1] = Act;
        }
        int Suma = 0;
        int C = 0;
        
        for (int i = 0; i < Arre.length;i++)
        {
            if (Suma < m)
            {
                Suma += Arre [i];
                C ++;
            }
        }
        
        System.out.println("Solo puede hacer "  + C);
    }
}
