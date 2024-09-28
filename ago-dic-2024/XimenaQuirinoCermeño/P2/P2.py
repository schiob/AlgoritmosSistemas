def insertion_sort(arr):
    #Implementación de is
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        #Mover los elementos mayores hacia la derecha
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key
def max_problems(n, m, tiempos):
    #Insertion sort
    insertion_sort(tiempos)
    problemas_resueltos = 0
    tiempo_total = 0
    #Resolver la mayor cantidad de problemas
    for tiempo in tiempos:
        if tiempo_total + tiempo <= m:
            tiempo_total += tiempo
            problemas_resueltos += 1
        else:
            break
    return problemas_resueltos
#Entrada
n, m = map(int, input().split())  # Leer var
tiempos = list(map(int, input().split()))  # Leer los tiempos de los problema
#Resultado
resultado = max_problems(n, m, tiempos)
print(resultado)
