 
# Función para hacer ordenación por inserción
def insertionSort(arr): 
  
    # Atraviesa 1 para len (arr)
    for i in range(1, len(arr)): 
  
        key = arr[i] 
        # Mover elementos de arr [0..i-1], que son 
        # mayores que la clave, a una posición adelante 
        # de su posición actual
        j = i-1
        while j >=0 and key < arr[j] : 
                arr[j+1] = arr[j] 
                j -= 1
        arr[j+1] = key 
  # Código de controlador para probar arriba
arr = ["5.- Parasaurolophus", "3.- Oviraptor","1.- Minmi", "2.- Troodon" ,"4.- Wannanosaurus"] 
insertionSort(arr) 
print ("acomodo por nombre mas corto a nombre mas largo") 
for i in range(len(arr)): 
    print (arr[i]) 