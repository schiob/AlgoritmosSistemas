def Merge(sorted_left_array, sorted_right_array):
    arr_resultado = []
    while len(sorted_left_array) > 0 and len(sorted_right_array) > 0:
        if sorted_left_array[0] > sorted_right_array[0]:
            arr_resultado.append(sorted_right_array[0])
            sorted_right_array.pop(0)
        else:
            arr_resultado.append(sorted_left_array[0])
            sorted_left_array.pop(0)
    
    while len(sorted_left_array) > 0:
        arr_resultado.append(sorted_left_array[0])
        sorted_left_array.pop(0)

    while len(sorted_right_array) > 0:
        arr_resultado.append(sorted_right_array[0])
        sorted_right_array.pop(0)
    
    return arr_resultado

def mergeSort(arr):
    if len(arr) == 1:
        return arr

    middle = len(arr) // 2
    left_array = arr[:middle]
    right_array = arr[middle:]

    sorted_left_array = mergeSort(left_array)
    sorted_right_array = mergeSort(right_array)

    return Merge(sorted_left_array, sorted_right_array)



arr = [1, 4,56,564,2,7,321,12,56,568,32,23,567,568,2,21,753,6]
arrNombre = ["mipeli1", "peli2", "peli3"]

print(arr)
arr2 = mergeSort(arr, arrNombre)
print(arr2)