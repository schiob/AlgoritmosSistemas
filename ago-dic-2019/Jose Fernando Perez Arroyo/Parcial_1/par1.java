/* package whatever; 
// don't place package name!
 */

import java.util.*;

import java.lang.*;

import java.io.*;


/* Name of the class has to be "Main" only if the class is public.
 */
class Ideone
{

	 static void merge(int arr[], int l, int m, int r) 
    {
  
      int n1 = m - l + 1; 
      
  int n2 = r - m; 
  
     
   int L[] = new int [n1]; 
   
     int R[] = new int [n2]; 

       
 for (int i=0; i<n1; ++i) 
  
          L[i] = arr[l + i]; 
     
   for (int j=0; j<n2; ++j) 
          
  R[j] = arr[m + 1+ j];
        
  
      int i = 0, j = 0;
   
     int k = l; 
   
     while (i < n1 && j < n2) 
   {
 
            if (L[i] <= R[j]) 
            { 

                arr[k] = L[i]; 
          
      i++; 
          
  } 
          
  else
            { 
              
  arr[k] = R[j]; 
          
      j++; 
          
  } 
         
   k++; 
       
 } 
       
 while (i < n1) 
        { 
      
      arr[k] = L[i]; 
         
   i++; 
    
        k++; 
    
    } 
        while (j < n2) 
   { 
  
          arr[k] = R[j]; 
        
    j++; 
            k++; 
      
  } 
   
 } 
  
  
  static void sort(int arr[], int l, int r) 
    { 
     
   if (l < r) 
        { 
          
  int m = (l+r)/2; 
           
 sort(arr, l, m); 
          
  sort(arr , m+1, r); 
          
  merge(arr, l, m, r); 
       
 } 
   
 }
    
   
 static void printArray(String arr[], int org[], int sorted[]) 
    { 
   
     int n = arr.length; 
     
   for (int i=0; i<n; ++i) {
        
	for(int k=0; k<n; k++) {
        
		if (org[k] == sorted[i]) {
        		
	System.out.print(arr[k] + " ");
        		
}
        	
}
       
 }
       
 System.out.println(); 
   
 } 

	
public static void main (String[] args) throws java.lang.Exception
	{
	
	Scanner s = new Scanner(System.in);
		
int n = s.nextInt();
		
String nombres[] = new String[n];
	
	int duracion[] = new int[n];
		
for(int i=0; i<n; i++) {
		
	nombres[i] = s.next();
		
	duracion[i] = (s.nextInt()*60)+s.nextInt();
	
	}
		
int arr[] = duracion; 
        
sort(arr, 0, arr.length-1); 
  
   
     printArray(nombres, duracion, arr);
	
}
}