def algoritmo_insertionSort(a):
    for i in range(1, len(a)):
        n = a[i]
        j = i-1
        while j >=0 and n > a[j] :
                a[j+1] = a[j]
                j -= 1
        a[j+1] = n

numeros=input("Ingrese los numeros\n").split(" ")
a =[int(e) for e in numeros]
algoritmo_insertionSort(a)
print("Numeros pares ordenados (mayor a menor)")
for e in range (len(a)):
     if a[e] % 2 == 0:
          print (a[e], end=" ")

