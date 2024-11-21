def counting_sort(n, numeros):
    max_num = max(numeros)  
    count = [0] * (max_num + 1)  
    
    for numero in numeros:
        count[numero] += 1  
    
    sorted_list = []
    for i in range(len(count)):
        sorted_list.extend([i] * count[i])  
    
    return sorted_list

# Ejemplo de uso:
n = 6
numeros = [7, 5, 15, 3, 6, 1]
resultado = counting_sort(n, numeros)
print(" ".join(map(str, resultado)))
