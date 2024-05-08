#Olimpiada Pumas.

def mergesort(arr):
    
    if len(arr)==1:
        return arr

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

    
    while idx_izq < len(arr_izq) and idx_der < len(arr_der):
        if compara(arr_izq[idx_izq], arr_der[idx_der]):
            arr_merge.append(arr_izq[idx_izq])
            idx_izq += 1
        else:
            arr_merge.append(arr_der[idx_der])
            idx_der += 1

    while idx_der < len(arr_der):
        arr_merge.append(arr_der[idx_der])
        idx_der += 1

    while idx_izq < len(arr_izq):
        arr_merge.append(arr_izq[idx_izq])
        idx_izq += 1

    return arr_merge

def compara(participante,participante2):

    for i in range(1, 4):  
        if participante[i] > participante2[i]:
            return True
        elif participante[i] < participante2[i]:
            return False

    
    return participante[0] < participante2[0]
        
        



if __name__ == "__main__":
    
    while True:
        n=int(input("Ingrese la cantidad de consursantes:"))
        if 1 <= n <= 500:
            break
        else:
            print("Solo se aceptan numeros del 1 al 500")

    participantes=[]


    for i in range (n):

        s=str(input("Ingrese el nombre del concursante:"))

        
        x, y, z = map(int, input("Ingrese las medallas oro, plata, bronze").split())
        arreglo=s,x,y,z

        participantes.append(arreglo)
        
    
    participantes_sort=mergesort(participantes)
    
    print(participantes_sort)
    
    
    
    
    


        