def quicksort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[len(arr) // 2]
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]
    return quicksort(left) + middle + quicksort(right)

def binary_search(arr, x):
    if not arr:
        return -1
    mid = len(arr) // 2
    if arr[mid] == x:
        return mid
    elif arr[mid] > x:
        return binary_search(arr[:mid], x)
    else:
        result = binary_search(arr[mid + 1:], x)
        return result + mid + 1 if result != -1 else -1


NQ=input('INGRESA EL NUMERO DE CANCIONES DE LA PLAYLIST Y EL NUMERO DE CANCIONES A BUSCAR SEPARANDOLAS POR UN ESPACIO\n').split()
N=int(NQ[0])
Q=int(NQ[1])


Can=input('INGRESA LOS NOMBRES DE LAS CANCIONES SEPARADAS POR UNA "," SIN DEJAR ESPACIO ALREDEDOR DE LA "," \n').split(",")
quicksort(Can)
OCan=quicksort(Can)
print('Ingresa los nombres de las canciones a buscar dando enter entre ellas:')

arr=[]

for i in range(0,Q):
    x=input(f'Cancion {i+1}:\n')
    arr.append(x)
    
