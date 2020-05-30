def bubbleSort(arr): 
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

def binarySearch (arr, l, r, x):
    if r >= l:
        mid = l+(r-l)//2
        if arr[mid] == x:
            return mid
        elif arr[mid]>x:
            return binarySearch(arr,l,mid-1,x)
        else:
            return binarySearch(arr,mid+1,r,x)
    else:
        return -1

n, q = input().split()
n = int(n)
arr = []
copia = []
for i in range(n):
	arr.append(input().split()[0])
	copia.append(arr[i])
	
bubbleSort(copia)
rel = {}
for i in range(n):
	rel[i] = arr.index(copia[i])
	
print(rel[binarySearch(copia, 0, n-1, q)]+1)