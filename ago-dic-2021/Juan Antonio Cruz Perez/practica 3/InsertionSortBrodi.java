package algoritmos;

import java.util.Scanner;

public class InsertionSortBrodi {//inicia clase

    public static void main(String[] args) {//inicia el main
        int n, m;
        int suma = 0;
        String s = "";
        String s2 = "";
        Scanner l = new Scanner(System.in);
        //cuantos problemas tiene
        /*inserto los numeros separados por espacio en una cadena
        primero los problemas que tiene y el tiempo que tiene*/
        s = l.nextLine();
        String num[] = s.split("\\s+");
        //total de probleas
        n = Integer.parseInt(num[0]);
        //de que tiempo dispone
        m = Integer.parseInt(num[1]);

        //inserte lo que se tarda en cada problema separado por espacio
        s2 = l.nextLine();
        String numM[] = s2.split("\\s+");
        for (int i = 0; i < numM.length; i++) {
            suma += Integer.parseInt(numM[i]);
        }

//        if(suma<=m){
//             System.out.println(numM.length); 
//        }else{
//            System.out.println(0 +"\n----------------");
//        }
        /*--------------Ord*/
        System.out.println("---------ord-------------");
        for (int i = 0; i < numM.length; i++) {//inicia for
            int t = i;
            for (int j = i - 1; j > -1; j--) {//inicia for anidado
                if (Integer.parseInt(numM[t]) > Integer.parseInt(numM[j])) {//inicia if
                    break;
                }/*termina el if*/ else if (Integer.parseInt(numM[t]) < Integer.parseInt(numM[j])) {//inicia else
                    int aux = Integer.parseInt(numM[t]);
                    numM[t] = numM[j];
                    numM[j] = String.valueOf(aux);
                    t--;
                }//termina el else
            }//termina el for anidado
        }//termina el primer for
        for (int r = 0; r < numM.length; r++) {
            if (Integer.parseInt(numM[r]) <= m) {
                System.out.println(numM[r]);
            }
        }
       
        System.out.println("---------------salida -----------------");
        
        int c = 0, np = 0;
        for (; c < numM.length; c++) {
            {
                if (Integer.parseInt(numM[c]) < m) {
                    np++;
                    m = m - Integer.parseInt(numM[c]);
                } else if (Integer.parseInt(numM[c]) > m && np != 0) {
                    System.out.println(np);
                    break;
                } else if (np == 0) {
                    System.out.println(0);
                 break;
                }
               
            }
        }
        }//termina el main

    }//termina clase
