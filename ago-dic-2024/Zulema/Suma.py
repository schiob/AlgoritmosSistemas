def main():
    while True:
        # Solicitar la entrada del usuario
        entrada = input("Introduce dos números enteros separados por un espacio (o escribe 'salir' para terminar): ")
        
        # Comprobar si el usuario quiere salir
        if entrada.lower() == 'salir':
            print("Programa terminado.")
            break
        
        # Dividir la entrada en partes
        partes = entrada.split()
        
        # Verificar que haya exactamente dos partes
        if len(partes) == 2:
            try:
                # Convertir las partes a enteros
                a = int(partes[0])
                b = int(partes[1])
                
                # Calcular la suma
                suma = a + b
                
                # Imprimir el resultado
                print(f"La suma es: {suma}")
            except ValueError:
                print("Por favor, ingresa solo números enteros.")
        else:
            print("Entrada inválida. Asegúrate de ingresar exactamente dos números enteros.")
            
if __name__ == "__main__":
    main()
