def selection_order(arr):
    for i in range(len(arr)):
        valorMin = len(arr[i])
        for x in range(i+1, len(arr)):
            if len(arr[x]) < valorMin: 
                valorMin = len(arr[x])
                arr[x], arr[i] = arr[i], arr[x]  # Intercambiar los nombres de los medicamentos
    #print(arr)

if __name__ == "__main__":
    n = int(input("Ingrese el número de medicamentos: "))

    medicamentos = []
    print("ingrese el nombre de los medicamentos")
    for i in range(n):
        nombre_medicamento = input(())
        medicamentos.append(nombre_medicamento)

    selection_order(medicamentos)
    print("Medicamentos ordenados:", medicamentos)