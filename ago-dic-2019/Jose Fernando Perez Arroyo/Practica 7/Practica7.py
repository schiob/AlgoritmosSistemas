def quickSort(ar): 
    if len(ar) <= 1: 
        return ar 
    else: 
        mid = len(ar)//2
        pivot = ar[mid] 
        Inicio,Fin = [],[] 
        for indx, val in enumerate(ar): 
            if indx != mid: 
                if val < pivot: 
                    Inicio.append(val) 
                elif val > pivot: 
                    Fin.append(val)  
                else: 
                    if indx < mid: 
                        Inicio.append(val) 
                    else: 
                        Fin.append(val) 
        return quickSort(Inicio)+[pivot]+quickSort(Fin)

def binarySearch (arr, l, r, x): 

    if r >= l: 
  
        mid = l + (r - l)//2

        if arr[mid] == x: 
            return mid 

        elif arr[mid] > x: 
            return binarySearch(arr, l, mid-1, x) 
        else: 
            return binarySearch(arr, mid + 1, r, x) 
  
    else: 
        return -1



arr= input().split()
a=int(arr[0])
b= int(arr[1])

gmed=[]
gbus=[]

arr2= input().split()
for i in range(a):
     gmed.append(i)

quickSort(gmed)

for j in range(b):
    jo=input()
    gbus.append(jo)


for f in range (len(gbus)):
 result= binarySearch(gmed, 0, len(gmed)-1, gbus[f])
 print (result)