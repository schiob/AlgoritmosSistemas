def mergeSort(arr): 
    if len(arr) >1: 
        mid = len(arr)//2
        L = arr[:mid] 
        R = arr[mid:]
        mergeSort(L)
        mergeSort(R)
        i = j = k = 0 
        while i < len(L) and j < len(R): 
            if L[i] < R[j]: 
                arr[k] = L[i] 
                i+=1
            else: 
                arr[k] = R[j] 
                j+=1
            k+=1 
        while i < len(L): 
            arr[k] = L[i] 
            i+=1
            k+=1
        while j < len(R): 
            arr[k] = R[j] 
            j+=1
            k+=1

def binarySearch(arr, inicio, fin, x):
    middle = (inicio+fin)//2
    
    if inicio > fin:
        return -1
    if arr[middle] == x:
        return middle
    
    if x < arr[middle]:
        return binarySearch(arr, inicio, middle-1, x)
    else:
        return binarySearch(arr, inicio, middle+1, x)
    

n = input().split()
x = n[1]
arr = input().split()
mergeSort(arr)
print(arr)
print(binarySearch(arr,0,len(arr)-1,x)+1)