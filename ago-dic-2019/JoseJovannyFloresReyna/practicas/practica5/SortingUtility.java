package ordenMergeSort;

import java.util.Comparator;

public class SortingUtility {
		 
		 
	    public static final int ASC_ORDER = 1;
	    public static final int DESC_ORDER = 2;
	 
	
	    private SortingUtility(){
	        throw new AssertionError();
	    }
	 
	    public static<T extends Comparable<T>> void sort(T []a){
	        mergeSort(a,0, a.length-1, ASC_ORDER);
	    }
	 
	    public static<T> void sort(T []a, Comparator<? super T>comparator){
	        mergeSort(a,0, a.length-1, ASC_ORDER,comparator);
	    }
	 
	    public static<T extends Comparable<T>> void sort(T []a,int order){
	        mergeSort(a,0, a.length-1, order);
	    }
	 
	    public static<T> void sort(T []a,int order, Comparator<? super T>comparator){
	        mergeSort(a,0, a.length-1, order,comparator);
	    }
	 
	    public static<T extends Comparable<T>> void mergeSort(T []a,int lowerIndex,int upperIndex,int order){
	        if(lowerIndex == upperIndex){
	            return;
	        }else{
	            int mid = (lowerIndex+upperIndex)/2;
	            mergeSort(a,lowerIndex,mid,order);
	            mergeSort(a,mid+1,upperIndex,order);
	 
	            if(order == ASC_ORDER){
	                mergeAsc(a,lowerIndex,mid+1,upperIndex);
	            }else if(order == DESC_ORDER){
	                mergeDesc(a,lowerIndex,mid+1,upperIndex);
	            }else{
	                throw new UnsupportedOperationException("Orden no especificada.");
	            }
	        }
	    }
	 
	    public static<T> void mergeSort(T []a,int lowerIndex,int upperIndex,int order, Comparator<? super T>comparator){
	        if(lowerIndex == upperIndex){
	            return;
	        }else{
	            int mid = (lowerIndex+upperIndex)/2;
	            mergeSort(a,lowerIndex,mid,order,comparator);
	            mergeSort(a,mid+1, upperIndex,order,comparator);
	 
	            if(order == ASC_ORDER){
	                mergeAsc(a,lowerIndex,mid+1,upperIndex,comparator);
	            }else if(order == DESC_ORDER){
	                mergeDesc(a,lowerIndex,mid+1,upperIndex,comparator);
	            }else{
	                throw new UnsupportedOperationException("Orden no especificada.");
	            }
	        }
	    }
	 
	    public static<T extends Comparable<T>> void mergeAsc(T []a,int lowerIndexCursor,int higerIndex,int upperIndex){
	        Object []tempArray = getTempArray(a.length);
	        int tempIndex=0;
	        int lowerIndex = lowerIndexCursor;
	        int midIndex = higerIndex-1;
	        int totalItems = upperIndex-lowerIndex+1;
	        while(lowerIndex <= midIndex && higerIndex <= upperIndex){
	            if(((Comparable<T>)a[lowerIndex]).compareTo(a[higerIndex]) < 0){
	                tempArray[tempIndex++] = a[lowerIndex++];
	            }else{
	                tempArray[tempIndex++] = a[higerIndex++];
	            }
	        }
	 
	        while(lowerIndex <= midIndex){
	            tempArray[tempIndex++] = a[lowerIndex++];
	        }
	 
	        while(higerIndex <= upperIndex){
	            tempArray[tempIndex++] = a[higerIndex++];
	        }
	 
	        for(int i=0;i<totalItems;i++){
	            a[lowerIndexCursor+i] = (T) tempArray[i];
	        }
	    }
	 
	 
	    public static<T> void mergeAsc(T []a,int lowerIndexCursor,int higerIndex,int upperIndex,Comparator<? super T>comparator){
	        Object []tempArray = getTempArray(a.length);
	        int tempIndex=0;
	        int lowerIndex = lowerIndexCursor;
	        int midIndex = higerIndex-1;
	        int totalItems = upperIndex-lowerIndex+1;
	        while(lowerIndex <= midIndex && higerIndex <= upperIndex){
	            if(comparator.compare(a[lowerIndex],a[higerIndex]) < 0){
	                tempArray[tempIndex++] = a[lowerIndex++];
	            }else{
	                tempArray[tempIndex++] = a[higerIndex++];
	            }
	        }
	 
	        while(lowerIndex <= midIndex){
	            tempArray[tempIndex++] = a[lowerIndex++];
	        }
	 
	        while(higerIndex <= upperIndex){
	            tempArray[tempIndex++] = a[higerIndex++];
	        }
	 
	        for(int i=0;i<totalItems;i++){
	            a[lowerIndexCursor+i] = (T) tempArray[i];
	        }
	    }
	 
	    public static<T extends Comparable<T>> void mergeDesc(T []a,int lowerIndexCursor,int higerIndex,int upperIndex){
	        Object []tempArray = getTempArray(a.length);
	        int tempIndex=0;
	        int lowerIndex = lowerIndexCursor;
	        int midIndex = higerIndex-1;
	        int totalItems = upperIndex-lowerIndex+1;
	        while(lowerIndex <= midIndex && higerIndex <= upperIndex){
	            if(((Comparable<T>)a[lowerIndex]).compareTo(a[higerIndex]) > 0){
	                tempArray[tempIndex++] = a[lowerIndex++];
	            }else{
	                tempArray[tempIndex++] = a[higerIndex++];
	            }
	        }
	 
	        while(lowerIndex <= midIndex){
	            tempArray[tempIndex++] = a[lowerIndex++];
	        }
	 
	        while(higerIndex <= upperIndex){
	            tempArray[tempIndex++] = a[higerIndex++];
	        }
	 
	        for(int i=0;i<totalItems;i++){
	            a[lowerIndexCursor+i] = (T) tempArray[i];
	        }
	    }
	 
	 
	    public static<T> void mergeDesc(T []a,int lowerIndexCursor,int higerIndex,int upperIndex,Comparator<? super T>comparator){
	        Object []tempArray = getTempArray(a.length);
	        int tempIndex=0;
	        int lowerIndex = lowerIndexCursor;
	        int midIndex = higerIndex-1;
	        int totalItems = upperIndex-lowerIndex+1;
	        while(lowerIndex <= midIndex && higerIndex <= upperIndex){
	            if(comparator.compare(a[lowerIndex],a[higerIndex]) > 0){
	                tempArray[tempIndex++] = a[lowerIndex++];
	            }else{
	                tempArray[tempIndex++] = a[higerIndex++];
	            }
	        }
	 
	        while(lowerIndex <= midIndex){
	            tempArray[tempIndex++] = a[lowerIndex++];
	        }
	 
	        while(higerIndex <= upperIndex){
	            tempArray[tempIndex++] = a[higerIndex++];
	        }
	 
	        for(int i=0;i<totalItems;i++){
	            a[lowerIndexCursor+i] = (T) tempArray[i];
	        }
	    }
	 
	    private static Object[] getTempArray(int length){
	        Object []tempArray = new Object[length];
	        return tempArray;
    }
}
	