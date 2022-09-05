arr=[13,38,21,22,9,17,8,28,27,35,1]

def insertShort():
    for i in range(1, len(arr)):
        actual = arr[i]
        j = i-1
        while j >= 0:
            comparar=[j]
            if actual < comparar:
                arr[j+1] = arr[j]
                arr[j] = actual
            else:
                break
        j = j - 1


print(arr)
print(insertShort)
