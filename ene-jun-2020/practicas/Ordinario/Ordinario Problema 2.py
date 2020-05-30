#Entradas
n,s=input().split()
arr=[] #arreglo que use para los productos
arr2=[] #arreglo que use para los valores 
x=0 #variable que use para buscar

for i in range(int(n)):
  r,q=input().split() #mando las entradas a los arreglos
  arr.append(r) 
  arr2.append(int(q))
  if r==s: #con esto saco el valor de NintendoSwitch y mando su precio a una variable
    x=int(q)
#bynary search generico de internet jaja
def binarySearch(arr, l, r, x): 
    while l <= r: 
        mid = l + (r - l) // 2; 
        if arr[mid] == x: 
            return mid +1
        elif arr[mid] < x: 
            l = mid + 1
        else: 
            r = mid - 1
 
    return -1
#mandamos el valor de la variable que usamos antes para buscar dentro del arreglo 2 
result = binarySearch(arr2, 0, len(arr2)-1, x)

if result != -1: 
  #imprimimos si es que existe
    print (result) 
else: 
    print ("Element is not present in array") 