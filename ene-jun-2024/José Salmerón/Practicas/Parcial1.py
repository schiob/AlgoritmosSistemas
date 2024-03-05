
def mergesort(arr):
    if len(arr) == 1:
        return arr
    mid = len(arr)//2
    arr_izq = arr[0:mid]
    arr_der = arr[mid:len(arr)]
    arr_izq_ord = mergesort(arr_izq)
    arr_der_ord = mergesort(arr_der)
    arr_ord = fusionar(arr_izq_ord,arr_der_ord)
    arr = arr_ord
    return arr

def fusionar(arr_izq, arr_der):
    arr_ord = []
    i = 0
    j = 0
    while i < len(arr_izq) and j < len(arr_der):
        if arr_izq[i] < arr_der[j]:
            if "AM" in arr_izq[i] and "12:" not in arr_der[j]:
                arr_ord.append(arr_izq[i])
                i+=1
            else:
                arr_ord.append(arr_der[j])
                j+=1
        else:
            if "AM" in arr_der[j] and "12:" not in arr_izq[i]:
                arr_ord.append(arr_der[j])
                j+=1
            else:
                if "AM" in arr_izq[i]:
                    arr_ord.append(arr_izq[i])
                    i+=1
                else:
                    arr_ord.append(arr_der[j])
                    j+=1
    arr_ord+=arr_izq[i:]
    arr_ord+=arr_der[j:]
    return arr_ord
    
if __name__ == "__main__":
    Relojes = int(input("Ingrese la cantidad de relojes: "))
    Horas = []
    for i in range(Relojes):
        Horas.append(str(input("Ingrese las horas marcadas en cada reloj: ")))
    print(mergesort(Horas))