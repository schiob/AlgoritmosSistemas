package carta;
import java.util.ArrayList;
public class Carta implements Comparable<Carta>{
    private int numero;
    private int valor;
    private String tipo;
    
    public Carta(int numero){
    int numtipo=numero/13;
    if (numtipo==0)
    tipo ="Trebol";
    
    else if(numtipo==1)
        tipo="Espadas";
    else if(numtipo==2)
        tipo="Corazones";
    else 
        tipo="Diamantes";
    }
   public String dartipo(){
        return tipo;
    }
    public int darValorNumero(){
        return valor;
    }
        public String darvalor(){
            if (valor==1) 
                return "As";
            else if(valor==11)
                return" Jota";
            else if(valor==12)
                return"Reina";
            else if(valor==13)
                return"Rey";
            else 
               return String.valueOf(valor);
        }
        public String darValorCarta(){
            String numero;
             numero=darvalor()+" de "+ dartipo();
             return numero;
        }
        public int compareTo(Carta c1){
            if (c1.valor==this.valor)
            return 0;
            else if(c1.valor > this.valor)
            return 1;
            else
                return -1;
                    }
        }
   


 public class Ordenar{
     private Carta cartas[];
     public Ordenar(){
         cartas = new Carta[6];
         elegirCartasAleatoriamente();
     }
     public Carta[]darCartas(){
         return cartas;
     }
     public void elegirCartasAleatoriamente(){
         Random rand = new Random();
         int carta;
         
         ArrayList cartasElegidas =new ArrayList(5);
         for (int i = 0; i < cartas.length; i++) {
             carta=rand.nextInt(52);
             while(cartasElegidas.contains(carta)){
                 carta =rand.nextInt(52);
             }
             cartasElegidas.add(carta);
             cartas[i]=new Carta(carta);
         }
             
         }
     public void ordenarCartas(){
         Carta temp;
         for (int n = 1; n < cartas.length; n++) {
             for (int m = n; m >0; m--) {
                 if (cartas[m].compareTo(cartas[m-1])>0) {
                     temp=cartas[m];
                     cartas[m]=cartas[m-1];
                     cartas[m-1]=temp;
                 }
                 else
break;                 
             }
             
         }
         
     }
 }
 
     
