def counting_sort(arr):
    max_val = max(arr)
    count = [0] * (max_val + 1)
    
    for num in arr:
        count[num] += 1
    
    sorted_arr = []
    for i in range(len(count)):
        sorted_arr.extend([i] * count[i])
    
    return sorted_arr

n = int(input("INGRESE LA CANTIDAD DE NUMEROS: "))
arr = list(map(int, input("INGRESEE LOS NUMEROS SEPARADOS POR ESPACIOS: ").split()))
sorted_arr = counting_sort(arr)
print("ORDENADOS")
print(" ".join(map(str, sorted_arr)))