def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key

n, m = map(int, input("2 numeros enteros separados por espacios n1:problemas que tiene, n2:minutos que tiene disponible: ").split())  
tiempos = list(map(int, input("Tiempo que le toma hacer cada problema: ").split()))  

insertion_sort(tiempos)

tiempo_acumulado = 0
problemas_resueltos = 0

for tiempo in tiempos:
    if tiempo_acumulado + tiempo <= m:
        tiempo_acumulado += tiempo
        problemas_resueltos += 1
    else:
        break

print("Problemas resueltos=: ",problemas_resueltos)
