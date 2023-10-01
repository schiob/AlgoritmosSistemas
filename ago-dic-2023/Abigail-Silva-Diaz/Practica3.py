
n=int(input())
poderes=list(map(int,input().split()))

def OrdenamientoPorSeleccion(arreglo):
    for i in range(len(arreglo)):
        maxi=i
        for j in range(i+1, len(arreglo)):
            if arreglo[j]>arreglo[maxi]:
                maxi=j
        arreglo[i], arreglo[maxi] = arreglo[maxi], arreglo[i]


OrdenamientoPorSeleccion(poderes)
print(*poderes)