#Carlitos tiene una lista con n enteros representando el poder de cada Pokémon (CP). 
#Y como tú eres su amigo que le sabe a eso de las compus 
#te pidió que hicieras un programa que le regrese la una lista de los pokemons de mayor a menor.

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