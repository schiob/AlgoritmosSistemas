def binarysearch(arr,inicio,fin,x):
    if inicio > fin:
        return-1 #determina que no lo hemos encontrado
    mid= (inicio+fin)//2
    if arr[mid]==x:
        return mid
    if x < arr[mid]:
        return binarysearch(arr, inicio,mid-1,x)##regresar lo que me da + mid
    else:
        return binarysearch(arr,mid+1, fin, x)

n,m=input().split()
n,m=int(n),int(m)
arr=[]

for i in range (n):
    s=int(input())
    arr.append(s)

print(binarysearch(arr,0,len(arr)-1,m))