
def mergesort(relojes):
    
    if len(relojes)==1:
        return relojes

    middle= len(relojes) // 2
    arr_izq=relojes[:middle]
    arr_der=relojes[middle:]

    print(arr_izq)
    print(arr_der)

    arr_izq_ord=mergesort(arr_izq)
    arr_der_ord=mergesort(arr_der)

    arr_ordenado = juntar(arr_izq_ord,arr_der_ord)
    #print("ord",arr_ordenado)
    return arr_ordenado


def juntar(arr_izq,arr_der):
    arr_merge=[]
    idx_izq=0
    idx_der=0


    while idx_izq<len(arr_izq) and idx_der<len(arr_der):
        
        if arr_izq[idx_izq] < arr_der[idx_der]:
            arr_merge.append(arr_izq[idx_izq])
            idx_izq+=1
        else:
            arr_merge.append(arr_der[idx_der])
            idx_der+=1
    
    while idx_der<len(arr_der):
        arr_merge.append(arr_der[idx_der])
        idx_der+=1

    while idx_izq<len(arr_izq):
        arr_merge.append(arr_izq[idx_izq])
        idx_izq+=1

    

    print("juntar",arr_merge)
    return arr_merge







if __name__ == "__main__":

    

    n=int(input("Ingres la cantidad de relojes que tiene bartolo:"))

    relojes=[]

    print("Ingrese las horas de los relojes")

    for i in range (n):
        horas_relojes=str(input())
        relojes.append(horas_relojes)
    
    #print(relojes)


    print(mergesort(relojes))


