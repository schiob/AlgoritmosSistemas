def mergesort(arr):
    if len(arr) == 1:
        return arr
    
    mitad = len(arr) // 2
    arr1 = arr[0:mitad]
    arr2 = arr[mitad:len(arr)]

    arr1_sorted = mergesort(arr1)
    arr2_sorted = mergesort(arr2)

    original_sorted = unir(arr1_sorted, arr2_sorted)
    return original_sorted

def unir(arr1, arr2):
    resultado = []
    i, j = 0, 0
    while i < len(arr1) and j < len(arr2):
        if arr1[i][1]*60 + arr1[i][2] < arr2[j][1]*60 + arr2[j][2]:
            resultado.append(arr1[i])
            i += 1
        else:
            resultado.append(arr2[j])
            j += 1
    resultado += arr1[i:]
    resultado += arr2[j:]
    return resultado

print("Ingresa el numero de peliculas")
n = int(input())
arr = []
print("Ingresa el nombre de la pelicual, hora y minutos por favor")
for i in range(n):
    nombre, horas, minutos = input().split()
    horas, minutos = int(horas), int(minutos)
    arr.append((nombre, horas, minutos))

sorted_arr = mergesort(arr)
print("El mejor orden para ver las peliculas es:")
for pelicula in sorted_arr:
    print(pelicula[0], end=" ")
