numero_de_pokemones = int(input("Ingrese el numero de pokemones (debe ser mayor o igual a 1 pero menor o igual a 2000): "))

if 1 <= numero_de_pokemones <= 2000:
    valor_de_poke = input("Ingrese los " + str(numero_de_pokemones) + " pokemones: ")
    
    # Dividir la cadena y convertir los elementos a enteros
    arreglo = [int(pokemon) for pokemon in valor_de_poke.split()]
    
    print("Los pokemones ingresados son:", arreglo)
else:
    print("No cumpliste con los requisitos (debe ser mayor o igual a 1 pero menor o igual a 2000).")

for primera_parte in range(len(arreglo)):
    numero = arreglo[primera_parte]
    numero_grande = arreglo[primera_parte]
    posicion = primera_parte
    for segunda_parte in range(primera_parte, len(arreglo)):
        if numero < arreglo[segunda_parte]:
            numero = arreglo[segunda_parte]
            posicion = segunda_parte
    arreglo[primera_parte] = numero
    arreglo[posicion] = numero_grande
print(arreglo)
