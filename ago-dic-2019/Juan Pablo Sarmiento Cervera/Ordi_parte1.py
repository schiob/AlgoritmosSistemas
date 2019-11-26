def mergeSort(arr,rar):
    if len(arr) >1:
        mid = len(arr)//2
        I = arr[:mid]
        D = arr[mid:]
        mergeSort(I,rar)
        mergeSort(D,rar)
        i = j = k = 0        
        while i < len(I) and j < len(D):
            if rar[I[i][1]] < rar[D[j][1]]:
                arr[k] = I[i]
                i+=1
            elif rar[I[i][1]] == rar[D[j][1]] and I[i][0] < D[j][0]:
                arr[k] = I[i]
                i+=1
            else:
                arr[k] = D[j]
                j+=1
            k+=1
        while i < len(I):
            arr[k] = I[i]
            i+=1
            k+=1
        while j < len(D): 
            arr[k] = D[j] 
            j+=1
            k+=1
rar = {"común":1, "especial":2, "épica":3, "legendaria":4}
carta = []
n=int(input())
if n>1 and n<30:
    for i in range(n):
        carta.append(input().split())
        mergeSort(carta,rar)
    for i in carta:
        print()
        print(i[0])
else:
    print("no puedo ordenar un solo valor")