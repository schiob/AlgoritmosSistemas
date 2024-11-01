def insertion_sort(arr):
   
    for i in range(1, len(arr)):
        llave = arr[i]  
        j = i - 1     
        
        if j >= 0 and arr[j] > llave:
            arr[j + 1] = arr[j]  
            j -= 1  
        
        arr[j + 1] = llave  


arr = [4, 3, 2, 10, 12, 1, 5, 6] 
insertion_sort(arr)  
print(arr)  
