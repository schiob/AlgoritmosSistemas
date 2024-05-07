
def mergesortolimpiadas(arr):
    if len(arr) == 1:
        return arr
    mid = len(arr)//2
    arr_izq = arr[0:mid]
    arr_der = arr[mid:len(arr)]
    arr_izq_ord = mergesortolimpiadas(arr_izq)
    arr_der_ord = mergesortolimpiadas(arr_der)
    arr_ord = fusionar(arr_izq_ord,arr_der_ord)
    arr = arr_ord
    return arr

def fusionar(arr_izq, arr_der):
    arr_ord = []
    i = 0
    j = 0
    while i < len(arr_izq) and j < len(arr_der):
        if arr_izq[i][1] > arr_der[j][1]:
                arr_ord.append(arr_izq[i])
                i+=1
        elif arr_izq[i][1] < arr_der[j][1]:
                arr_ord.append(arr_der[j])
                j+=1
        else:
            if arr_izq[i][2] > arr_der[j][2]:
                arr_ord.append(arr_izq[i])
                i+=1
            elif arr_izq[i][2] < arr_der[j][2]:
                arr_ord.append(arr_der[j])
                j+=1
            else:
                if arr_izq[i][3] > arr_der[j][3]:
                    arr_ord.append(arr_izq[i])
                    i+=1
                elif arr_izq[i][3] < arr_der[j][3]:
                    arr_ord.append(arr_der[j])
                    j+=1
                else:
                    if arr_izq[i][0] < arr_der[j][0]:
                        arr_ord.append(arr_izq[i])
                        i+=1
                    elif arr_izq[i][0] > arr_der[j][0]:
                        arr_ord.append(arr_der[j])
                        j+=1
    arr_ord+=arr_izq[i:]
    arr_ord+=arr_der[j:]
    return arr_ord

if __name__ == "__main__":
    numcomp = int(input("Ingrese el numero de competidores: "))
    competidores = []
    medallas = []
    for i in range(numcomp):
        competidores.append(str(input("Ingrese su nombre y la cantidad de medallas ganadas separadas con espacio (primero oro, luego plata y al final bronce):")))
    for i in range(numcomp):
        medallas.append(competidores[i].split())
        """print(medallas[i])
        print(medallas[i][0])
        print(medallas[i][1])"""
    print(competidores)
    medallasord = mergesortolimpiadas(medallas)
    for i in range(numcomp):
        print((i+1),".-",medallasord[i][0])
