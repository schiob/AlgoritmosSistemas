def entrada():
    input('Ingresa el numero de pokemons capturados:')
    areglo=input('Ingresa el poder de cada Pokemon separados por un espacio (CP):')
    arr=areglo.split()
    print(arr)
    bubble_sort(arr)
4
def bubble_sort(areglo):
    n=len(areglo)
    arr=areglo
    # Iterar a través de todos los elementos del array
    for i in range(n):
        # Últimos i elementos ya están ordenados
        for j in range(0, n-i-1):
            # Intercambiar si el elemento encontrado es mayor que el siguiente elemento
            if arr[j] > arr[j+1] :
                arr[j], arr[j+1] = arr[j+1], arr[j]
    return arr

entrada()
