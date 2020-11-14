def quickSort(arr,inicio_idx,fin_idx):
    if inicio_idx >= fin_idx:
        return

    
    pivote_idx = inicio_idx
    compara = fin_idx

    while compara != pivote_idx:
        if ord[compara] > ord[pivote_idx]:
            if arr[compara] <= arr[pivote_idx]:
                #intercambio
                temp = arr[pivote_idx]
                arr[pivote_idx] = arr[compara]
                arr[compara] = temp

                #intercambio indice
                temp_idx = pivote_idx
                pivote_idx = compara
                copara = temp_idx

        else:
             if ord(arr[compara]) > ord(arr[pivote_idx]):
                #intercambio
                temp = arr[pivote_idx]
                arr[pivote_idx] = arr[compara]
                arr[compara] = temp

                #intercambio indice
                temp_idx = pivote_idx
                pivote_idx = compara
                copara = temp_idx

        if compara > pivote_idx:
            compara -= 1
        else:
            compara += 1
            

    quickSort(arr,inicio_idx,pivote_idx-1)
    quickSort(arr,pivote_idx+1,fin_idx)


def binarySearch (arr, l, r, x): 

    if r >= l: 
  
        mid = l + (r - l) // 2

        if arr[mid] == x: 
            return mid 
       
        elif arr[mid] > x: 
            return binarySearch(arr, l, mid-1, x) 
  
        else: 
            return binarySearch(arr, mid + 1, r, x) 
  
    else: 
        
        return -1


ent = input().split()
cant = ent[0]
busq = ent[1]
entr = input().split
arr = [int(x) for x in entr]
inicio = 0
print(arr)
quickSort(arr, inicio, len(arr)-1)
print(arr)


x = busq
result = binarySearch(arr, 0, len(arr)-1, x) 
  
if result != -1: 
    print (result) 
