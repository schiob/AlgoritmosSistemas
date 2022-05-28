package algoritmos;
import java.util.Scanner;
		
public class Practica6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		
        System.out.println("¿Cuántos participantes son? ");
        int ORO,PLA,BRO;  
        int e = sc.nextInt();
        String nom [] = new String[e];
        String n;
        System.out.println("¿Cuál es el nombre del participante? ¿Cuantas medallas tiene?");
        
        int oro [] = new int[e];
        int pla [] = new int[e];
        int bro [] = new int[e];
        
        for (int i = 0; i < e; i++) {
            nom[i]=sc.next();
            oro[i] = sc.nextInt();   
            pla[i] = sc.nextInt();
            bro[i] = sc.nextInt();
        }
        
        for(int c=0; c < (e-1); c++){
            for(int i=0; i< (e-1); i++){
                if(oro[i] < oro[i+1]){
                    n = nom[i];
                    ORO = oro[i];		       
                    PLA = pla[i];
		    BRO = bro[i];
                    nom[i] = nom[i+1];
                    nom[i+1] = n;
                    oro[i] = oro[i+1];
                    oro[i+1] = ORO;
                    pla[i] = pla[i+1];
	            pla[i+1] = PLA;
	            bro[i] = bro[i+1];
                    bro[i+1] = BRO;
                }                    
                
                else if (oro[i] == oro[i+1]) {
                    if(pla[i] < pla[i+1]){
                        n = nom[i];
                        ORO = oro[i];
                        PLA = pla[i];
                        BRO = bro[i];
                        nom[i] = nom[i+1];
                        nom[i+1] = n;
                        oro[i] = oro[i+1];
                        oro[i+1] = ORO;
                        pla[i] = pla[i+1];
                        pla[i+1] = PLA;
	                bro[i] = bro[i+1];
                        bro[i+1] = BRO;
                }		
		
                    else if (pla[i] == pla[i+1]) {
                        if(bro[i] < bro[i+1]){
                            n = nom[i];
                            ORO = oro[i];
                            PLA = pla[i];
                            BRO = bro[i];
                            nom[i] = nom[i+1];
                            nom[i+1] = n;
                            oro[i] = oro[i+1];
                            oro[i+1] = ORO;
                            pla[i] = pla[i+1];
                            pla[i+1] = PLA;
                            bro[i] = bro[i+1];
                            bro[i+1] = BRO;
                        }
                        else if (bro[i] == bro[i+1]) {
                            if((int)nom[i].charAt(0) > (int)nom[i+1].charAt(0)){                            
                                n = nom[i];
                                nom[i] = nom[i+1];
                                nom[i+1] = n;
                            }
                        }
                    }
                }                
            }
        }
        System.out.println();    
        for (int i=0; i<e; i++) {
            System.out.println(nom[i]);
        }
    }    
}