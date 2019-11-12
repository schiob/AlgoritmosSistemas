def partition(arr,low,high): 
    i = ( low-1 )          
    pivot = arr[high]     
  
    for j in range(low , high): 
   
        if   arr[j] <= pivot: 
        
            i = i+1 
            arr[i],arr[j] = arr[j],arr[i] 
  
    arr[i+1],arr[high] = arr[high],arr[i+1] 
    return ( i+1 ) 
                
def quickSort(arr,low,high): 
    if low < high: 
 
        pi = partition(arr,low,high) 
   
        quickSort(arr, low, pi-1) 
        quickSort(arr, pi+1, high)

def binarySearch(arr, inicio, fin, x):

    middle = (inicio + fin)//2
    
    if inicio > fin:
        return -1

    if arr[middle] == x:
        return middle

    if x < arr[middle]:
        return binarySearch(arr, inicio, middle-1, x)
    else:
        return binarySearch(arr, middle+1, fin, x)

if __name__ == "__main__":
    n = input().split()
    arr = input().split()
    quickSort(arr, 0, len(arr)-1)
    print(binarySearch(arr, 0, len(arr)+1, n[1]))

#6 42
#32 231 23 42 90 45

#3




