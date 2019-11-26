def binarysearch(arr,inicio,fin,x):
    if inicio > fin:
        return-1 #determina que no lo hemos encontrado
    mid= (inicio+fin)//2
    if arr[mid][0]==x:
        return mid
    if x > arr[mid][0]:
        return binarysearch(arr, inicio,mid-1,x)##regresar lo que me da + mid
    else:
        return binarysearch(arr,mid+1, fin, x)



n,m=input().split()
n,m=int(n),str(m)

consolas=[]
for i in range (n):
    line= input().split()
    device=line[0]
    cost= int(line[1])
    product=[device,cost]

    consolas.append(product)


if __name__== "__main__":

    print((consolas))
    print(binarysearch(consolas,0,len(consolas)-1,m))