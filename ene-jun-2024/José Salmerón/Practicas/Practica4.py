
def mergesortcartas(arr):
    if len(arr) == 1:
        return arr
    mid = len(arr)//2
    arr_izq = arr[0:mid]
    arr_der = arr[mid:len(arr)]
    arr_izq_ord = mergesortcartas(arr_izq)
    arr_der_ord = mergesortcartas(arr_der)
    arr_ord = fusionarcartas(arr_izq_ord,arr_der_ord)
    arr = arr_ord
    return arr

def fusionarcartas(arr_izq, arr_der):
    arr_ord = []
    i = 0
    j = 0
    while i < len(arr_izq) and j < len(arr_der):
        if arr_izq[i][0] == arr_der[j][0]:
            if arr_izq[i][1] == "E":
                arr_ord.append(arr_izq[i])
                i+=1
            elif arr_der[j][1] == "E":
                arr_ord.append(arr_der[j])
                j+=1
            elif arr_izq[i][1] == "C":
                arr_ord.append(arr_izq[i])
                i+=1
            elif arr_der[j][1] == "C":
                arr_ord.append(arr_der[j])
                j+=1
            elif arr_izq[i][1] == "T":
                arr_ord.append(arr_izq[i])
                i+=1
            elif arr_der[j][1] == "T":
                arr_ord.append(arr_der[j])
                j+=1
            elif arr_izq[i][1] == "D":
                arr_ord.append(arr_izq[i])
                i+=1
            elif arr_der[j][1] == "D":
                arr_ord.append(arr_der[j])
                j+=1
        elif arr_izq[i] < arr_der[j]:
            if "A" in arr_der[j]:
                arr_ord.append(arr_der[j])
                j+=1
            else:
                arr_ord.append(arr_izq[i])
                i+=1
        else:
            if "A" in arr_izq[i]:
                arr_ord.append(arr_izq[i])
                i+=1
            else:
                arr_ord.append(arr_der[j])
                j+=1
    arr_ord+=arr_izq[i:]
    arr_ord+=arr_der[j:]
    return arr_ord

if __name__ == "__main__":
    Cartas = []
    NumCartas = []
    Manos = int(input("Ingrese la cantidad de manos: "))
    for i in range(Manos):
        Cartas.append(str(input("Ingrese el número de cartas de la mano y las cartas que la conforman (Separe todo con un espacio): ")))
    
    for i in range(Manos):
        NumCartas.append(Cartas[i].split())
        print(NumCartas[i][0])

    for i in range(Manos):
        CartasOrd = []
        for h in range(1,len(NumCartas[i])):
            CartasOrd.append(NumCartas[i][h])
        print("Mano antes de ordenar:")
        print(CartasOrd)
        print("Mano despues de ordenar:")
        print(mergesortcartas(CartasOrd))