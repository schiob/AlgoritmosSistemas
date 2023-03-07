def impar():
    enteros = [3, 43, 2, 5, 4, 6, 5, 4, 334, 45, 23, 123, 323, 45, 34, 23, 43, 5, 46, 78]
    acomodado = []

    #Identificador de impares
    for entero in enteros:
        contador = 0
        for n in range(2 , entero+1):
            if entero % n == 0:
                contador += 1

        if contador >= 2 or entero == 2:
            acomodado.append(entero)
    
    #acomodador de menor a mayor
    for i in range(0, len(acomodado)):
        actual = acomodado[i]
        #comparar con todos los anteriores
        #para encontrar el lugar
        idx_final = 0
        for j in reversed(range(0, i)):
            if acomodado[j] > actual:
                acomodado[j+1] = acomodado[j]
            else:
                idx_final = j+1
                break
        acomodado[idx_final] = actual

    #imprimirlos en pantalla
    y = len(acomodado)-1
    while y >= 0 :
   
        print(acomodado[y], end=' ') 
        y = y - 1

if __name__ == "__main__":
    impar()
