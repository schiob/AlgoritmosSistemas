def mergesort(arr):
    if len(arr) == 1:
        return arr

    middle = len(arr)//2
    arr_izq = arr[:middle]
    arr_der = arr[middle:]

    arr_der_ordenado = mergesort(arr_der)
    arr_izq_ordenado = mergesort(arr_izq)

    arr_ordenado = juntar(arr_izq_ordenado, arr_der_ordenado)
    return arr_ordenado
    
def juntar(arr_izq, arr_der):
    arr_ordenado = [0] * (len(arr_izq)+len(arr_der))
    print(arr_ordenado)
    z = 0
    x = 0
    y = 0
    while z < (len(arr_izq) + len(arr_der)):
            if x < len(arr_izq) and (y >= len(arr_der) or arr_izq[x] < arr_der[y]):
                arr_ordenado[z]=arr_izq[x]
                x+=1
                z+=1
            else:
                arr_ordenado[z]=arr_der[y]
                z+=1
                y+=1
    return arr_ordenado

if __name__ == "__main__":
     arr = [1,3,20,2,50,12]

     print(arr)
     arr_ordenado = mergesort(arr)
     print(arr_ordenado)