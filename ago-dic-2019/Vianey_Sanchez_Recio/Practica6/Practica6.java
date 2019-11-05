package practica6;
import java.util.Random;
public class Practica6 {
    public static void main(String[] args) {
        Paquetedecartas miPaqueteDeCartas = new Paquetedecartas();
  miPaqueteDeCartas.barajear();
  System.out.println("\n");
 for ( int i = 0; i < 13; i++ )
 { 
 System.out.printf("%-20s%-20s%-20s%-20s\n", 
 miPaqueteDeCartas.repartirCarta(), miPaqueteDeCartas.repartirCarta(),
 miPaqueteDeCartas.repartirCarta(), miPaqueteDeCartas.repartirCarta());
 }  

 System.out.println("\n");

 
 }     
public class Carta
 
 { 

 private String cara;
 private String palo;
 public Carta( String caraCarta, String paloCarta)
 {   
 cara = caraCarta;
 palo = paloCarta;

 }   

 public String toString()
 {   
 return cara + " de " + palo;
 }   
 } 
 
 public class PaqueteDeCartas

 {  
 private Carta paquete[];
 private int cartaActual;
 private final int NUMERO_DE_CARTAS = 52;
 private Random numerosAleatorios;

 
 public PaqueteDeCartas()
 {   

 String caras[] = { "AS", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE",
 "OCHO", "NUEVE", "DIEZ", "JOTA", "QUINA", "REY"};
 String palos[] = { "CORAZONES", "DIAMANTES", "TREBOLES", "ESPADAS"};

 paquete = new Carta[ NUMERO_DE_CARTAS ];
 cartaActual = 0;
 numerosAleatorios = new Random();

 for ( int cuenta = 0; cuenta < paquete.length; cuenta++ )
 paquete[ cuenta ] = new Carta( caras[cuenta % 13], palos[cuenta/13]); 
 }   



 public void barajear()
 {   
 cartaActual = 0;
 
 for ( int primera = 0; primera < paquete.length; primera++ )
 { 
 int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);
 
 Carta temp = paquete[primera];

 paquete[primera] = paquete[segunda];
 paquete[segunda] = temp;
 
 }  
 }   

 public Carta repartirCarta()
 {  
 if (cartaActual < paquete.length )
 return paquete[cartaActual++];
 else return null;
 }  
 }  
 }     
    
    

