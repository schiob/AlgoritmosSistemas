
package salon;

import java.util.Scanner;
public class Pelicula{
   private String nombre;
   private int hra;
   private int min;
   
   public Pelicula(){
   nombre = "";
   hra = 0;
   min = 0;
}
   
   public Pelicula(String nom, int hr, int minu){
      nombre = nom;
      hra = hr;
      min = minu;
   }
    public String getNombre()
    {return nombre;}
    
    public void setNombre(String nuevoNom)
    {nombre=nuevoNom;}
    
    public int getHra()
    {return hra;}   

    public void setHra(int nuevaHra)
    {hra = nuevaHra;}
    
     public int getMin()
    {return min;}   

    public void setMin(int nuevoMin)
    {min = nuevoMin;}
    
    public String toString()
    {String datos="";
    datos += nombre + " ";
    return datos;}
    
    public static void main(String[] args) {
       
       Scanner s = new Scanner(System.in);
       
       int n = s.nextInt();
       int hora, minuto;
       String nombren, line, res;
       String []z=null;
       Pelicula [] pel;
       pel = new Pelicula[n];
       res = s.nextLine();
      for(int i = 0; i < n; i++){
         line = s.nextLine();
          z =line.split("\\s+", 3);
          nombren = String.valueOf(z[0]); 
          hora = Integer.valueOf(z[1]); 
          minuto = Integer.valueOf(z[2]);
          pel[i] = new Pelicula(nombren, hora, minuto);
          }
      
         int j = 0, l = 0, r = 0, y = 0;
         String p;
         
         for(int i = 1; i < n ; i++){
             p = String.valueOf(pel[i].getNombre().charAt(0));
             j = pel[i].getHra();
             r = pel[i].getMin();
             Pelicula h = pel[i];
             y = i;
             l = i;
          while(l>0 && pel[l-1].getHra() < j||l>0 && pel[l-1].getMin()< r && j==pel[i].getHra()||l>0 && pel[l-1].getMin()< r && j==pel[i].getHra() && p.equals("A")){
             pel[l] = pel[l-1];
               l-=1;
          }
          
          pel[l] = h;
          
      }
       for(int i=0; i<n; i++){
          System.out.print(pel[i].toString());
       }
      /*String res = s.nextLine();
      line = s.nextLine();
      
      z = line.split("\\s+", 3);
      
      for(int i = 0; i < z.length;i++){
         System.out.println(z[i]);
      }*/

    }
}

