def quickSort(arr,start,end):
    #Caso base
    if start>=end:
        return
    
    pivot_idx=start
    primer_mas_grande=start+1

    for i in range (start+1,end+1):
        if arr[i][1]>arr[pivot_idx][1]:
            arr[primer_mas_grande],arr[i]=arr[i],arr[primer_mas_grande]
            primer_mas_grande+=1

    arr[pivot_idx],arr[primer_mas_grande-1]=arr[primer_mas_grande-1],arr[pivot_idx]
    pivot_idx=primer_mas_grande-1

    quickSort(arr,start,pivot_idx-1)
    quickSort(arr,pivot_idx+1,end)


n=int(input("Introduce el número de carros:"))
carros=[]

for _ in range(n):
            entrada=input().split()
            kilometraje=int(entrada[-1]) 
            nombre="".join(entrada[:-1]) 
            carros.append((nombre, kilometraje))

print(carros)
quickSort(carros,0,len(carros)-1)
print(carros)

