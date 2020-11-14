def Busqueda(arr, x): 
  
    for i in range(len(arr)): 
  
        if arr[i] == x: 
            return i 


n, libro = input().split()
libros = input().split()

print(Busqueda(libros, libro)+1)