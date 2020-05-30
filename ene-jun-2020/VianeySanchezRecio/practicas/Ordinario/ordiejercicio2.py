def BinarySearch (arr, l, r, x): 

    if r >= l: 

        mid = l + (r - l)//2

        if arr[mid] == x: 
            return mid 

        elif arr[mid] > x: 
            return BinarySearch(arr, l, mid-1, x) 
        else: 
            return BinarySearch(arr, mid + 1, r, x) 

    else: 
        return -1


n,m=input().split()
n,m=int(n),str(m)

articulos=[]
for i in range (n):
    linea= input().split()
    device=linea[0]
    precio= int(linea[1])
    product=[device,precio]

    articulos.append(product)

    print((articulos))
    print(BinarySearch(articulos,0,len(articulos)-1,m)) 