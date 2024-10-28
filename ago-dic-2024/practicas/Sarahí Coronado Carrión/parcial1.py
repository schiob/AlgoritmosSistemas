#Ejercicio 1
def bubble_sort(arr):
    n= len(arr)
    for i in range(n):
        for j in range(0, n-i-1 ):
            if arr[j]> arr[j+1] :
                arr [j], arr[j+1] = arr[j+1], arr[j]
n=int(input("Número de medicinas: "))
medicinas= list (map(int, input("Nombre de las medicinas: ").split()))
bubble_sort(medicinas)
print(" ".join(map(str, medicinas)))
