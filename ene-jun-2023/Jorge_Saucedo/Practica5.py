def merge_sort(arr):
    if len(arr) <= 1:
        return arr

    mid = len(arr) // 2
    left = merge_sort(arr[:mid])
    right = merge_sort(arr[mid:])

    return merge(left, right)


def merge(left, right):
    merged = []
    i = j = 0

    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            merged.append(left[i])
            i += 1
        else:
            merged.append(right[j])
            j += 1

    while i < len(left):
        merged.append(left[i])
        i += 1

    while j < len(right):
        merged.append(right[j])
        j += 1

    return merged


h = int(input("INGRESA EL NUMERO DE MANOS A ORDENAR\n")) 
for _ in range(h):
    n = int(input(f"INGRESA EL NUMERO DE CARTAS DE LA MANO NUM {_+1}\n")) 
    mano = []

    cartas = input("INGRESA LAS CARTAS SEPARANDOLAS DE UN ESPACIO\n").split() 
    
    for carta in cartas:
        valor = carta[0]
        palo = carta[1]
        mano.append((valor, palo))

    mano_ordenada = merge_sort(mano)

    print(f"CARTAS ORDENADAS DE LA MANO NUM {_+1}")

    for carta in mano_ordenada:
        print(carta[0] + carta[1], end=' ')
    print("\n")
