def valores(cartas):
    valores={'A':1,'2':2,'3':3,'4':4,'5':5,'6':6,'7':7,'8':8,'9':9,'T':10,'J':11,'Q':12,'K':13,}
    return valores[cartas[0]]

def mergesort(arr):
    
    if len(arr)==1:
        return manos

    middle= len(arr) // 2
    arr_izq=arr[:middle]
    arr_der=arr[middle:]

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

    #valores={'A':1,'2':2,'3':3,'4':4,'5':5,'6':6,'7':7,'8':8,'9':9,'T':10,'J':11,'Q':12,'K':13,}



    while idx_izq<len(arr_izq) and idx_der<len(arr_der):
        
        if valores(arr_izq[idx_izq]) < valores(arr_der[idx_der]):
            arr_merge.append(arr_izq[idx_izq])
            idx_izq+=1
        elif valores(arr_izq[idx_izq] > valores(arr_der[idx_der])):
            arr_merge.append(arr_der[idx_der])
            idx_der+=1
        
        else:
            if arr_izq[idx_izq[1]] < arr_der[idx_der[1]]:
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

    n=int(input("Ingrese la cantidad de manos a ordenar"))

    manos=[]

    

    for i in range(n):

        m=int(input(("Ingrese la cantidad lineas de manos:")))

        arr=str(input("Ingrese las manos:"))

        lineas_manos=list(map(str,arr.split()[:m]))

        manos.append(lineas_manos)

    print(lineas_manos)

    print(mergesort(manos))





