package segundo_parcial;
import java.util.Arrays;
public class Segundo_parcial {
  public static int busquedabinaria(String[] arreglo, String num_libros,String busqueda) {
    int izquierda = 0, derecha = arreglo.length - 1;
 
    while (izquierda <= derecha) {
        int indiceDelElementoDelMedio = (int) Math.floor((izquierda + derecha) / 2);
        String elementoDelMedio = arreglo[indiceDelElementoDelMedio];
 
  int resultadoDeLaComparacion = num_libros.compareTo(elementoDelMedio);
 
        
        if (resultadoDeLaComparacion == 0) {
            return indiceDelElementoDelMedio;
        }
  if (resultadoDeLaComparacion < 0) {
            derecha = indiceDelElementoDelMedio - 1;
        } else {
            izquierda = indiceDelElementoDelMedio + 1;
        }
    }
 // en el peor de los casos cuando el elemento no existe  
  return -1;
}
  //prueba
    public static void main(String[] args) {
        String[] arreglo = { "5 CalculoForDummies\n" +
"Calculo2Deitel","CalculoForDummies"," AlgebraLineal","TeoríaDeNúmeros","TheMangaGuideToCalculus" };

String busqueda = "TeoriaDeNumeros";

   int indiceDelElementoBuscado = busquedabinaria(busqueda,arreglo.length - 1);
System.out.println("[binaria] -- El elemento buscado ("+busqueda ") se encuentra en el index "+ indiceDelElementoBuscado);
int indiceDelElementoBuscado = busquedabinaria(num_libros, busqueda, 0, arreglo.length - 1);
System.out.println("[binaria] -- El elemento buscado ("+ busqueda+ ") se encuentra en el index "+ indiceDelElementoBuscado);
indiceDelElementoBuscado = busquedabinaria(num_libros, busqueda);
System.out.println("[Con ciclo While] -- El elemento buscado ("+ busqueda+ ") se encuentra en el index "
+ indiceDelElementoBuscado);

    }
}


        
    

