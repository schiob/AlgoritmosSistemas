def merge_sort(lista):
    if len(lista) < 2:
        return lista
    mid = len(lista) // 2 

    izq_lista = merge_sort(lista[:mid])
    dere_lista = merge_sort(lista[mid:])
    return merge(izq_lista, dere_lista)
def merge(izq, dere):
    result = []
    i = j = 0
    while i < len(izq) and j < len(dere):
        if izq[i] < dere[j]:
            result.append(izq[i])
            i += 1
        else:
            result.append(dere[j])
            j += 1
    result += izq[i:]
    result += dere[j:]

    return result

print(merge_sort([[{'Anaranjado-': 34, 'Anaranjado-':44}],[{'Indigo-':3,'Indigo-'0}],[{'Rojo':43}]]))