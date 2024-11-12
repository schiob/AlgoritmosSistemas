def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n - i - 1):
            if arr[j][1] < arr[j + 1][1]:  
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

n = int(input("Número de medicinas: "))
data = input("Nombre de las medicinas y sus cantidades: ").split()

medicinas = [(data[i], int(data[i + 1])) for i in range(0, 2 * n, 2)]

bubble_sort(medicinas)
resultado = [medicina[0] for medicina in medicinas]
print(" ".join(resultado))