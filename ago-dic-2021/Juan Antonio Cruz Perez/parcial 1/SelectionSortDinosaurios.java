package practicas;

import java.util.Scanner;

public class SelectionSortDinosaurios {

    public static void main(String[] args) {
String s = " ", n = " ";
Scanner l = new  Scanner(System.in);
         //cuantos problemas tiene
        /*inserto los dinosaurios separados por espacio en una cadena
      */
        s = l.nextLine();
        String[] dino = s.split("\\s+");
        //total de probleas
        //n = (dino[0]);
        for (int i = 0; i < dino.length; i++) {
            System.out.println(dino[i]);
        }    
        


        System.out.println("Ordenamiento -------");
int aux=0;
        for (int i = 0; i < dino.length; i++) {
            String mP = dino[i];
            for (int j = i+1; j < dino.length; j++) {
                if (mP.length() < dino[j].length()) {
                    continue;
                }
                if(dino[j].length() < mP.length())
                    mP = dino[j];
                   aux = j;            
            }
         dino[aux]= dino[i];
         dino[i]= mP;
        }

//        for (int i = a.length-1; i >=0; i--) {
//            System.out.println(a[i]);
//        }

        for (int i = dino.length-1; i >= 0; i--) {
            System.out.println(dino[i]);
        }
        
        
    }
}
