def comparar(concursante1, concursante2):

    if concursante1[1] != concursante2[1]:
        return concursante2[1] - concursante1[1]
    
    if concursante1[2] != concursante2[2]:
        return concursante2[2] - concursante1[2]
    
    if concursante1[3] != concursante2[3]:
        return concursante2[3] - concursante1[3]
    
    return -1 if concursante1[0] < concursante2[0] else 1

def Ordenar(concursantes):
    return sorted(concursantes, key=lambda x: (x[1], x[2], x[3]), reverse=True)

if __name__ == "__main__":
    print("Ingresa el número de concursantes")
    n = int(input())
    concursantes = []
    
    print("Ingresa el nombre de cada uno, y las medallas que ganó, separadas con espacios; el orden será:\nNombre, Oro, Plata, Bronce")
    for _ in range(n):
        nombre, oro, plata, bronce = input().split()
        oro = int(oro)
        concursantes.append((nombre, oro, int(plata), int(bronce)))
    
    Ordenado = Ordenar(concursantes)
    
    print("\nAquí están los concursantes ordenados:\n")
    for concursante in Ordenado:
        print(concursante[0])