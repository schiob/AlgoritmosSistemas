def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key

def problemas_resueltos(n, m, tiempos):
    insertion_sort(tiempos)
    
    # Mostrar la lista ordenada
    print("Lista ordenada:", tiempos)

    contador = 0
    tiempo_total = 0
    
    for tiempo in tiempos:
        if tiempo_total + tiempo <= m:
            tiempo_total += tiempo
            contador += 1
        else:
            break
    
    return contador

# Leer la entrada
entrada = input("Ingresa el número de problemas y minutos disponible: ").strip().split()
n = int(entrada[0])
m = int(entrada[1])
tiempos = list(map(int, input("Ingresa los tiempos para cada problema: ").strip().split()))

# Obtener la cantidad de problemas que David puede resolver
resultado = problemas_resueltos(n, m, tiempos)

# Imprimir el resultado
print("Problemas que puede resolver:", resultado)
