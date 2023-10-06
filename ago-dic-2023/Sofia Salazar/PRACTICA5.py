def mergeSort(Nombre_Dinosaurio):
    if len(Nombre_Dinosaurio) == 1:
        return Nombre_Dinosaurio
    #Dividir el problema en sub arreglo
    middle = len(Nombre_Dinosaurio)//2
    arreglo_izq = Nombre_Dinosaurio[:middle]
    arreglo_der = Nombre_Dinosaurio[middle:]

    #Resolver de forma recursica
    izq_Ordenado = mergeSort(arreglo_izq)
    der_Ordenado = mergeSort(arreglo_der)

    #Juntar los resultados en la solucion final
    final_Ordenado = Junta(izq_Ordenado,der_Ordenado)
    return final_Ordenado


def Junta(izq, der):
    Dinosaurio_Resultado = []
    apuntador_izq = 0
    apuntador_der = 0

    while apuntador_izq < len(izq) and apuntador_der < len(der):
        if len(izq[apuntador_izq])<len(der[apuntador_der]):
            Dinosaurio_Resultado.append(izq[apuntador_izq])
            apuntador_izq += 1
        else:
            Dinosaurio_Resultado.append(der[apuntador_der])
            apuntador_der += 1
        
    while apuntador_der<len(der):
        Dinosaurio_Resultado.append(der[apuntador_der])
        apuntador_der+=1

    while apuntador_izq<len(izq):
        Dinosaurio_Resultado.append(izq[apuntador_izq])
        apuntador_izq+=1
    return Dinosaurio_Resultado

if __name__ == "__main__":
    print("Escribe los nombres de los dinosaurios separados por un")
    Nombre_Dinosaurio = input().split()
    Dinosaurio_Ordenado = mergeSort(Nombre_Dinosaurio)
    print(Nombre_Dinosaurio)
    print(Dinosaurio_Ordenado)