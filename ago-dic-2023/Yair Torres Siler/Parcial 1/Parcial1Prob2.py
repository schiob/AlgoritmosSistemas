
def merge_sort(arr):
    if len(arr) <= 1:
        return arr

    mid = len(arr) // 2
    mitIzq = arr[:mid]
    mitDer = arr[mid:]

    mitIzq = merge_sort(mitIzq)
    mitDer = merge_sort(mitDer)

    return merge(mitIzq, mitDer)

def merge(left, right):
    result = []
    i = j = 0

    while i < len(left) and j < len(right):
        if left[i][1] < right[j][1]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1

    result.extend(left[i:])
    result.extend(right[j:])
    return result


n = int(input())
libros = []

for _ in range(n):
    nomLibro, pags = input().split()
    libros.append((nomLibro, int(pags)))


sortlibros = merge_sort(libros)


for libro in sortlibros:
    print(libro[0])




