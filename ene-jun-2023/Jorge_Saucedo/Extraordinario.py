
def binary_search(arr, target):
    low = 0
    high = len(arr) - 1
    while low <= high:
        mid = (low + high) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            low = mid + 1
        else:
            high = mid - 1
    return -1


def quicksort(arr):
    if len(arr) <= 1:
        return arr
    else:
        pivote = arr[0]
        izq = []
        der = []
        for i in range(1, len(arr)):
            if arr[i][1] < pivote[1]:
                izq.append(arr[i])
            else:
                der.append(arr[i])
        return quicksort(izq) + [pivote] + quicksort(der)




n, q = map(int, input('Ingresa el numero de libros en posesion y el numero de libros a buscar separadas de "un espacio"\n').split())

arr = [] 
print('Ingrese los datos del libro: (nombre) (Num de paginas) dando "enter" al terminar la linea')
for i in range(n):
    s, x= input().split()
    x= int(x)
    arr.append((s, x))
Res=quicksort(arr)

ordenada = []

for i in range(len(Res)):
    ordenada.append(Res[i][0])



LibrosBuscar = []
input("Ingresa los nombres de los libros a buscar dando enter entre cada libro: \n")
for i in range(0,q):
    LibrosBuscar.append(input())
print("Arreglo resultante:", LibrosBuscar)

for bus in LibrosBuscar:
    index = binary_search(ordenada, bus)
    if index != -1:
        print(index)
    else:
        print("-1")