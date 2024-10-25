# Ejercicio numero 2
# Leer el número de medicamentos
n = int(input())

# Leer la lista de medicamentos y sus cantidades
data = input().split()

# Crear una lista de tuplas (medicina, cantidad)
medicinas = [(data[i], int(data[i+1])) for i in range(0, 2*n, 2)]

# Ordenar la lista de mayor a menor según la cantidad de pastillas
medicinas_ordenadas = sorted(medicinas, key=lambda x: x[1], reverse=True)

# Imprimir solo los nombres de las medicinas en el orden correcto
resultado = [medicina[0] for medicina in medicinas_ordenadas]
print(' '.join(resultado))
