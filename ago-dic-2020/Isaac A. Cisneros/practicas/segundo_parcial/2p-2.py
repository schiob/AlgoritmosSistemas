print("Ingresa la cantidad de tazos y el numero serial del tazo, separado por un espacio")
def part(arr,low,high): 
    i = ( low-1 )          
    pivot = arr[high]       
    for j in range(low , high):    
     if arr[j] <= pivot:         
        i = i+1 
        arr[i],arr[j] = arr[j],arr[i]   
    arr[i+1],arr[high] = arr[high],arr[i+1] 
    return ( i+1 ) 
def quickSort(arr,low,high): 
     if low < high:  
        pi = part(arr,low,high)    
        quickSort(arr, low, pi-1) 
        quickSort(arr, pi+1, high)
def binSearch(arr, low, high, y):
    mid = (low + high)//2    
    if low > high:
        return -1
    if arr[mid] == y:
        return mid
    if y < arr[mid]:
        return binSearch(arr, high, mid-1, y)
    else:
        return binSearch(arr, mid+1, low, y)

n, m = map(int, input("").split())
arr = list(map(int, input("").split()))
quickSort(arr, 0, len(arr)-1)
print("el numero de serie del tazo que buscas es:")
print(binSearch(arr, 0, len(arr)-1, m))
