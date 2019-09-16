k = int(input("Cuantos Dinosaurios quieres ordenar Manuelito?!\n"))     
arr = list(map(str, input("Como se llaman los Dinosaurios?\n").split()))
for i in range(k):
    key = i
    for j in range(i, len(arr)):
        if arr[j] < arr[key]:
            key = j
    temp = arr[i]
    arr[i] = arr[key]
    arr[key] = temp
for m in sorted(arr, key=len):
    print(m, end=" ")