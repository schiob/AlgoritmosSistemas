n, m = map(int, input("Dame el numero de problemas y el tiempo que tienes David\n").split())
arr = list(map(int, input("Cuanto vas a tardar en cada problema David\n").split()))
for i in range(1, len(arr)):
    key = arr[i]
    j = i-1
    while j >=0 and key < arr[j]:
        arr[j + 1] = arr[j]
        j-= 1
    arr[j + 1] = key
count = 0
for i in range(n):
    if m>=arr[i] and m>=0:
        count=count+1
        m=m-arr[i]
print("Andas muy pregunton David, toma tu resultado:\n", count)
