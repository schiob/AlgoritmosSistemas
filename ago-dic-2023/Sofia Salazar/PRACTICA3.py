#Entrada
print("Ingrese el numero de pokemons para agregar")
n = (input())  
print("Ingrese la fuerza de los pokemos separada por un espacio")
pokemos = list(map(int, input().split()))  
#selection sort
def selection_Sort(n):
    for i in range(len(n)): 
        actual = i
        for j in range(i,len(n)):
            if n[j] < n[actual]:
                actual=j
                n[i], n[actual] = n[actual], n[i]
# Ordenar la lista usando Selection Sort
selection_Sort(pokemos)

# Imprimir la lista ordenada
print("Los pokemons de mayor a menor")
print(pokemos)

