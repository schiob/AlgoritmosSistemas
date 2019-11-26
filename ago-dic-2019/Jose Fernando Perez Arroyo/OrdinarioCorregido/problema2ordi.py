def mergeSort(arr,cal):
    if len(arr) >1:
        mid = len(arr)//2
        L = arr[:mid]
        R = arr[mid:]
        mergeSort(L,cal)
        mergeSort(R,cal)
  
        i = j = k = 0
        while i < len(L) and j < len(R):
            if cal[L[i][1]] < cal[R[j][1]]:
                arr[k] = L[i]
                i+=1
            elif cal[L[i][1]] == cal[R[j][1]] and L[i][0] < R[j][0]:
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

cal = {"común":1, "especial":2, "épica":3, "legendaria":4}

cards = []

for i in range(int(input())):
    cards.append(input().split())

mergeSort(cards,cal)

for i in cards:
    print(i)


'''
14
golem épica
megaesbirro especial
verdugo épica
esqueletos común
bruja épica
bolaDeFuego especial
caballero común
ballesta épica
princesa legendaria
tornado épica
montapuercos especial
bárbaros común
veneno épica
leñador legendaria

bárbaros
caballero
esqueletos
bolaDeFuego
megaesbirro
montapuercos
ballesta
bruja
golem
tornado
veneno
verdugo
leñador
princesa
'''