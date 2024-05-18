def ValorCartas(carta):
    Valores = {'A': 1, '2': 2, '3': 3, '4': 4, '5': 5, '6': 6, '7': 7, '8': 8, '9': 9, 'T': 10, 'J': 11, 'Q': 12, 'K': 13}
    Palos = {'E': 1, 'C': 2, 'T': 3, 'D': 4}
    Valor, Palo = carta[0], carta[1]
    return Valores[Valor], Palos[Palo]

def Comparar(carta1, carta2):
    Valor1, Palo1 = ValorCartas(carta1)
    Valor2, Palo2 = ValorCartas(carta2)
    
    if Valor1 < Valor2:
        return -1
    elif Valor1 > Valor2:
        return 1
    else:
        if Palo1 < Palo2:
            return -1
        elif Palo1 > Palo2:
            return 1
        else:
            return 0

def mergesort(arr):
    if len(arr) <= 1:
        return arr

    middle = len(arr) // 2
    arr_izq = arr[:middle]
    arr_der = arr[middle:]

    arr_izq_ordenado = mergesort(arr_izq)
    arr_der_ordenado = mergesort(arr_der)

    return juntar(arr_izq_ordenado, arr_der_ordenado)

def juntar(arr_izq, arr_der):
    arr_ordenado = []
    x, y = 0, 0

    while x < len(arr_izq) and y < len(arr_der):
        if Comparar(arr_izq[x], arr_der[y]) <= 0:
            arr_ordenado.append(arr_izq[x])
            x += 1
        else:
            arr_ordenado.append(arr_der[y])
            y += 1

    while x < len(arr_izq):
        arr_ordenado.append(arr_izq[x])
        x += 1

    while y < len(arr_der):
        arr_ordenado.append(arr_der[y])
        y += 1

    return arr_ordenado

if __name__ == "__main__":
    print("¿Cuántas manos se ordenarán?")
    manos = int(input())
    arr = []

    print("A continuación, introduzca las cartas de cada mano, comenzando por el valor y luego el palo (por ejemplo, '3E'):")
    for i in range(manos):
        cartas = input("Mano " + str(i+1) + ": ").split()
        arr.append(cartas)
    
    for i in range(manos):
        arr[i] = mergesort(arr[i])
        print("Mano ordenada " + str(i+1) + ": " + ', '.join(arr[i]))
