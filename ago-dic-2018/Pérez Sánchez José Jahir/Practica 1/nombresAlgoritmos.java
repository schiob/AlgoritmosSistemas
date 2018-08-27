package algoritmos;
public class nombresAlgoritmos {
    public static void main(String[] args) {
        String[]nombres={"Juan","Pepe","Luis","Juan"};
        int maximo=0;
        String Elmayor="";
        for (int i = 0; i < nombres.length; i++) {
            int q=0;
            for (int j = 0; j < nombres.length; j++) {           
                if(nombres[i]==nombres[j]){
                    q++;
                }
                if(q>maximo){
                    Elmayor=nombres[i];
                }
                maximo=q;
               
            }
        }
        System.out.println(Elmayor +"\t"+ maximo);
    }
    
}
