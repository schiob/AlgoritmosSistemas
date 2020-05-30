n,s=input().split(" ")
arr=[] 
arr2=[] 
buscador = 0 

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
for i in range(int(n)):
  N=input().split(" ")
  arr.append(N[0]) 
  arr2.append(int(N[1]))
  if N[0]==N[1]: 
    buscador=int(s)

print(binarySearch(arr2, 0, len(arr2)-1, buscador))