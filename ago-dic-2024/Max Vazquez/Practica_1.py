# Solicitar la entrada del usuario
entrada = input("Introduce dos enteros separados por un espacio: ")

# Dividir la entrada en dos partes y convertirlas a enteros
num1, num2 = map(int, entrada.split())

# Calcular la suma
suma = num1 + num2

# Imprimir el resultado
print("Resultado:", suma)
