#Numeros Ordenados con Radix_sort_
def radix_sort(arr):
    max_val=max(arr)
    min_val=1  

    while max_val//min_val>0:
        counting_sort(arr,min_val)
        min_val*=10

def counting_sort(arr,min_val):
    n=len(arr)
    output=[0]*n
    count=[0]*10

    for i in range(n):
        index=arr[i]//min_val
        count[index%10]+=1

    for i in range(1,10):
        count[i]+=count[i-1]

    i=n-1
    while i>=0:
        index=arr[i]//min_val
        output[count[index%10]-1]=arr[i]
        count[index%10]-=1
        i-=1

    for i in range(n):
        arr[i]=output[i]


n=int(input("¿Cuántos números ingresaras?: "))
numeros=input("Introduce tus números separados por un espacio: ").split()
numeros = [int(n) for n in numeros]
radix_sort(numeros)
print("Números ordenados:",numeros)