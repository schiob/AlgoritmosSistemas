def sort(arreglo):
    for i in range(1, len(arreglo)):
        valor_acomparar = arreglo[i]
        j = i - 1
        while j >= 0 and valor_acomparar < arreglo[j]:
            arreglo[j + 1] = arreglo[j]
            j -= 1
        arreglo[j + 1] = valor_acomparar


arreglo = [984, 348, 134, 224, 549,44]
sort(arreglo)
print(" ordenado:", arreglo)
