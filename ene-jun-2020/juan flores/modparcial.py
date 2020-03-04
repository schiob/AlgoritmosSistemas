def bubblesort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j][1] == arr[j+1][1]:
                if arr[j][0] > arr[j+1][0]:
                    arr[j], arr[j+1] = arr[j+1], arr[j]
            elif arr[j][1] > arr[j+1][1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

n = int(input())
arr = []
for i in range(n):
    pelis = input().split()
    tiempo = pelis[1]*60+pelis[2]
    arr.append([pelis[0],tiempo])
    
bubblesort(arr)
print(" ".join(x[0] for x in arr))

