class InsertSort:
    arreglo=[6,8,6,9,54,4,88,10]
    
    for i in range(0,len(arreglo)):
        actual=arreglo[i]

        fin=0
        for x in reversed(range(0,i)):
            if arreglo[x]>actual:
                arreglo[x+1]=arreglo[x]
            else:
                fin=x+1
                break
        arreglo[fin]=actual
    print(arreglo)