def mergesort(arr):
    if len(arr) == 1:
        return
    middle = len(arr) / 2
    arr_izq = arr[:middle]
    arr_Der = arr[middle:]

    mergesort(arr_izq)
    mergesort(arr_Der)

    arr_Ordenado = juntarArreglos (arr_izq,arr_Der)
    return arr_Ordenado

def juntarArreglos(arr1,arr2):
    juntar = []
    i = 0
    x = 0

    while len(juntar) < len(arr1) + len(arr2):
        if i < len(arr1) and (x >= len(arr2) or arr1[i] < arr2[x]):
            juntar.append(arr1[i])
            i += 1
        else:
            juntar.append(arr2[x])
            x += 1
    print(juntar)
    #for i in range (len(arr1)):
    #    for x in range (len(arr2)):
     #   
      #      if arr1[i]<arr2[x]:
       #         menor = arr1[i]
        #        juntar.append[menor]
         #   else:
          #      menor = arr2[x]
           #     juntar.append[menor]    

if __name__ == "__main__":
    arr = [7,867,4,87,894,12,5683,57,6,846,4,8,76]
    numeros1 = [7,3,2,0]
    numeros2 = [1,4,6]
    print(arr)

    juntarArreglos(numeros1,numeros2)

