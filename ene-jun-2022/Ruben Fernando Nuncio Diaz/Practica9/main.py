def countingSort(inputArray):
    maxEl = max(inputArray)

    countArrayLength = maxEl+1

    countArray = [0] * countArrayLength


    for el in inputArray:
        countArray[el] += 1


    for i in range(1, countArrayLength):
        countArray[i] += countArray[i-1]

    # Step 3 -> Calculate element position
    # based on the countArray values
    outputArray = [0] * len(inputArray)
    i = len(inputArray) - 1
    while i >= 0:
        currentEl = inputArray[i]
        countArray[currentEl] -= 1
        newPosition = countArray[currentEl]
        outputArray[newPosition] = currentEl
        i -= 1

    return outputArray


n = int(input(""))

a = list(map(int, input("").strip().split()))[:n]

arrayOrdenado = countingSort(a)

print(arrayOrdenado)
