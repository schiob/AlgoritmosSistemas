import java.util.Scanner;
public class Practica3
{
    public static void main (String[]args)
    {
        Scanner f = new Scanner(System.in);
        
        System.out.println("Cuantos Pokémon capturaste?");
        int P = f.nextInt();
        
        System.out.println("De cuantos PC es cada uno?");
        int [] PC = new int [P];
        for (int i = 0;i < PC.length;i++)
        {
            PC [i] = f.nextInt();
        }
        
        int j = 0;
        for (int i = 1; i < PC.length;i++)
        {
            int aux = PC[i];
            
            for (j = i-1; j >= 0;j--)
            {
                if (aux < PC[j])
                {
                    break;
                }
                else
                {
                    PC [j+1] = PC[j];
                }
                
            }
            PC [j+1] = aux;
        }
        for (int s = 0; s < PC.length;s++)
        {
            System.out.print(PC[s] + "PC ");
        }
    }
}
