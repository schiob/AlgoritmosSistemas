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
    n,q = map(int, input().split())
    arr = input().split()
    b = []
    for i in range(q):
        l = input()
        b.append(l)
    quickSort(arr, 0, len(arr)-1)
    for k in range(q):
        print(binarySearch(arr, 0, len(arr)-1, b[k]))
