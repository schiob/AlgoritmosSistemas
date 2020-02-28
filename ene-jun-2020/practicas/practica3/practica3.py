def bubbleSort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if len(arr[j]) > len(arr[j+1]) : #ordenar con strings
                arr[j], arr[j+1] = arr[j+1], arr[j]
#numero de medicamentos
n = int(input())
arr=[]

for i in range(n):
    arr.append(input())
    
bubbleSort(arr)

for i in range(len(arr)):
         print(arr[i])
