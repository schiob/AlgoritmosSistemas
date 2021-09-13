
package practicas;


public class LinkedList {
public Element head;
public int count,valorF,valorI;
LinkedList(){
    head = null;
  
}

public void preppend(int dato){
    Element tmp;
    tmp = new Element();
    tmp.datum = dato;
    tmp.next = head;
    head = tmp;

    
}

public void append(int dato){
    Element tmp;
    tmp = new Element();
    tmp.datum = dato;
    tmp.next = null;
    
    if(head == null){
        head = tmp;

    }
    else{
    Element aux = head;
    while (aux.next != null){
aux = aux.next;
    }
   aux.next = tmp;

}

}

public void imprimir(){
Element tmp;
tmp = head;
while (tmp!=null){
    System.out.println(tmp.datum);
    tmp = tmp.next;
}
 
}

public void eliminaDato(int datoAbuscar){
    Element aux = head;
    while(aux.next != null){
        while (aux.next.datum == datoAbuscar && aux.next.next != null){
            aux.next = aux.next.next;
        }
        if(aux.next.next == null && aux.next.datum == datoAbuscar){
            aux.next = null;
        break;
        }
     if (datoAbuscar == head.datum){
            head = head.next;
            } 
    aux = aux.next;
    }    
}

public void quitaInPares(){
Element tmp;
tmp = head;
while (tmp!=null){
    if(tmp.datum%2 != 0)
    eliminaDato(tmp.datum);
    tmp = tmp.next;
}
 
}


}
