valor = {"A": 1, "2": 2, "3": 3, "4": 4, "5": 5, "6": 6, "7": 7, "8": 8, "9": 9, "T": 10, "J": 11, "Q": 12, "K": 13}
mano = {"S": 1, "H": 2, "C": 3, "D": 4}


def InsertionSort(arr):
    for i in range(1, len(arr)):
        temp = arr[i]
        j = i - 1
        while j >= 0 and (valor[temp[0]] < valor[arr[j][0]] or (
                valor[temp[0]] == valor[arr[j][0]] and mano[temp[1]] < mano[arr[j][1]])):
            arr[j + 1] = arr[j]
            j = j - 1
            arr[j + 1] = temp
    return


n = int(input())

for i in range(n):
    arr = []
    arr = list(map(str, input().split()))
    arr.pop(0)

    InsertionSort(arr)
    for i in range(len(arr)):
        print(arr[i], end=' ')

    print()