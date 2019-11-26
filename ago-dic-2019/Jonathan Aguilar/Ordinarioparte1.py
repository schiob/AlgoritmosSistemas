def mergeSort(arr,rareza):
    if len(arr) >1:
        medio = len(arr)//2
        Izq = arr[:medio]
        der = arr[medio:]
        mergeSort(Izq,rareza)
        mergeSort(der,rareza)
  
        i =0 
        j = 0
        k = 0
        while i < len(Izq) and j < len(der):
            if rareza[Izq[i][1]] < rareza[der[j][1]]:
                arr[k] = Izq[i]
                i+=1
            elif rareza[Izq[i][1]] == rareza[der[j][1]] and Izq[i][0] < der[j][0]:
                arr[k] = Izq[i]
                i+=1
            else:
                arr[k] = der[j]
                j+=1
            k+=1

        while i < len(Izq):
            arr[k] = Izq[i]
            i+=1
            k+=1
        while j < len(der): 
            arr[k] = der[j] 
            j+=1
            k+=1

rareza = {"común":1, "especial":2, "épica":3, "legendaria":4}

cartas = []

for i in range(int(input())):
    cartas.append(input().split())

mergeSort(cartas,rareza)
print("====orden===")
for i in cartas:
    print(i[0])