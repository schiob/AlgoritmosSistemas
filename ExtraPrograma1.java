import java.util.Scanner;
public class Libros {
    public static void merge(int arr[], int beg, int mid, int end){  
        int l = mid - beg + 1;  
        int r = end - mid;  
  
        int LeftArray[] = new int [l];  
        int RightArray[] = new int [r];  

        for (int i=0; i<l; ++i)  
        LeftArray[i] = arr[beg + i];  

        for (int j=0; j<r; ++j)  
        RightArray[j] = arr[mid + 1+ j];  


        int i = 0, j = 0;  
        int k = beg;  

        while (i<l&&j<r){  
        if (LeftArray[i] <= RightArray[j])  
        {  
        arr[k] = LeftArray[i]; 
        i++;
            }  

        else {  
        arr[k] = RightArray[j];  
            j++;  
          }  
            k++;  
            }  

        while (i<l) {  
        arr[k] = LeftArray[i];  
            i++;  
            k++;  
        }  

        while (j<r) {  
        arr[k] = RightArray[j];  
            j++;  
            k++;  
            }  
          }     
  
    void sort(int arr[], int beg, int end)  
        {  
        if (beg<end)  {  
        int mid = (beg+end)/2;  
        sort(arr, beg, mid);  
        sort(arr , mid+1, end);  
        merge(arr, beg, mid, end);  
              }  
          }  
   private String nombre;
   private int pagina;
   
   public Libros(){
   nombre = "";
   pagina = 0;
}
   
   public Libros(String nom, int pag){
      nombre = nom;
      pagina = pag;
   }
    public String getNombre()
    {return nombre;}
    
    public void setNombre(String nuevoNom)
    {nombre=nuevoNom;}
    
    public int getPagina()
    {return pagina;}   

    public void setPagina(int nuevaPag)
    {pagina = nuevaPag;}
    
    public String toString()
    {String datos="";
    datos += nombre + " ";
    return datos;}
    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int n = entrada.nextInt();
       entrada.nextLine();
       int paginas;
       String nombren, line;
       String []z = new String [2];
       int []nump = new int [n] ;
       Libros [] lib;
       lib = new Libros[n];

      for(int i = 0; i < n; i++){
         line = entrada.nextLine();
          z = line.split(" ", 2);
          nombren = String.valueOf(z[0]); 
          paginas = Integer.valueOf(z[1]); 
          lib[i] = new Libros(nombren, paginas);
          }
        // nump[0] = lib[0].getPagina();
         for(int i = 0; i < n ; i++){
            nump[i] = lib[i].getPagina();  
      }
         String librossort[] = new String [n];
         Libros ob = new Libros();  
          ob.sort(nump, 0, nump.length-1);

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
             if(nump[i] == lib[j].getPagina()){
              librossort[i] =  lib[j].getNombre();
            }
           } 
        }
         
       for(int i=0; i<n; i++){
          System.out.print(librossort[i] + " ");
      }

    }
}