def bubble_sort(medicamentos):
    n = len(medicamentos)
    for i in range(n):
        for j in range(0, n-i-1):
            if len(medicamentos[j]) > len(medicamentos[j+1]):
                medicamentos[j], medicamentos[j+1] = medicamentos[j+1], medicamentos[j]

n = int(input())
medicamentos = []
for _ in range(n):
    medicamento = input().strip()
    medicamentos.append(medicamento)

bubble_sort(medicamentos)

for medicamento in medicamentos:
    print(medicamento)