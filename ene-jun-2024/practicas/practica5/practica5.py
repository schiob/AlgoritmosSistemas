def ordenar_concursantes(concursantes):
    # Ordenar por medallas de oro, plata y bronce, y luego alfabéticamente
    concursantes.sort(key=lambda x: (-x[1], -x[2], -x[3], x[0]))
    return [nombre for nombre, _, _, _ in concursantes]

# Ejemplo de entrada
n = int(input())
concursantes = []
for _ in range(n):
    nombre, oro, plata, bronce = input().split()
    concursantes.append((nombre, int(oro), int(plata), int(bronce)))

# Ordenar y mostrar la lista de concursantes
resultado = ordenar_concursantes(concursantes)
for nombre in resultado:
    print(nombre)
