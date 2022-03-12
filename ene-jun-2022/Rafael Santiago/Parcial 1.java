package parcial.pkg1;
import javax.swing.JOptionPane;
public class Parcial1 {

    public static void main(String[] args) {
        String leer;
        int o=0;
        opciones f = new opciones();
        do {
            leer=JOptionPane.showInputDialog("¿Qué ejercicio te gustaría revisar?\n1.Ejercicio 1.\n2.Ejercicio 2.\n3.Salir.");
            o=Integer.parseInt(leer);
                switch(o){
                    case 1:
                        f.e1();
                        break;
                    case 2:
                        f.e2();
                        break;
                }
                break;
        } while (o!=3);
        
    }
    
}

