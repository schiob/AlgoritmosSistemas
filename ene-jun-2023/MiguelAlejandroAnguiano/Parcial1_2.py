def main():
    n = int(input())
    peliculas = []
    for _ in range(n):
        nombre, horas, minutos = input().split()
        peliculas.append((nombre, int(horas), int(minutos)))

    merge_sort(peliculas)

    for pelicula in peliculas:
        print(pelicula[0])


def merge_sort(peliculas):
    if len(peliculas) <= 1:
        return peliculas
    mid = len(peliculas) // 2
    left = peliculas[:mid]
    right = peliculas[mid:]
    left_ordenada = merge_sort(left)
    right_ordenada = merge_sort(right)
    return merge(left_ordenada, right_ordenada)

def merge(left, right):
    resultado = []
    i = j = 0
    while i < len(left) and j < len(right):
        if left[i][1]*60 + left[i][2] < right[j][1]*60 + right[j][2]:
            resultado.append(left[i])
            i += 1
        else:
            resultado.append(right[j])
            j += 1

    return resultado

if __name__ == "__main__":
    main()