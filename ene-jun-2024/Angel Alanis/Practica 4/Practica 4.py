def card_value(card):
    values = {'A': 1, '2': 2, '3': 3, '4': 4, '5': 5, '6': 6, '7': 7, '8': 8, '9': 9, 'T': 10, 'J': 11, 'Q': 12, 'K': 13}
    return values[card[0]]

def mergesort(arr):
    if len(arr) == 1:
        return arr
    middle = len(arr) // 2
    arr_izq = arr[:middle]
    arr_Der = arr[middle:]

    arr_izq = mergesort(arr_izq)
    arr_Der = mergesort(arr_Der)

    return juntarArreglos(arr_izq, arr_Der)

def juntarArreglos(arr1, arr2):
    juntar = []
    i = 0
    x = 0

    while i < len(arr1) and x < len(arr2):
        if card_value(arr1[i]) < card_value(arr2[x]):
            juntar.append(arr1[i])
            i += 1
        elif card_value(arr1[i]) > card_value(arr2[x]):
            juntar.append(arr2[x])
            x += 1
        else:
            # Si los valores son iguales, ordena por palo
            if arr1[i][1] < arr2[x][1]:
                juntar.append(arr1[i])
                i += 1
            else:
                juntar.append(arr2[x])
                x += 1

    # Añade los elementos restantes de arr1 y arr2
    juntar.extend(arr1[i:])
    juntar.extend(arr2[x:])

    return juntar

# Lectura de la entrada
n = int(input("ingrese las cartas"))
hands = []
for _ in range(n):
    hand = input().split()[1:]
    hands.append(hand)

# Ordenamiento e impresión de la salida
for hand in hands:
    sorted_hand = mergesort(hand)
    print(' '.join(sorted_hand))
