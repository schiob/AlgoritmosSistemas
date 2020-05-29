arr=[]
n = int(input())
for i in range(n):
    mkv= input().split()
    arr.append(mkv)

for i in range(n):

    for j in range(0, n-i-1):

        if arr[j][1] < arr[j+1][1]:
            arr[j], arr[j+1] = arr[j+1], arr[j]     

        elif arr[j][1] == arr[j+1][1] and arr[j][2] != arr[j+1][2]:
            if arr[j][2] < arr[j+1][2]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

        elif arr[j][1] == arr[j+1][1] and  arr[j][2] == arr[j+1][2] and arr[j][3] != arr[j+1][3]:
            if arr[j][3] < arr[j+1][3]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

        elif arr[j][1] == arr[j+1][1] and arr[j][2] == arr[j+1][2] and arr[j][3] == arr[j+1][3]:
            if arr[j][0][0] > arr[j+1][0][0]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

for i in arr:
    print(''.join(i[0]))