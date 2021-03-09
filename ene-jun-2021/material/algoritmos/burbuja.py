arr = [4,3,6,7,6754,33,46,8,5,3,4,6,3,2,7,8,879,12]

print(arr)

i = len(arr)
while i > 1:
    for j in range(0, i-1):
        if arr[j] < arr[j+1]:
            temp = arr[j]
            arr[j] = arr[j+1]
            arr[j+1] = temp

    i -= 1

print(arr)