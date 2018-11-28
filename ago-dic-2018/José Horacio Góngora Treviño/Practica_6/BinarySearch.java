
public class BinarySearch 
{
	public int BinarySearch(String a[], int inicio, int ultimo, String dato)
	{
		int mid = (inicio+ultimo)/2;
		
		if(inicio==ultimo)
		{
			if(a[inicio].compareTo(dato)==0)
			{
				return inicio;
			}
			return -1;
		}
		
		if(a[mid]==dato)
		{
			return mid;
		}
		
		if(a[mid].compareTo(dato)>0 )
		{
			if(a[mid-1].compareTo(dato)==0)
				return mid-1;
			return BinarySearch(a,inicio,mid-1,dato);
		}
		
		if(a[mid].compareTo(dato)<0)
		{
			return BinarySearch(a,mid+1,ultimo,dato);
		}
		return mid;
		
	}
}
