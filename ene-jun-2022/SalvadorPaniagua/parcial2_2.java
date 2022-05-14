
package algoritmos.pkg2022;

import java.util.ArrayList;  
import java.util.Collections;  
import java.util.Comparator;  
import java.util.List;  
  
class parcial2_2 {  
  
int id;  
    String name;  
  
public parcial2_2(int id, String name) {  
this.id = id;  
this.name = name;  
    }  
public String toString()  
    {  
return this.id + " " + this.name ;  
  
    }  
}  
class SortPorID implements Comparator<parcial2_2> {  
public int compare(parcial2_2 a, parcial2_2 b)  
    {  
return a.id - b.id;  
    }  
}  
  
// Main class  
class Cointingsort {  
static int i=1;  
public static void main (String[] args) {  
        List<parcial2_2> list = new ArrayList<parcial2_2>();  
        parcial2_2 sucursal1 = new parcial2_2(375892, "periferico");  
        parcial2_2 sucursal2 = new parcial2_2(90334, "SanPedro");  
        parcial2_2 sucursal3 = new parcial2_2(203569, "abasolo");  
        parcial2_2 sucursal4 = new parcial2_2(403236, "guadalajara");  
        parcial2_2 sucursal5 = new parcial2_2(479983, "CDMX");  
        parcial2_2 sucursal6 = new parcial2_2(122112, "cancun");  
        parcial2_2 sucursal7 = new parcial2_2(200, "tlaxcala");  
        parcial2_2 sucursal8 = new parcial2_2(223221, "sonora");  


                
list.add(sucursal1);  
list.add(sucursal2);
list.add(sucursal3);  

list.add(sucursal4);  
list.add(sucursal5);  
list.add(sucursal6);  
list.add(sucursal7);  
list.add(sucursal8);  

System.out.println("Antes del sorted : ");  
for (parcial2_2 val : list) {  
System.out.println(i++ + ". "+val);  
        }  
Collections.sort(list, new SortPorID());  
System.out.println();  
System.out.println(" Despues de usar sorted : ");  
int i=1;  
for (parcial2_2 counting : list) {  
System.out.println(i++ +". "+counting);  
        }  
    }  
}  
