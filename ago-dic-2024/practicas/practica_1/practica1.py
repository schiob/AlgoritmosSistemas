entrada = input("Ingresa dos números enteros separados por un espacio: ")

# Dividimos la entrada en dos números
numero1, numero2 = map(int, entrada.split())

# Calculamos la suma
suma = numero1 + numero2

# Mostramos el resultado
print(f"La suma de {numero1} y {numero2} es: {suma}")

