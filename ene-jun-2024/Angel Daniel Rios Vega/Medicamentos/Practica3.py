def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if len(arr[j]) > len(arr[j+1]):
                arr[j], arr[j+1] = arr[j+1], arr[j]

# Solicitar al usuario ingresar la cantidad de medicamentos y sus nombres
n = int(input("Ingrese el número de medicamentos: "))
medicamentos = []
for i in range(n):
    medicamento = input("Ingrese el nombre del medicamento {}: ".format(i+1)).strip()
    medicamentos.append(medicamento)

# Ordenar los medicamentos
bubble_sort(medicamentos)

# Mostrar los medicamentos ordenados
print("\nMedicamentos ordenados:")
for medicamento in medicamentos:
    print(medicamento)