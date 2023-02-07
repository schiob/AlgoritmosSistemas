def ordenando(arr):
    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            if arr[i] < arr[j]:
                arr[i], arr[j] = arr[j], arr[i]

    print(arr)

def main():
    # 3 43 2 5 4 6 5 4 334 45 23 123 323 45 34 23 43 5 46 78

    inp = (input('Dame los numeros :')).split()     # Convierte el String de entrada en una lista
    arr = [int(item) for item in inp if int(item)%2 == 0]   # Crea la lista de numeros pares
    
    ordenando(arr)   # Imprime lista descendente

main()