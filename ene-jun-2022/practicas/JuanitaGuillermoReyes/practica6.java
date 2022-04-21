

import java.util.Scanner;

public class practica6 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
       
        System.out.println("Ingresa el numero de participantes:");
        int O,P,B;  
        int e = s.nextInt();
        String nombre [] = new String[e];
        String nombress;
                System.out.print("\n");
                System.out.println("Ingrese participantes con numeros de medallas ");
               //se ponte esto:(entrada) David 10 8 0
               //                        Mario 10 7 2
               //                        Saul 12 0 4
               //                        Francisco 10 7 0
              //                         Luis 12 0 4
               //                        Karla 15 5 0 
       
        int oro [] = new int[e];
        int plata [] = new int[e];
        int bronce [] = new int[e];
        for (int i = 0; i < e; i++) {
            nombre[i]=s.next();
            oro[i] = s.nextInt();
            plata[i] = s.nextInt();
            bronce[i] = s.nextInt();
        }
        for(int c=0; c < (e-1); c++){
        for(int i=0; i< (e-1); i++){
            if(oro[i] < oro[i+1]){
                nombress = nombre[i];
                O = oro[i];
                P = plata[i];
                B = bronce[i];
                nombre[i] = nombre[i+1];
                nombre[i+1] = nombress;
                oro[i] = oro[i+1];
                oro[i+1] = O;
                plata[i] = plata[i+1];
                plata[i+1] = P;
                bronce[i] = bronce[i+1];
                bronce[i+1] = B;

            }

            else if (oro[i] == oro[i+1]) {
                if(plata[i] < plata[i+1]){
                    nombress = nombre[i];
                    O = oro[i];
                    P = plata[i];
                    B = bronce[i];
                    nombre[i] = nombre[i+1];
                    nombre[i+1] = nombress;
                    oro[i] = oro[i+1];
                    oro[i+1] = O;
                    plata[i] = plata[i+1];
                    plata[i+1] = P;
                    bronce[i] = bronce[i+1];
                    bronce[i+1] = B;

                }

                else if (plata[i] == plata[i+1]) {
                    if(bronce[i] < bronce[i+1]){
                        nombress = nombre[i];
                        O = oro[i];
                        P = plata[i];
                        B = bronce[i];
                        nombre[i] = nombre[i+1];
                        nombre[i+1] = nombress;
                        oro[i] = oro[i+1];
                        oro[i+1] = O;
                        plata[i] = plata[i+1];
                        plata[i+1] = P;
                        bronce[i] = bronce[i+1];
                        bronce[i+1] = B;

               }
                    else if (bronce[i] == bronce[i+1]) {
                        if((int)nombre[i].charAt(0) > (int)nombre[i+1].charAt(0)){
                        nombress = nombre[i];
                        nombre[i] = nombre[i+1];
                        nombre[i+1] = nombress;
                        }
                    }
                }
            }

        }
    }
                               System.out.println();    
                              for (int f = 0; f < e; f++) {
                             System.out.println(nombre[f]);
        }
    }

}

