package Actividades__P2;

import java.io.*;

public class Secuancial_Search {
	 static void indexedSequentialSearch(String arr[], int n, String k)
{
String elements[] = new String[20];
int indices[] = new int[20];
int temp, i;
int j = 0, ind = 0, start = 0, end = 0, set = 0;
for (i = 0; i < n; i += 3) {

// Storing element
elements[ind] = arr[i];

// Storing the index
indices[ind] = i;
ind++;
}
if (elements[0].equals(k)) {
System.out.println("Not found");
return;
}
else {
for (i = 1; i <= ind; i++)
if (k.equals(elements[i])) {
start = indices[i - 1];
set = 1;
end = indices[i];
break;
}
}
if (set == 0) {
start = indices[i - 1];
end = n;
}
for (i = start; i <= end; i++) {
if (arr[i].equals(k)) {
j = 1;
break;
}
}
if (j == 1)
System.out.println("Encontrado en el indice: " + i);
else
System.out.println("No encontrado");
}

// Driver code

public static void main(String[] args)
{
String arr[] = { "Calculo2Deitel", "CalculoForDummies", "AlgebraLineal", "TeoriaDeNumeros", "TheMangaGuideToCalculus" };
int n = arr.length;

// Element to search
String k = "CalculoForDummies";
indexedSequentialSearch(arr, n, k);
}

}
