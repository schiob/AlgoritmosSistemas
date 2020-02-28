def insertionSort(arr): 
    for i in range(1, len(arr)): 
        key = arr[i] 
        j = i-1
        while j >=0 and key > arr[j] : #si la key es menor los ordenaras de menor a mayor, si es mayor de mayor a menor
                arr[j+1] = arr[j] 
                j -= 1
        arr[j+1] = key 
n=input().split(" ")
arr= [int(i) for i in n]
insertionSort(arr)
for i in range(len(arr)):
    if arr[i] %2==0:
        print (arr[i], end=" ")