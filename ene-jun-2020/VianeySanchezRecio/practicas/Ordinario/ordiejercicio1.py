def mergeSort(arr,cajas):
    if len(arr) >1:
        mid = len(arr)//2
        L = arr[:mid]
        R = arr[mid:]
        mergeSort(L,cajas)
        mergeSort(R,cajas)
  
        i = j = k = 0
        while i < len(L) and j < len(R):
  if cal[L[i][1]] < cal[R[j][1]]:
                arr[k] = L[i]
                i+=1
            elif cal[L[i][1]] == cal[R[j][1]] +L[i][0] + R[j][0]:
                arr[k] = L[i]
                i+=1
            else:
                arr[k] = R[j]
                j+=1
            k+=1

        while i < len(L):
            arr[k] = L[i]
            i+=1
            k+=1
        while j < len(R): 
            arr[k] = R[j] 
            j+=1
            k+=1

boleto = {"no tiene boleto":x, "si tiene boleto":b}

            line = input().split()
n = int(line[0])
mi = int(line[1])
t=int(line[2])
boleto=int(line[y,x])


oportunidades = []

for i in range(int(input())):
    oportunidades.append(input().split())

mergeSort(oportunidades,cal)

for i in oportunidades:
    print(i)