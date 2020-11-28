def algor(palab,arr):
    i=0
    F=False
    while i < len(arr) and not F:
        if arr[i]  == palab:
            F = True
            i = i +1
    return i



entrada = input().split()
palab = entrada[1]
cant = int(entrada[0])
print(cant)
arr = []
for i in range(cant):
    articulo = input().split()
    arr.append([articulo[0]])

algor(palab, arr)
print(algor(palab,articulos))
