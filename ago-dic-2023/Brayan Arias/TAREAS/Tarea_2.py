datos = input("Ingrese los probelas y lo que tarda en hacerlo")
datos = datos.split()
cantidad_de_problemas = int(datos[0])

tiempo = int(datos[1])
probelas_input = input(
    "Ingrese " + str(cantidad_de_problemas) + " problemas separados por espacios: ")
probelas = probelas_input.split()


probelas_enteros = []


for elemento in probelas:
    probelas_enteros.append(int(elemento))
probelas = probelas_enteros


#########################################################
for izquierda_a_derecha in range(len(probelas)):

    for segundo_for in range(izquierda_a_derecha, 0, -1):
        izquierda = segundo_for-1
        derecha = segundo_for
        if probelas[derecha] < probelas[izquierda]:
            menor = probelas[derecha]
            mayor = probelas[izquierda]
            probelas[derecha] = mayor
            probelas[izquierda] = menor
        else:
            break


cantidad_que_puede_resolver = 0

for numero_del_problema in range(len(probelas)):
    if 0 <= (tiempo-probelas[numero_del_problema]):

        tiempo = tiempo-probelas[numero_del_problema]
        cantidad_que_puede_resolver = cantidad_que_puede_resolver+1

    else:
        break
print("catnidad de problemas que puede resolver son:" +
      str(cantidad_que_puede_resolver))
