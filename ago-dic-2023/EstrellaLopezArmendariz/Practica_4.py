n=int(input("Introduce el número de palabras: "))
lista=input("Introduce tus palabras: ").split()

#utilizaremos insertion sort
for i in range(len(lista)):
    valor_posicion_idx=i
    for j in range(i, len(lista)):
        if lista[j]<lista[valor_posicion_idx]:
            valor_posicion_idx=j
    lista[i],lista[valor_posicion_idx]=lista[valor_posicion_idx],lista[i]

print(lista)        
