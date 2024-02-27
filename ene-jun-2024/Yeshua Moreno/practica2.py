def selection(arr):
    for i in range(len(arr)):
        variabletemp = i
        for j in range(i + 1, len(arr)):
            if arr[j] < arr[variabletemp]:
                variabletemp = j

            arr[i], arr[variabletemp] = arr[variabletemp], arr[i]

    return arr

arr=[10, 6, 4, 2, 3, 7, 5, 1, 2, 1, 3, 2]
print(arr)
print(selection(arr))
print("Hola, una disculpa con la tardanza, me estaba peleando con el commit >:v, otra vez :((")