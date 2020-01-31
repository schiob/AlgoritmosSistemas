
import java.util.Scanner;
import java.lang.String;
public class suma2 {
   public static void main(String[] args){
      String cad;
      double suma=0;
      Scanner s= new Scanner(System.in);
      cad= s.nextLine();
      String [] temp=cad.split("\\s+");
      double part1=Double.valueOf(temp[0]);
      double part2=Double.valueOf(temp[1]); 
      suma=part1+part2;
      System.out.println((suma));
    }

    }
  
