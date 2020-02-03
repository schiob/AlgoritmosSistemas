def insertionSort(arreglo): 
  
    
    for i in range(1, len(arr)): 
  
        auxiliar = arr[i] 
        j = i-1
        while j >=0 and auxiliar > arr[j] : 
                arr[j+1] = arr[j] 
                j -= 1
        arr[j+1] = auxiliar 
 

#arr = [3,43,2,5,4,6,5,4,334,45,23,123,323,45,34,23,43,5,46,78] 
a=input().split(" ")
arr= [int(x) for x in a]
insertionSort(arr) 
print ("arreglo ordenado") 
for i in range(len(arr)):
    if arr[i ]  % 2 == 0:
        #arr[i] = arr[i]  
     print (arr[i])


    


