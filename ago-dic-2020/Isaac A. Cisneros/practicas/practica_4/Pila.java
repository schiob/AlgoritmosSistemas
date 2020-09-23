

package palindromoapp;



import javax.swing.*;



public class Pila {

    private int top;
    private Object[] info;

    public Pila(int n) {
        top = -1;
        info = new Object[n];
    }

    public String getPila() {
        String salida = " ";
        for (int i = 0; i <= top; i++) {
            salida += info[i] + ", ";
        }
        return salida;
    }

    public void push(Object elemento) {
        if (top < info.length) {
            //agrega elementos en la pila 
            top++;
            info[top] = elemento;
        } else {
            System.out.println("Pila llena");
        }

    }

    public Object pop() {
        Object aux = null;
        if (top > -1) {
            aux = info[top];
            top--;
        } else {
            System.out.println("Pila vacia");
        }
        return aux;
    }

    public boolean isEmpty() {

        if (top == -1) {
            return true;
        } //Indica que la pila esta vacia
        else {
            return false;
        }
    }

}
