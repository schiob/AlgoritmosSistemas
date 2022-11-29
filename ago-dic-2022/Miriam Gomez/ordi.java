
package algoritmosp;


public class ordi{ 
String name; int moro;
    public ordi(String nombre, int prioridad){
        name=nombre;
        moro=prioridad;
        
        
    }
    public long getvalue(){
        return moro ;
    }
@Override
public String toString(){
    return name+"   prioridad:"+moro;
  
}    
    
    
    
}

