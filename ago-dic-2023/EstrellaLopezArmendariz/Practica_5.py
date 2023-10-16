dinos=input("Introduce el nombre de los dinosaurios:").split()

def merge_sort(arr):
    if len(arr)==1:
        return arr

    mitad=len(arr)//2
    mitad_izquierda=arr[:mitad]
    mitad_derecha=arr[mitad:]

    mitad_izquierda=merge_sort(mitad_izquierda)
    mitad_derecha=merge_sort(mitad_derecha)

    return merge(mitad_izquierda,mitad_derecha)

def merge(izquierda,derecha):
    resultado=[]
    izq_idx=0
    dere_idx=0

    while izq_idx<len(izquierda) and  dere_idx<len(derecha):
        if len(izquierda[izq_idx])<len(derecha[dere_idx]):
            resultado.append(izquierda[izq_idx])
            izq_idx+=1
        else:
            resultado.append(derecha[dere_idx])
            dere_idx+=1

    resultado.extend(izquierda[izq_idx:])
    resultado.extend(derecha[dere_idx:])
    return resultado

dinos_ordenados=merge_sort(dinos)
print(dinos_ordenados)