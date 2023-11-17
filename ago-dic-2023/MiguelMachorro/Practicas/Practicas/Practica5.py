def mergeSort(arr):
    if len(arr) <= 1:
        return arr
    
    # Divide el problema en subproblemas
    middle = len(arr) // 2
    arrIzq = arr[:middle]
    arrDer = arr[middle:]

    # Resuelve de forma recursiva
    izqOrdenado = mergeSort(arrIzq)
    derOrdenado = mergeSort(arrDer)

    # Junta ambas partes
    finalOrdenado = junta(izqOrdenado, derOrdenado)
    return finalOrdenado

def junta(izq, der):
    res = []
    apu_izq = 0
    apu_der = 0

    while apu_izq < len(izq) and apu_der < len(der):
        if len(izq[apu_izq]) <= len(der[apu_der]):
            res.append(izq[apu_izq])
            apu_izq += 1
        else:
            res.append(der[apu_der])
            apu_der += 1

    while apu_izq < len(izq):
        res.append(izq[apu_izq])
        apu_izq += 1
    
    while apu_der < len(der):
        res.append(der[apu_der])
        apu_der += 1

    return res

# Solicitar al usuario que ingrese los nombres de los dinosaurios
entrada = input("Ingresa los nombres de los dinosaurios separados por espacio: ")

# Convertir la entrada en una lista de nombres de dinosaurios
nombres_dinosaurios = entrada.split()

# Ordenar la lista de nombres de dinosaurios por longitud usando mergeSort
dinosaurios_ordenados = mergeSort(nombres_dinosaurios)

# Imprimir la lista ordenada
print("Lista Original:", entrada)
print("Lista Ordenada:", " ".join(dinosaurios_ordenados))
