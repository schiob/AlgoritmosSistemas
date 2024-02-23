
def SelectionSortStrings(arreglo):
    for i in range(len(arreglo)):
        minimoactual = len(arreglo[i])
        palabramin = arreglo[i]
        idx = i
        for h in range(i,len(arreglo)):
            if len(arreglo[h]) < minimoactual:
                minimoactual = len(arreglo[h])
                palabramin = arreglo[h]
                idx = h
        arreglo[idx] = arreglo[i]
        arreglo[i] = palabramin
    return arreglo

if __name__ == "__main__":
    arreglo = []
    a = int(input("Ingrese el número de medicamentos: "))
    for i in range (a):
        arreglo.append(str(input("Ingrese el nombre del medicamento:\n")))
    print(SelectionSortStrings(arreglo))
