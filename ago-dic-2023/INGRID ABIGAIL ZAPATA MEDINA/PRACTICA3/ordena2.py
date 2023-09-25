def selection_sort(arr):
    n = len(arr)
    i = 0
    while i < n:
        maximo = i
        posicion = i + 1
        while posicion < n:
            if arr[posicion] > arr[maximo]:
                maximo = posicion
            posicion += 1
        arr[i], arr[maximo] = arr[maximo], arr[i]
        i += 1
n = int(input())
if 1 <= n <= 50:
    #lee la lista y la convierte en enteros 
    pokemonsk = input()
    pokemons = list(map(int, pokemonsk.split()))

    # Verificar las condiciones para los valores de pokemons
    if len(pokemons) == n and all(1 <= ni <= 2000 for ni in pokemons):
        # llama la funcion
        selection_sort(pokemons)

        # imprimir
        i = 0
        while i < n:
            print(pokemons[i], end=' ')
            i += 1

    else:
        print("Entrada no válida, los valores deben estar en el rango de 1 a 2000.")
else:
    print("El número de pokemons debe estar en el rango de 1 a 50.")