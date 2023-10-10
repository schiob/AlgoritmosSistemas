def priemra_parte_dividir(arr):
    if len(arr) == 1:
        return arr

    mid = len(arr) // 2

    izquierda = arr[:mid]
    derecha = arr[mid:]

    izquierda = priemra_parte_dividir(izquierda)
    derecha = priemra_parte_dividir(derecha)

    izquierda_2 = izquierda
    derecha_2 = derecha
    resultado = []

    apuntador_iquierda = 0
    apuntador_derecha = 0

    while apuntador_iquierda < len(izquierda_2) and apuntador_derecha < len(derecha_2):
        if izquierda_2[apuntador_iquierda] < derecha_2[apuntador_derecha]:
            resultado.append(izquierda_2[apuntador_iquierda])
            apuntador_iquierda += 1
        else:
            resultado.append(derecha_2[apuntador_derecha])
            apuntador_derecha += 1

    resultado += izquierda_2[apuntador_iquierda:]
    resultado += derecha_2[apuntador_derecha:]

    return resultado


numero_libros = int(input("Ingrese el numero de libros que tiene Juan: "))
nombre = []
numeros = []

for i in range(numero_libros):
    dato = input(
        "Ingrese el nombre y las paguinas que tiene el libro , separelas por un espacio:  "
    ).split()

    nombre.append(dato[0])
    paguinas = int(dato[1])

    numeros.append(paguinas)
numeros_ordenados = priemra_parte_dividir(numeros)
nombres_ordenados = []
for i in range(numero_libros):
    for j in range(numero_libros):
        if numeros_ordenados[i] == numeros[j] and not nombre[j] in nombres_ordenados:
            nombres_ordenados.append(nombre[j])
            break


print(*nombres_ordenados)
