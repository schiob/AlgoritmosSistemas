def InsertionSort(arr):
    for i in range(1, len(arr)):
        actual = arr[i]
        j = i - 1
        while j >= 0 and len(arr[j]) < len(actual):
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = actual

dinos = ["Parasaurolophus", "Oviraptor", "Minmi", "Troodon", "Wannanosaurus"]
InsertionSort(dinos)
print(dinos)
