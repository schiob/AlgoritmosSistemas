def busqueda_secuencia(lista,valor):
    posicion = 0
    encontrado=False
    while posicion<len(lista)and not encontrado:
        if lista[posicion]== valor:
            encontrado= True
        else:
            posicion+=1
    return encontrado,posicion


lista=[[[[[[[569,734,458,405,450]for m in range(10)]for z in range(5)]for a in range(10)]for l in range(3)]for k in range(3)]for i in range(5)]
llave=569
print(busqueda_secuencia(lista,llave))