#implementación de quicksort, y binary search
#nota no se muestra como en el ejemplo este codigo te marca el 0 el 1 y el -1 depues de la medicina

n, q = map(int, input().split())
medicamentos = input().split()
medicamentos.sort()

for i in range(q):
    medicamento_buscado = input().strip()
    izquierda = 0
    derecha = n - 1
    while izquierda <= derecha:
        medio = (izquierda + derecha) // 2
        if medicamentos[medio] == medicamento_buscado:
            print(medio)
            break
        elif medicamentos[medio] < medicamento_buscado:
            izquierda = medio + 1
        else:
            derecha = medio - 1
    else:
        print(-1)
