package practicas;

public class PracticaDos {

    public static void main(String[] args) {
        LinkedList lista = new LinkedList();

        lista.preppend(3);
        lista.preppend(43);
        lista.preppend(2);
        lista.preppend(5);
        lista.preppend(4);
        lista.preppend(6);
        lista.preppend(5);
        lista.preppend(4);
        lista.preppend(334);
        lista.preppend(45);
        lista.preppend(23);
        lista.preppend(123);
        lista.preppend(323);
        lista.preppend(45);
        lista.preppend(34);
        lista.preppend(23);
        lista.preppend(43);
        lista.preppend(5);
        lista.preppend(46);
        lista.preppend(78);
        
        
        
        lista.imprimir();

        System.out.println("--------------------");
        lista.quitaInPares();
        lista.imprimir();

    }
}
