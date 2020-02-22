import java.util.Scanner;
import java.util.Collections;
public class pract5{

    public static void main(String args[]) {
        Scanner consola = new Scanner(System.in);
        int n=0;
        n=consola.nextInt();
        int[]N_concursantes = new int[n];
        int[]oro= new int[n];
        int[]plata = new int[n];
        int[] bronce = new int [n];
        int oaux=0;
        int paux=0;
        int baux=0;
        String naux="";
    
        String[]nombre=new String[n];
    
        for(int i=0;i<N_concursantes.length;i++) {
            nombre[i]=consola.next();
            oro[i]=consola.nextInt();
            plata[i]=consola.nextInt();
            bronce[i]=consola.nextInt();
        }
        ///bouble sort
        for(int i=1; i<N_concursantes.length;i++) {
            int j=0;
            int h=1;
            while(h!=N_concursantes.length) {
                
                if(oro[h]>oro[j]){
                    
                    oaux=oro[h];
                        paux=plata[h];
                            baux=bronce[h];
                                naux=nombre[h];
                                
                    oro[h]=oro[j];
                        plata[h]=plata[j];
                            bronce[h]=bronce[j];
                                nombre[h]=nombre[j];
                                
                    oro[j]=oaux;
                        plata[j]=paux;
                            bronce[j]=baux;
                                nombre[j]=naux;
                }//if oro    
                    
                else {
                    if(oro[h]==oro[j]) {    
                        if(plata[h]>plata[j]){ 
                            

                            oaux=oro[h];
                                paux=plata[h];
                                    baux=bronce[h];
                                        naux=nombre[h];
                                        
                            oro[h]=oro[j];
                                plata[h]=plata[j];
                                    bronce[h]=bronce[j];
                                        nombre[h]=nombre[j];
                                        
                            oro[j]=oaux;
                                plata[j]=paux;
                                    bronce[j]=baux;
                                        nombre[j]=naux;
                        }//if plata
                        else {
                            if(plata[h]==plata[j]) {
                                
                                if(bronce[h]>bronce[j]){ 
                                    

                                    oaux=oro[h];
                                        paux=plata[h];
                                            baux=bronce[h];
                                                naux=nombre[h];
                                                
                                    oro[h]=oro[j];
                                        plata[h]=plata[j];
                                            bronce[h]=bronce[j];
                                                nombre[h]=nombre[j];
                                                
                                    oro[j]=oaux;
                                        plata[j]=paux;
                                            bronce[j]=baux;
                                                nombre[j]=naux;
                                    
                            }
                            
                            else {
                                if(bronce[h]==bronce[j]) {
                                    
                                    if(nombre[j].compareTo(nombre[h])>0) {
                                        


                                        oaux=oro[h];
                                            paux=plata[h];
                                                baux=bronce[h];
                                                    naux=nombre[h];
                                                    
                                        oro[h]=oro[j];
                                            plata[h]=plata[j];
                                                bronce[h]=bronce[j];
                                                    nombre[h]=nombre[j];
                                                    
                                        oro[j]=oaux;
                                            plata[j]=paux;
                                                bronce[j]=baux;
                                                    nombre[j]=naux;
                                        
                                    }
                                }
                                
                            }
                                
                            }//if plata==
                        }//else plata
                    }//if oro==
                }//else oro
                    j++;
                    h++;
            }//while
                         
            }//for
                
                
                for(int i=0;i<nombre.length;i++){
                System.out.print(nombre[i]);
                System.out.print("\n");
                
                }
    
        
    }//cierre_main
}//_cierre_clase
