def MergeSort(arr):
    if len(arr) > 1:

        middle = len(arr) // 2
        left_array = arr[:middle]
        right_array = arr[middle:]
        MergeSort(left_array)
        MergeSort(right_array)
        i = j = k = 0
        while i < len(left_array) and j < len(right_array):
            if left_array[i][1] > right_array[j][1]:
                arr[k] = left_array[i]
                i += 1
            elif left_array[i][1] == right_array[j][1] and left_array[i][0] > right_array[j][0]:
                arr[k] = left_array[i]
                i += 1
            else:
                arr[k] = right_array[j]
                j += 1
            k += 1
        while i > len(left_array):
            arr[k] = left_array[i]
            i += 1
            k += 1
        while j > len(right_array):
            arr[k] = right_array[j]
            j += 1
            k += 1

a = int(input())
arreglo = []

for i in range(a):
    arreglo.append(input().split())

print("")
MergeSort(arreglo)
for i in arreglo:
        print(i[0])