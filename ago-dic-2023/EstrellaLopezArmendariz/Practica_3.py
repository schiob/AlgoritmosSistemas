num_pokemons=int(input("Ingresa el número de pokemons obtenidos:"))
if num_pokemons<1 or num_pokemons>=50:
    print("Número de pokemons inválido")
else:
    puntos = (input("Ingresa los puntos de cada pokemón obtenido:").split())
    puntos = [int(p) for p in puntos]
    
    for i in range(len(puntos)):
        valor_posicion_idx=i
        for j in range(i, len(puntos)):
            if puntos[j]>puntos[valor_posicion_idx]:
                valor_posicion_idx=j
        puntos[i],puntos[valor_posicion_idx]=puntos[valor_posicion_idx],puntos[i]
print(puntos)
