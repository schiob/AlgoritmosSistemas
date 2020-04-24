import java.util.*;
public class pract8 {
    
    public static void main(String args[]) {
        
        pract8 metodo = new pract8();
        Scanner consola = new Scanner(System.in);

        String[][]estante = new String[3][6];
        
        for(int i=0;i<3;i++) {
            for(int j=0;j<6;j++) {               
                estante[i][j]= consola.nextLine();
            }
        }        
        
        int encontrar1 = consola.nextInt();
        String encontrar = String.valueOf(encontrar1);
        
        boolean listo= false;//si se encuentra el numero se lansara esto
        
            for(int i=0;i<3;i++){
                for(int j=0;j<6;j++){
    
                   listo=metodo.busqueda(estante[i][j],encontrar,listo,i,j);
                
                if(listo==true) {
                    break;
                }
                }
            }
            if(listo==false) {
                System.out.print("-1");
            }
        
    }//cierre_main
     
    public boolean orden(String libro,String encontrar,boolean listo,int estante, int posicion,int hoja ) {
    	
    	String[]pagina = libro.split("\\,+");//separar string por espacios
        
        int residuo=0;
        int cociente=0;
        int indice=0;
        
    	 for(int i=0;i<pagina.length;i++) {
             
             if(pagina[i].equalsIgnoreCase(encontrar)==true) {
           
                     
                 System.out.print((estante+1)+" "+(1+posicion)+" "+(1+hoja)+" "+(1+i) );                
                 listo=true;
                 break;
             }//if equals
             else {    
             }
         }//cierre de for
    	 
         return listo;
         
    }//cierre meto2
 
    public boolean busqueda(String libro,String encontrar,boolean listo,int k, int l) {       
        
    	String[]pagina = libro.split("\\s+");//separar string por espacios
      
         for (int i=0;i<pagina.length;i++) {
        	 
        	 listo=orden(pagina[i],encontrar,listo,k,l,i);

        	 	if(listo==true) {
        	 		break;
        	 	}
            }    
           return listo;   
    }//cierre de busqueda
    
}//cierre_clase