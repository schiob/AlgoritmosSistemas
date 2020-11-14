import java.util.Scanner;

public class Parcial2E1
{
    public static void main (String[]arg)
    {
      Scanner f= new Scanner(System.in);
      System.out.println("numero de libros en la estanteria y cual buscas");
      String nyl=f.nextLine();// linea  n string
      String [] aux=nyl.split(" "); // n
      int n=Integer.parseInt(aux[0]);//n
      String book = aux[1];//string
      System.out.println("Libros");
      String [] est = new String[n]; //libros
      String books=f.nextLine();
      String [] aux2=books.split(" ");
      for(int i=0;i<n;i++)
      {
          est[i]=aux2[i];
      }

      for (int i= 0; i < n; i++)
      {
          if(est[i].equals(book))
          {
              System.out.println(i+1);
          }
      }
    }
}
