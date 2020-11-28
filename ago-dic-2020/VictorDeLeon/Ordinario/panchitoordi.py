def bubble_sort(arr):
    s = len(arr)
    for i in range(s):
        for j in range(0, n-i-1):
            if arr[j][1] == arr[j+1][1]:
                if arr[j][0] > arr[j+1][0]:
                    arr[j], arr[j+1] = arr[j+1], arr[j]
            elif arr[j][1] > arr[j+1][1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]



entrada = int(input())
arr = []
for i in range(entrada):
    materia = input().split()
    arr.append([materia[1]])


bubble_sort(arr)
print(" ".join(x[0] for x in arr))

