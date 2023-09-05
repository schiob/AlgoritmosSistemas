entrada = input("Introduce dos enteros separados por un espacio: ")

numeros = entrada.split()

if len(numeros) != 2:
    print("Por favor, ingresa dos enteros separados por un espacio.")
else:
    try:
        numero1 = int(numeros[0])
        numero2 = int(numeros[1])
        
        suma = numero1 + numero2
        
        print("Resultado:", suma)
    except ValueError:
        print("Error: Asegúrate de ingresar dos enteros válidos.")
2