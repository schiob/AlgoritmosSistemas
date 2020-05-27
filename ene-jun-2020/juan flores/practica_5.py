def bub_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j][1] < arr[j+1][1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
            elif arr[j][2] < arr[j+1][2] and arr[j][1] == arr[j+1][1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
            elif arr[j][3] < arr[j+1][3] and arr[j][2] == arr[j+1][2]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
            elif arr[j][0] > arr[j+1][0]  and arr[j][3] == arr[j+1][3]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

n = int(input())
c = []

for i in range(n):
    c.append(input().split())

bub_sort(c)
print()
for i in c:
    print(i[0])